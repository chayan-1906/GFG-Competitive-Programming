package linkedlist.tutorials;

import java.util.HashMap;

public class SinglyLinkedList {

	public static void printSinglyLinkedList(SinglyLinkedListNode head) {
		if (head != null) {
			while (head.next != null) {
				System.out.print ( head.data + " --> " );
				head = head.next;
			}
			System.out.println ( head.data + " --> null" );
		} else {
			System.out.println ( "null..." );
			System.out.println ( "Empty Linked List" );
		}
	}

	public static void printSinglyLinkedListRecursive(SinglyLinkedListNode head) {
		if (head == null) {
			System.out.println ( "null..." );
			System.out.println ( "Empty Linked List" );
			return;
		}
		System.out.print ( head.data + " -- > " );
		if (head.next != null) printSinglyLinkedList ( head.next );
		else System.out.println ( "null" );
	}

	public static SinglyLinkedListNode insertNodeAtBeginning(SinglyLinkedListNode head, int data) {
		printSinglyLinkedList ( head );
		SinglyLinkedListNode newnode = new SinglyLinkedListNode ( data );
		if (head != null) newnode.next = head;
		head = newnode;
		printSinglyLinkedList ( head );
		return head;
	}

	public static SinglyLinkedListNode insertNodeAtEnd(SinglyLinkedListNode head, int data) {
		printSinglyLinkedList ( head );
		SinglyLinkedListNode newnode = new SinglyLinkedListNode ( data );
		SinglyLinkedListNode currentNode = head;
		if (head != null) {
			while (currentNode.next != null) currentNode = currentNode.next;
			currentNode.next = newnode;
		} else head = newnode;
		printSinglyLinkedList ( head );
		return head;
	}

	public static SinglyLinkedListNode deleteFromBeginning(SinglyLinkedListNode head) {
		printSinglyLinkedList ( head );
		if (head != null) {
			SinglyLinkedListNode nodeToBeDeleted = head;
			head = nodeToBeDeleted.next;
			printSinglyLinkedList ( head );
		}
		return head;
	}

	public static SinglyLinkedListNode deleteFromEnd(SinglyLinkedListNode head) {
		printSinglyLinkedList ( head );
		if (head == null || head.next == null) {
			printSinglyLinkedList ( head );
			return head;
		}
		SinglyLinkedListNode nodeToBeDeleted = head;
		while (nodeToBeDeleted.next.next != null) nodeToBeDeleted = nodeToBeDeleted.next;
		nodeToBeDeleted.next = null;
		printSinglyLinkedList ( head );
		return head;
	}

	public static SinglyLinkedListNode insertAtPosition(SinglyLinkedListNode head, int data, int pos) {
		printSinglyLinkedList ( head );
		SinglyLinkedListNode newnode = new SinglyLinkedListNode ( data );
		if (head == null) {
			head = newnode;
			printSinglyLinkedList ( head );
			return head;
		} else if (pos == 1) {
			newnode.next = head;
			head = newnode;
			printSinglyLinkedList ( head );
			return head;
		}
		SinglyLinkedListNode currentNode = head;
		for (int i = 1; i < pos - 1; i++) {
			currentNode = currentNode.next;
			if (currentNode == null) {
				System.out.println ( "Invalid position" );
				return head;
			}
		}
		newnode.next = currentNode.next;
		currentNode.next = newnode;
		printSinglyLinkedList ( head );
		return head;
	}

	public static int searchKey(SinglyLinkedListNode head, int key) {
		if (head == null) {
			printSinglyLinkedList ( head );
			return -1;
		}
		SinglyLinkedListNode currentNode = head;
		for (int i = 1; currentNode != null; i++) {
			if (currentNode.data == key) return i;
			currentNode = currentNode.next;
		}
		return -1;
	}

	public static int searchKeyRecursive(SinglyLinkedListNode head, int key, int pos) {
		if (head == null) return -1;
		else if (head.data == key) return pos;
		else pos = searchKeyRecursive ( head.next, key, pos + 1 );
		return pos;
	}

	public static SinglyLinkedListNode sortedInsert(SinglyLinkedListNode head, int data) {
		printSinglyLinkedList ( head );
		SinglyLinkedListNode newnode = new SinglyLinkedListNode ( data );
		if (head == null) {
			head = newnode;
			printSinglyLinkedList ( head );
			return head;
		}
		SinglyLinkedListNode currentNode = head;
		SinglyLinkedListNode previousNode = head;
		while (currentNode != null && currentNode.data <= newnode.data) {
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		if (currentNode == head) {  // if while loop isn't executed
			if (currentNode.data <= newnode.data) {
				// add node at the end
				currentNode.next = newnode;
			} else {
				// add node at head
				newnode.next = head;
				head = newnode;
			}
			printSinglyLinkedList ( head );
			return head;
		}
		previousNode.next = newnode;
		newnode.next = currentNode;
		printSinglyLinkedList ( head );
		return head;
	}

	public static SinglyLinkedListNode middleOfLinkedList(SinglyLinkedListNode head) {
		printSinglyLinkedList ( head );
		/// TWO TRAVERSALS
		/*if (head == null) return head;
		SinglyLinkedListNode currentNode = head;
		int length = 0;
		while (currentNode != null) {
			length++;
			currentNode = currentNode.next;
		}
		currentNode = head;
		for (int i = 0; i < length / 2; i++) currentNode = currentNode.next;
		printSingleLinkedList ( currentNode );
		return currentNode;
		*/

		/// ONE TRAVERSAL
		SinglyLinkedListNode slowPtr = head;
		SinglyLinkedListNode fastPtr = head;
		while (slowPtr != null && fastPtr != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		printSinglyLinkedList ( slowPtr );
		return slowPtr;
	}

	public static SinglyLinkedListNode nthNodeFromEnd(SinglyLinkedListNode head, int n) {
		if (head == null) {
			printSinglyLinkedList ( null );
			return null;
		} else if (n == 0) {
			System.out.println ( "Invalid position" );
			return null;
		}
		/// TWO TRAVERSALS, ONE POINTER
		/*SinglyLinkedListNode currentNode = head;
		int count = 0;
		while (currentNode != null) {
			count++;
			currentNode = currentNode.next;
		}
		if (n > count) {
			System.out.println ( "Invalid position" );
			return null;
		}
		currentNode = head;
		for (int i = 1; i < count - n + 1; i++) currentNode = currentNode.next;
		System.out.println ( currentNode.data );
		return currentNode;*/

		/// ONE TRAVERSAL, TWO POINTERS
		SinglyLinkedListNode firstPtr = head;
		SinglyLinkedListNode secondPtr = head;
		for (int i = 1; i <= n - 1 && firstPtr != null; i++) firstPtr = firstPtr.next;
		if (firstPtr == null) {
			System.out.println ( "Invalid" );
			return null;
		}
		while (firstPtr.next != null) {
			secondPtr = secondPtr.next;
			firstPtr = firstPtr.next;
		}
		System.out.println ( secondPtr.data );
		return secondPtr;
	}

	public static SinglyLinkedListNode reverseIterative(SinglyLinkedListNode head) {
		printSinglyLinkedList ( head );
		SinglyLinkedListNode currentNode = head;
		SinglyLinkedListNode previousNode = null;
		SinglyLinkedListNode nextNode;
		while (currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		printSinglyLinkedList ( previousNode );
		return previousNode;
	}

	public static SinglyLinkedListNode reverseRecursive(SinglyLinkedListNode currentNode, SinglyLinkedListNode previousNode) {
		if (currentNode == null) return previousNode;
		SinglyLinkedListNode nextNode = currentNode.next;
		currentNode.next = previousNode;
		return reverseRecursive ( nextNode, currentNode );
	}

	public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
		printSinglyLinkedList ( head );
		if (head == null || head.next == null) {
			printSinglyLinkedList ( head );
			return head;
		}
		SinglyLinkedListNode currentNode = head;
		SinglyLinkedListNode previousNode;
		while (currentNode != null) {
			previousNode = currentNode;
			currentNode = currentNode.next;
			if (currentNode != null && previousNode.data == currentNode.data) {
				previousNode.next = currentNode.next;
				currentNode = previousNode;
			}
		}
		printSinglyLinkedList ( head );
		return head;
	}

	public static void deleteNodeWithGivenPointer(SinglyLinkedListNode temp) {
		temp.data = temp.next.data;
		temp.next = temp.next.next;
	}

	public static SinglyLinkedListNode reverseListInKGroup(SinglyLinkedListNode head, int k) {
		SinglyLinkedListNode currentHead = head;
		SinglyLinkedListNode next = null;
		SinglyLinkedListNode previous = null;
		int count = 0;
		while (currentHead != null && count < k) {
			next = currentHead.next;
			currentHead.next = previous;
			previous = currentHead;
			currentHead = next;
			count++;
		}
		if (next != null) head.next = reverseListInKGroup ( next, k );
		return previous;
	}

	public static boolean hasCycle(SinglyLinkedListNode head) {
		/// FLOYD CYCLE DETECTION
		if (head == null || head.next == null) return false;
		SinglyLinkedListNode slowPtr = head;
		SinglyLinkedListNode fastPtr = head.next;
		while (slowPtr != fastPtr) {
			if (fastPtr == null || fastPtr.next == null) return false;
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return true;

		/// HASHING METHOD
		/*HashSet<SinglyLinkedListNode> hashSet = new HashSet<> ( );
		SinglyLinkedListNode currentNode = head;
		while (currentNode != null) {
			if (hashSet.contains ( currentNode )) return true;
			else hashSet.add ( currentNode );
			currentNode = currentNode.next;
		}
		return false;*/
	}

	public static void detectAndRemoveLoop(SinglyLinkedListNode head) {
		/// FLOYD CYCLE DETECTION
		if (head == null || head.next == null) {
			System.out.println ( "No cycle found" );
			return;
		}
		SinglyLinkedListNode slowPtr = head;
		SinglyLinkedListNode fastPtr = head.next;
		while (slowPtr != fastPtr) {
			if (fastPtr == null || fastPtr.next == null) {
				System.out.println ( "No cycle found" );
				return;
			}
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		/// LOOP FOUND AND REMOVING
		slowPtr = head;
		while (slowPtr != fastPtr.next) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next;
		}
		fastPtr.next = null;
	}

	public static SinglyLinkedListNode segregateEvenOdd(SinglyLinkedListNode head) {
		printSinglyLinkedList ( head );
		SinglyLinkedListNode es = null, ee = null, os = null, oe = null;
		for (SinglyLinkedListNode currentNode = head; currentNode != null; currentNode = currentNode.next) {
			int data = currentNode.data;
			if (data % 2 == 0) {
				if (es == null) {
					es = currentNode;
					ee = currentNode;
				} else {
					ee.next = currentNode;
					ee = ee.next;
				}
			} else {
				if (os == null) {
					os = currentNode;
					oe = currentNode;
				} else {
					oe.next = currentNode;
					oe = oe.next;
				}
			}
		}
		if (es == null || os == null) return head;
		ee.next = os;
		oe.next = null;
		printSinglyLinkedList ( es );
		return es;
	}

	public static SinglyLinkedListNode segregateOddEven(SinglyLinkedListNode head) {
		printSinglyLinkedList ( head );
		SinglyLinkedListNode es = null, ee = null, os = null, oe = null;
		for (SinglyLinkedListNode currentNode = head; currentNode != null; currentNode = currentNode.next) {
			int data = currentNode.data;
			if (data % 2 != 0) {
				if (os == null) {
					os = currentNode;
					oe = currentNode;
				} else {
					oe.next = currentNode;
					oe = oe.next;
				}
			} else {
				if (es == null) {
					es = currentNode;
					ee = currentNode;
				} else {
					ee.next = currentNode;
					ee = ee.next;
				}
			}
		}
		if (es == null || os == null) return head;
		oe.next = es;
		ee.next = null;
		printSinglyLinkedList ( os );
		return os;
	}

	public static SinglyLinkedListNode reverseListInPairGroup(SinglyLinkedListNode head) {
		SinglyLinkedListNode currentNode = head;
		SinglyLinkedListNode previous = null;
		SinglyLinkedListNode next = null;
		int count = 0;
		while (currentNode != null && count < 2) {
			next = currentNode.next;
			currentNode.next = previous;
			previous = currentNode;
			currentNode = next;
			count++;
		}
		if (next != null) head.next = reverseListInPairGroup ( next );
		return previous;
	}

	public static SinglyLinkedListNode intersectionOfLinkedLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		/// HASHING METHOD --> TC = O(m+n), SC = O(n)
		/*HashSet<SinglyLinkedListNode> hashSet = new HashSet<> ( );
		SinglyLinkedListNode currentNode = head1;
		while (currentNode != null) {
			hashSet.add ( currentNode );
			currentNode = currentNode.next;
		}
		currentNode = head2;
		while (currentNode != null) {
			if (hashSet.contains ( currentNode )) return currentNode;
			currentNode = currentNode.next;
		}
		return null;*/

		/// TC = O(m+n), SC = O(1)
		int count1 = 0;
		int count2 = 0;
		SinglyLinkedListNode currentHead1 = head1;
		SinglyLinkedListNode currentHead2 = head2;
		while (currentHead1 != null) {
			count1++;
			currentHead1 = currentHead1.next;
		}
		while (currentHead2 != null) {
			count2++;
			currentHead2 = currentHead2.next;
		}
		currentHead1 = head1;
		currentHead2 = head2;
		int absDiff = Math.abs ( count1 - count2 );
		if (count1 > count2) {
			for (int i = 0; i < absDiff; i++) currentHead1 = currentHead1.next;
		} else {
			for (int i = 0; i < absDiff; i++) currentHead2 = currentHead2.next;
		}
		while (currentHead1 != null && currentHead2 != null) {
			if (currentHead1 == currentHead2) return currentHead1;
			currentHead1 = currentHead1.next;
			currentHead2 = currentHead2.next;
		}
		return null;
	}

	public static SinglyLinkedListNode cloneLinkedListRandomPointer(SinglyLinkedListNode head) {
		HashMap<SinglyLinkedListNode, SinglyLinkedListNode> hashMap = new HashMap<> ( );
		for (SinglyLinkedListNode currentNode = head; currentNode != null; currentNode = currentNode.next)
			hashMap.put ( currentNode, new SinglyLinkedListNode ( currentNode.data ) );
		for (SinglyLinkedListNode currentNode = head; currentNode != null; currentNode = currentNode.next) {
			SinglyLinkedListNode cloneCurrentNode = hashMap.get ( currentNode );
			cloneCurrentNode.next = hashMap.get ( currentNode.next );
			cloneCurrentNode.random = hashMap.get ( currentNode.random );
		}
		return hashMap.get ( head );
	}

	public static SinglyLinkedListNode merge2SortedList(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		if (head1 == null) return head2;
		if (head2 == null) return head1;
		SinglyLinkedListNode head;
		SinglyLinkedListNode tail;
		if (head1.data <= head2.data) {
			head = tail = head1;
			head1 = head1.next;
		} else {
			head = tail = head2;
			head2 = head2.next;
		}
		while (head1 != null && head2 != null) {
			if (head1.data <= head2.data) {
				tail.next = head1;
				tail = head1;
				head1 = head1.next;
			} else {
				tail.next = head2;
				tail = head2;
				head2 = head2.next;
			}
		}
		if (head1 == null) tail.next = head2;
		else tail.next = head1;
		return head;
	}

	public static boolean palindromeLinkedList(SinglyLinkedListNode head) {
		printSinglyLinkedList ( head );
		if (head == null || head.next == null) return true;
		/// reverse list after mid-position iteratively
		SinglyLinkedListNode reversedNode = reverseIterative ( middleOfLinkedList ( head ).next );

		/// compare two linked lists
		boolean isPalindrome = true;
		while (reversedNode != null) {
//			System.out.println ( "521: " + head.data + " " + reversedNode.data );
			if (head.data != reversedNode.data) {
				isPalindrome = false;
				break;
			}
			head = head.next;
			reversedNode = reversedNode.next;
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
		SinglyLinkedListNode head = new SinglyLinkedListNode ( 1 );
		SinglyLinkedListNode temp1 = new SinglyLinkedListNode ( 2 );
		SinglyLinkedListNode temp2 = new SinglyLinkedListNode ( 3 );
		SinglyLinkedListNode temp3 = new SinglyLinkedListNode ( 4 );
		SinglyLinkedListNode temp4 = new SinglyLinkedListNode ( 5 );
		SinglyLinkedListNode temp5 = new SinglyLinkedListNode ( 60 );
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		temp4.next = temp5;
		temp5.next = null;

//		printSingleLinkedList ( head );
//		printSingleLinkedListRecursive ( head );
		/**
		 * INSERT AT BEGINNING
		 */
		/*head = insertNodeAtBeginning ( null, 2 );
		head = insertNodeAtBeginning ( head, 32 );
		head = insertNodeAtBeginning ( head, 35 );
		head = insertNodeAtBeginning ( head, 3 );*/

		/**
		 * INSERT AT END
		 */
		/*head = insertNodeAtEnd ( null, 5 );
		head = insertNodeAtEnd ( head, 55 );
		head = insertNodeAtEnd ( head, 25 );
		head = insertNodeAtEnd ( head, 37 );*/

		/**
		 * DELETE FROM BEGINNING
		 */
		/*deleteFromBeginning ( head );
//		deleteFromBeginning ( null );*/

		/**
		 * DELETE FROM END
		 */
		/*deleteFromEnd ( head );
//		deleteFromEnd ( null );*/

		/**
		 * INSERT AT SPECIFIC FROM POS
		 */
		/*insertAtPosition ( head, 5, 6 );
//		insertAtPosition ( null, 5, 6 );*/

		/**
		 * SEARCH FOR A KEY
		 */
		/*//System.out.println ( "10 is at " + searchKey ( head, 10 ) );
//		System.out.println ( "-34 is at " + searchKey ( head, -34 ) );
//		searchKey ( null, 30 );
		printSingleLinkedList ( head );
		System.out.println ( "40 is at " + searchKeyRecursive ( head, 40, 1 ) );
		System.out.println ( "10 is at " + searchKeyRecursive ( head, 10, 1 ) );
		System.out.println ( "-34 is at " + searchKeyRecursive ( head, -34, 1 ) );
		System.out.println ( "30 is at " + searchKeyRecursive ( null, 30, 1 ) );*/

		/**
		 * SORTED INSERT
		 */
		/*sortedInsert ( head, 25 );
//		sortedInsert ( null, 25 );*/

		/**
		 * MIDDLE
		 */
		/*middleOfLinkedList ( head );
//		middleOfLinkedList ( null );*/

		/**
		 * NTH NODE FROM END
		 */
		/*nthNodeFromEnd ( head, 18 );
//		nthNodeFromEnd ( null, 0 );*/

		/**
		 * REVERSE LINKED LIST
		 */
		/*reverseIterative ( head );
//		reverseIterative ( null );
//		System.out.println ( (reverseRecursive ( head, null )) );
//		System.out.println ( reverseRecursive ( null, null ) );*/

		/**
		 * REMOVE DUPLICATES
		 */
		/*removeDuplicates ( head );
//		removeDuplicates ( null );*/

		/**
		 * DELETE NODE WITH ONLY POINTER GIVEN TO IT
		 */

		/**
		 * REVERSE LINKED LIST IN A GROUP OF SIZE K
		 */
        /*printSingleLinkedListRecursive ( head );
        head = reverseListInKGroup ( head, 3 );
//        head = reverseListInKGroup ( null, 5 );
        printSingleLinkedListRecursive ( head );*/

		/**
		 * CHECK LINKED LIST CONTAINS CYCLE
		 */
		/*System.out.println ( hasCycle ( head ) );*/

		/**
		 * CHECK & REMOVE IF LINKED LIST CONTAINS CYCLE
		 */
		/*detectAndRemoveLoop ( head );*/

		/**
		 * SEGREGATE EVEN ODD NODE
		 */
		/*segregateEvenOdd ( head );
//		segregateOddEven ( head );*/

		/**
		 * REVERSE LINKED LIST IN A PAIR OF GROUP
		 */
        /*printSingleLinkedList ( head );
        head = reverseListInPairGroup ( head );
        printSingleLinkedList ( head );*/

		/**
		 * PALINDROME LINKED LIST
		 */
		/*System.out.println ( palindromeLinkedList ( head ) );*/
	}

	public static class SinglyLinkedListNode {
		public int data;

		public SinglyLinkedListNode next;

		public SinglyLinkedListNode random;

		public SinglyLinkedListNode() {
		}

		public SinglyLinkedListNode(int data) {
			this.data = data;
			this.next = null;
			this.random = null;
		}
	}
}

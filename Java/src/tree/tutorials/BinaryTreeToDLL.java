package tree.tutorials;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/video/MTI4NQ%3D%3D
 *
 * @author padmanabhadas
 */
public class BinaryTreeToDLL {

    static Tree.TreeNode previous = null;

    static Tree.TreeNode binaryTreeToDoublyLinkedList(Tree.TreeNode root) {
        if (root == null) return null;
        Tree.TreeNode head = binaryTreeToDoublyLinkedList(root.left);
        if (previous == null) {
            head = root;
        } else {
            root.left = previous;
            previous.right = root;
        }
        previous = root;
        binaryTreeToDoublyLinkedList(root.right);
        return head;
    }
}

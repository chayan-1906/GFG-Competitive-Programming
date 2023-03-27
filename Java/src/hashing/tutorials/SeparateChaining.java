package hashing.tutorials;

import java.util.ArrayList;
import java.util.LinkedList;

public class SeparateChaining {

	int bucketSize;

	ArrayList<LinkedList<Integer>> arrayList;

	public SeparateChaining(int bucketSize) {
		this.bucketSize = bucketSize;
		this.arrayList = new ArrayList<> ( );
		for (int i = 0; i < bucketSize; i++) arrayList.add ( new LinkedList<Integer> ( ) );
	}

	public void insertKey(Integer data) {
		int i = data % bucketSize;
		arrayList.get ( i ).add ( data );
	}

	public boolean searchKey(Integer key) {
		int i = key % bucketSize;
		return arrayList.get ( i ).contains ( key );
	}

	public void deleteKey(Integer data) {
		int i = data % bucketSize;
		arrayList.get ( i ).remove ( data );
	}
}

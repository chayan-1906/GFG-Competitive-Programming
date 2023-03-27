package hashing.tutorials;

public class OpenAddressing {

	int[] array;

	int totalCapacity;

	int currentSize;

	public OpenAddressing(int totalCapacity) {
		this.totalCapacity = totalCapacity;
		array = new int[ totalCapacity ];
		for (int i = 0; i < totalCapacity; i++) array[ i ] = -1;
		this.currentSize = 0;
	}

	int hash(int key) {
		return key % totalCapacity;
	}

	boolean insertKey(int key) {
		if (currentSize == totalCapacity) return false;
		int index = hash ( key );
		while (array[ index ] != -1 && array[ index ] != -2 && array[ index ] != key)
			index = (index + 1) % totalCapacity;
		if (array[ index ] == key) return false;    // duplicate keys are not allowed
		else {
			array[ index ] = key;
			currentSize++;
			return true;
		}
	}

	boolean removeKey(int key) {
		int h = hash ( key );
		int index = h;
		while (array[ index ] != -1) {
			if (array[ index ] == key) {
				array[ index ] = -2;    // deleted key replaced by -2
				return true;
			}
			index = (index + 1) % totalCapacity;
			if (index == h) return false;
		}
		return false;
	}

	boolean searchKey(int key) {
		int h = hash ( key );
		int index = h;
		while (array[ index ] != -1) {
			if (array[ index ] == key) return true;
			index = (index + 1) % totalCapacity;
			if (index == h) return false;
		}
		return false;
	}
}

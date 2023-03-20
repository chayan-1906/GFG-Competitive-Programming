package hashing.problems;

import java.util.HashMap;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Hashing/problem/numbers-containing-1-2-and-32555
public class NumberContaining123 {

	public static void findAll(HashMap<Integer, Integer> mp) {
		for (int i = 1; i <= 1000000; i++) {
			boolean isValid = true;
			int number = i;
			while (number != 0) {
				int remainder = number % 10;
				if (remainder != 1 && remainder != 2 && remainder != 3) isValid = false;
				number /= 10;
			}
			if (isValid) mp.put ( i, 1 );
		}
	}

	public static void main(String[] args) {

	}
}

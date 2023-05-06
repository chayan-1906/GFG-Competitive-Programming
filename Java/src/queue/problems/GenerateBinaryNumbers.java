package queue.problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Queue/problem/generate-binary-numbers-1587115620
public class GenerateBinaryNumbers {

    static ArrayList<String> generate(int N) {
        Queue<String> queue = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        queue.add("1");
        for (int count = 0; count < N; count++) {
            String current = queue.remove();
            arrayList.add(current);
            queue.add(current + "0");
            queue.add(current + "1");
        }
        return arrayList;
    }

    public static void main(String[] args) {
        System.out.println(generate(2));    // 1 10
        System.out.println(generate(3));    // 1 10 11
        System.out.println(generate(5));     // 1 10 11 100 101
    }
}

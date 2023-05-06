package queue.tutorials;

import java.util.LinkedList;
import java.util.Queue;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Queue/video/OTEy
public class GenerateNosWithNDigits {

    public static void generateFirstN(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.add("5");
        queue.add("6");
        for (int count = 0; count < n; count++) {
            String current = queue.remove();
            System.out.println(current);
            queue.add(current + "5");
            queue.add(current + "6");
        }
    }

    public static void main(String[] args) {
        generateFirstN(10);
    }
}

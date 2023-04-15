package mathematics.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Mathematics/problem/absolute-value
public class AbsoluteValue {

    public static int absolute(int I) {
        return I < 0 ? I * (-1) : I;
    }

    public static void main(String[] args) {
        System.out.println(absolute(-32));  // 32
        System.out.println(absolute(45));   // 45
    }
}

package mathematics.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Mathematics/problem/digits-in-factorial
public class DigitsInFactorial {

    public static int digitsInFactorial(int N) {
        double sum = 0;
        for (int i = 1; i <= N; i++) {
            System.out.println(Math.log10(i));
            sum += Math.log10(i);
        }
        return (int) (Math.floor(sum) + 1);
    }

    public static void main(String[] args) {
        System.out.println(digitsInFactorial(5));   // 5! = 120 -> 3
        System.out.println(digitsInFactorial(120));   // 120! -> 199
    }
}

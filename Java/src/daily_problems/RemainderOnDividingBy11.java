package daily_problems;

// https://practice.geeksforgeeks.org/problems/aa8c89caad6b5c3a76ba5e6d65454f77aac3f3543526/1
public class RemainderOnDividingBy11 {

    static int xmod11(String x) {
        // code here
        int remainder = 0;
        for (int i = 0; i < x.length(); i++) {
            int digit = Character.getNumericValue(x.charAt(i));
            remainder = (remainder * 10 + digit) % 11;
        }
        return remainder;
    }

    public static void main(String[] args) {
        System.out.println(xmod11("1345")); // 3
        System.out.println(xmod11("231456786543567898765"));    // 1
    }
}

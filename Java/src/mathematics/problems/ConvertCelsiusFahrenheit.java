package mathematics.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Mathematics/problem/convert-celsius-to-fahrenheit
public class ConvertCelsiusFahrenheit {

    public static double cToF(int C) {
        return C * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        System.out.println(cToF(32));   // 89
        System.out.println(cToF(50));   // 122
    }
}

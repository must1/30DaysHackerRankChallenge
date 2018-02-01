package Day17;

import java.util.Scanner;

class Calculator extends Exception {
    int power(int n, int p) throws IllegalArgumentException {
        int temp = 1;

        if (n >= 0 && p >= 0) {
            for (; p > 0; p--) {
                temp = temp * n;
            }
        } else throw new IllegalArgumentException("n and p should be non-negative");

        return temp;
    }
}

class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

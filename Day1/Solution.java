package Day1;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);

        int a;
        double b;
        String c;

        a = scan.nextInt();
        b = scan.nextDouble();
        scan.nextLine();
        c = scan.nextLine();

        System.out.println(a+i);
        System.out.println(b+d);
        System.out.println(s+c);

        scan.close();
    }
}
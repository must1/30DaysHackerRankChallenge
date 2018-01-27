package Day6;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int T = get.nextInt();

        for (int i = 0; i < T; i++) {
            String S = get.next();
            for (int j = 0; j < S.length(); j++) {
                if (j % 2 == 0) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.print(" ");
            for (int j = 0; j < S.length(); j++) {
                if (j % 2 == 1) {
                    System.out.print(S.charAt(j));
                }


            }
            System.out.println(" ");
        }
    }
}

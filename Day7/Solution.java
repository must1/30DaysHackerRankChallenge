package Day7;

import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) { //2
            arr[i] = in.nextInt(); // 0 - 1; 1 - 2;
        }
        for (int x = n - 1; x >= 0; x--) // " 2222"  x = 1 x = 0
        {
            System.out.print(arr[x] + " ");
        }
        in.close();
    }
}

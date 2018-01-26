package Day11;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int tempSum;
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tempSum = 0;
                tempSum += arr[i][j];
                tempSum += arr[i][j + 1];
                tempSum += arr[i][j + 2];
                tempSum += arr[i + 1][j + 1];
                tempSum += arr[i + 2][j];
                tempSum += arr[i + 2][j + 1];
                tempSum += arr[i + 2][j + 2];

                if (sum < tempSum || i == 0 && j == 0) {
                    sum = tempSum;
                } else {
                    sum = sum;
                }
            }
        }
        System.out.println(sum);
    }
}

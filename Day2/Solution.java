package Day2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        double tip = mealCost*tipPercent*0.01;
        double tax = mealCost*taxPercent*0.01;

        double beforeTotalCost = mealCost+tip+tax;

        int totalCost = (int) Math.round(beforeTotalCost);

        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
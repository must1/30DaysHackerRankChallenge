package Day10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int temp = number;
        int length = 0;
        for (int i = 0; i < number; number = number / 2) {
            length++;
        }
        int bin[] = new int[length];

        for (int i = 0; i < bin.length; i++) {
            bin[i] = temp % 2;
            temp = temp / 2;
        }
        int l = length;

        int max = 0;
        temp = 0;
        for (; 0 < l; l--) {
            if (bin[l-1] == 0) {

                if(temp>max)
                    temp = temp;
                else
                    temp = max;
                max = 0;
            }
            if (bin[l-1] == 1)
                max++;
        }
        if (temp < max)
            max = max;
        else
            max = temp;
        System.out.println(max);
    }
}

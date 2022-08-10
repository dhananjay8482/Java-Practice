package Logics;

import java.util.Scanner;

/*
*   ARMSTRONG NUMBERS ARE
*   153 -> 1   5   3   -> Addition of cubes is same as original number
*          1+125+27 => 153 => yes
* */

// Q. PRINT ALL 3 DIGIT ARMSTRONG NUMBERS

public class ArmstrongNumber {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        isArmstring(n);

        for (int i = 100; i < 999 ; i++) {
            isArmstrong(i);
        }

    }

    private static void isArmstrong(int n) {
        int original = n;
        int sum = 0, reminder = 0;

        while( n > 0 ){
            reminder = n % 10;
            sum += reminder*reminder*reminder;
            n/=10;
        }

        if (sum==original)
            System.out.print(original+" ");
    }

}
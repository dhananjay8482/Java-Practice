package Logics;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean ans = isPrime(a);
        System.out.println(ans);
    }

    private static boolean isPrime(int n) {
        if (n<=1)
            return false;
        int c = 2;
        while(c * c <= n){
            if(n % c == 0)
                return false;
            c++;
        }
        return true;

    }

}

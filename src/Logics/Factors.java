package Logics;

public class Factors {

    public static void main(String[] args) {
        factors1(36);
        factors2(36);
    }

//    O(n/2)
    static void factors1(int n){
        System.out.println("Factors ->  ");
        for (int i = 1; i <= n/2 ; i++) {
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.print(n+" ");
    }
//      O(sqrt(n))
    static void factors2(int n){
        System.out.println("\nFactors ->  ");
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if(n%i==0){
                if( i == n/i )
                    System.out.print(i+" ");
                else
                    System.out.print(i+" "+ n/i+" ");
            }
        }
    }


}

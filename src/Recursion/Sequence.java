package Recursion;

public class Sequence {

    public static void main(String[] args) {
        sequence1(10);
        System.out.println(" ");
        sequence2(10);
        System.out.println(" ");
        sequence3(10);
    }

//    Sequence of n to 1
    static void sequence1(int n){
        if(n==0){
            return ;
        }
        System.out.print(n+" ");
        sequence1(n-1);
    }

    //    Sequence of 1 to n
    static void sequence2(int n){
        if(n==0){
            return ;
        }
        sequence2(n-1);
        System.out.print(n+" ");
    }

    //    Sequence of n to 1 to n
    static void sequence3(int n){
        if(n==0){
            return ;
        }
        System.out.print(n+" ");
        sequence3(n-1);
        System.out.print(n+" ");
    }
}

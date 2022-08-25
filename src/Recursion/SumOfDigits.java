package Recursion;
// Sum of individual digits

public class SumOfDigits {

    public static void main(String[] args) {
        int ans = ans(14235);
        System.out.println(ans);
//        Product of Digits
        ans = prod(14235);
        System.out.println(ans);
    }
     static int ans(int n){
        if(n==0)
            return 0;
        return ans(n/10)+(n%10);
    }
    static int prod(int n){
        if(n<=1)
            return 1;
        return prod(n/10)*(n%10);
    }

}

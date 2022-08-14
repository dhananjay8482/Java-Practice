package LeetCode;

//Find Perfect square Interger without using power function
//SOLVING USING BINARY SEARCH

public class PerfectSquare {

    public static void main(String[] args) {
        int ip = 99;
        System.out.println("Squareroot of "+ip+" : "+mySqrt(ip) );
        System.out.println("Squareroot of 546 : " + mySqrt(546) );
        System.out.println("Squareroot of 5 : " + mySqrt(5) );
    }

    private static int mySqrt(int x) {

//        ADDING MANUAL STEPS WILL REDUCE TIME EXECUTION
        if(x==0)
            return 0;
        if(x==4)
            return 2;
        if(x==9)
            return 3;
        if(x==16)
            return 4;

        int start =2, end = x;
        int ans = 1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if((mid)<=(x/mid)){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;

    }

}

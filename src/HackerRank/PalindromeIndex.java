package HackerRank;

/*
* STDIN   Function
-----   --------
3       q = 3
aaab    s = 'aaab' (first query)
baa     s = 'baa'  (second query)
aaa     s = 'aaa'  (third query)
*
3
0
-1
*
* */

import java.util.Scanner;

public class PalindromeIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        System.out.println(palindromeIndex(ip));
    }



    public static int palindromeIndex(String s) {
        // Write your code here
        int ans=-1;

        for (int i = 0,j = s.length()-1; i < j ; i++,j--) {
            if( s.charAt(i) != s.charAt(j)){
                if( s.charAt(i+1) == s.charAt(j)){
                    return i;
                }
                else if( s.charAt(j-1) == s.charAt(i)){
                    return j;
                }
            }
        }
        return ans;

//        PERFECT CODE ABOVE CODE 12/14 CASES PASSED

        // int l = s.length();
        // int i,j,a,b;
        // for (i=0, j=l-1; i<l; i++,j--){
        //     if (s.charAt(i)!=s.charAt(j))
        //         break;
        // }
        // if (i>j) return -1;

        // for (a = i+1, b = j;a<j && b>i+1; a++,b--){
        //     if (s.charAt(a)!=s.charAt(b))
        //         return j;
        // }
        // return i;
    }
}

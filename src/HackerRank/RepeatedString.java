package HackerRank;

/*
*   REPEATED STRING
*
*   if String s = "aba"
* n = 10 find total occurence of a
*   abaabaabaa => 7
*
* */

import java.util.Scanner;

public class RepeatedString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long n = sc.nextLong();
        long aCount = repeatedString(s, n);

        System.out.println("Count = "+ aCount);
    }
    private static long repeatedString(String s, long n) {
        int strLength = s.length();
        long quotient = n / strLength;
        long reminder = n % strLength;
        long partialStrLen = ( reminder == 0 ) ? 0 : reminder;

        long aCount = quotient * getLetterCount(s, s.length()) + getLetterCount(s, partialStrLen);
        return aCount;
    }
    private static long getLetterCount(String s, long strLength) {
        long count = 0;
        for (int i = 0; i < strLength ; i++) {
            if( s.charAt(i) == 'a' )
                count+=1;
        }
        return count;
    }


}

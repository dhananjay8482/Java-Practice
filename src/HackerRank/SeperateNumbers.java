package HackerRank;

/*
*
*  link -> https://www.hackerrank.com/challenges/separate-the-numbers/problem?h_r=internal-search
*   let string = 9101112 -> 10-9 = 1,  11-10 = 1 so o beautiful string
*/

public class SeperateNumbers {

    public static void main(String[] args) {
        String s = "910111213";

        validNumbers("99100102");
    }

    private static void validNumbers(String s) {
        boolean isValid = false;
        String dummyString = "";

        for(int i = 1 ; i<=s.length()/2; i++){
            dummyString = s.substring(0,i);
            Long num = Long.parseLong(dummyString);

            String validString = dummyString;

            while(validString.length() < s.length()){
                // num = num+1;
                validString += Long.toString(++num);
            }

            if (s.equals(validString)) {
                isValid = true;
                break;
            }

        }
        System.out.println(isValid? "YES"+dummyString:"NO");

    }

}

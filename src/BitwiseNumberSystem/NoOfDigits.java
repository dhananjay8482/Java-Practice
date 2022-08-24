package BitwiseNumberSystem;

public class NoOfDigits {

/*
    For any number we can find no of bits using right shift until number not equal 0
    but this is one line code
*/

    public static void main(String[] args) {
        int num = 10;
        int base = 2; // binary

        int ans = (int) (Math.log(num)/Math.log(base))+1;
        System.out.println(ans);
    }

}

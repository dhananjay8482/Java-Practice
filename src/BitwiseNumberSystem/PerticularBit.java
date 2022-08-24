package BitwiseNumberSystem;

public class PerticularBit {

//    To find ith bit of number using Left shift and '&' bitwise operator

    public static void main(String[] args) {
        int number = 1001010100;
        int location = 4;

        System.out.println( number & (1 << location-1 ) );

//        Set the ith bit
        System.out.println( number | (1 << location-1 ) );
    }

}

package Logics;

//Find Even number of Digits from array
//[12,342,23,1234,1232,1,-2] => 4

public class EvenDigits {


    public static void main(String[] args) {
        int[] arr = {12,342,23,1234,1232,1,-342421,-1};
        System.out.println("Even number of digits : "+evenNoDigits(arr));

//        OPTIMISTIC APPROACH
        System.out.println("Even number of digits : "+evenNoDigitsOptimistic(arr));


    }

    private static int evenNoDigitsOptimistic(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0)
                arr[i] = arr[i]*-1;
            if( ((int)Math.log10(arr[i])+1) % 2 == 0)
                counter++;
        }
        return counter;
    }

    private static int evenNoDigits(int[] arr) {
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0)
                arr[i] = arr[i]*-1;
            if(digitCount(arr[i])%2==0)
                counter++;
        }
        return counter;
    }

    public static int digitCount(int num){
        int count = 0;
        while(num>0){
            count++;
            num=num / 10;
        }
        return count;
    }


}

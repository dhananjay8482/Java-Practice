package LeetCode;

/*
*   CEILING number is number equal to or just greater than that number
*   such problem solve using Binary search
*   only return MID+1 if number not found
*
*   FLOOR number means less than input but greater than or equal to rest array
*   only return MID-1 if number not found
* */

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println("Ceiling Number: "+ceiling(arr,153));
        System.out.println("Flooring Number: "+floor(arr,2));
    }

    private static int ceiling(int[] arr, int target) {
        int[] ans= new int[arr.length];
        int start = 0, mid = 0;
        int end = arr.length-1;

        //if target element is greater than greatest element in array
        if(target > arr[end])
            return -1;

        while(start<=end){
            mid = start + (end-start)/2;

            if (target < arr[mid]){
                end = end-1;
            } else if (target > arr[mid]) {
                start = start+1;
            }else if(target == arr[mid]){
                return mid;
            }
        }
        return arr[start];
    }

    private static int floor(int[] arr, int target) {
        int[] ans= new int[arr.length];
        int start = 0, mid = 0;
        int end = arr.length-1;

        //if target element is less than smallest element in array
        if(target < arr[start])
            return -1;

        while(start<=end){
            mid = start + (end-start)/2;

            if (target < arr[mid]){
                end = end-1;
            } else if (target > arr[mid]) {
                start = start+1;
            }else if(target == arr[mid]){
                return mid;
            }
        }
        return arr[end];
    }
}

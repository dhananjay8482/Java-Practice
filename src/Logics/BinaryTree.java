package Logics;

public class BinaryTree {

    public static void main(String[] args) {
        System.out.println("Binary Search Applied only Sorted array");

        int[] arr = {12,34,64,78,232,454,786,3422,67665,988767};
        int[] arr1 = {98876,56756,34563,231,34,23,12,3,1,-12,-323,-45432,-31423425};
        System.out.println("Element at : "+binarySearch(arr,7866));
//        Agnostic Binary Search
//        ->  Means sorted array but either Increasing or decreasing order
        System.out.println("Element at : "+binaryASearch(arr1,-45432));

    }
    static int binarySearch(int[] arr, int target){
        int[] ans= new int[arr.length];
        int start = 0, mid = 0;
        int end = arr.length-1;

        while(start<=end){
//            THIS START + END MAY EXIST RANGE OF INT
//            mid = (start+end)/2
            mid = start + (end-start)/2;

            if (target < arr[mid]){
                end = end-1;
            } else if (target > arr[mid]) {
                start = start+1;
            }else if(target == arr[mid]){
                return mid;
            }
        }
        return -1;
    }

    static int binaryASearch(int[] arr, int target){

        int start = 0, mid = 0;
        int end = arr.length-1;

//        find weather ascending or descending
        boolean isAsc = arr[start]<arr[end];

        if(arr[mid]==target)
            return mid;

        while(start<=end){
            mid = start + (end-start)/2;
            if(isAsc){
                if (target < arr[mid]){
                    end = end-1;
                } else if (target > arr[mid]) {
                    start = start+1;
                }else if(target == arr[mid]){
                    return mid;
                }
            }else{
                if (target < arr[mid]){
                    start = start+1;
                } else if (target > arr[mid]) {
                    end = end-1;
                }else if(target == arr[mid]){
                    return mid;
                }
            }
        }
        return -1;
    }

}

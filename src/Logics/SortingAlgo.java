package Logics;


import java.util.Arrays;

//Cyclic sort ->
// If numbers are in list from 1 to n then always use Cycle sort e.g [4,2,3,1,5]
//Insertion sort
//SELECTION SORT
//bubble sort
public class SortingAlgo {

    public static void main(String[] args) {
        int[] arr = {3,23,1234,45,12,45,12,34,54};
        int[] arr1 = {6,8,3,1,4,7,2,5};
//        bubble(arr);
//        selection(arr);
//        insertion(arr);
        cyclic(arr1);
    }
//    IN cyclic Sort INDEX and items are always fixed
// 0th index always-> 1 , 1st index -> 2, ith index -> i+1 number

    static void cyclic(int[] arr){

        int i=0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i,correct);
            }else{
                i++;
            }
        }

        System.out.println("\nCYCLIC : "+ Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for (int i = 0; i <= arr.length-2 ; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
        System.out.println("\nINSERTION : "+ Arrays.toString(arr));
    }


    public static void selection(int[] arr){
        for (int i = 0; i< arr.length; i++){
//            find the max item in the ewmaining array and swap with correct index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
        System.out.println("\nSELECTION : "+Arrays.toString(arr));

    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end ; i++) {
            if(arr[max]<arr[i])
                max = i;
        }
        return max;
    }

    public static void bubble(int[] arr){
//        run the n-1 steps
        for (int i = 0; i < arr.length ; i++) {
            boolean swapped = false;

//            for each step, max item will come at the last respective index
            for( int j=1; j < arr.length-i; j++ ){
//             swap if item smaller than previous nujmber
                if( arr[j] < arr[j-1] ){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
//            if did not swapped perticular value opf i , it means sorted array no need to sort
            if (!swapped)
                break;

        }
        System.out.println("\nBubble : "+ Arrays.toString(arr) );
     }





}

package Recursion;

// Divide array in two parts and sort sub arrays and merge it to final one

import java.util.Arrays;

import static com.sun.deploy.net.MessageHeader.merge;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5,2,12,323,11};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr){
        if (arr.length==1)
            return arr;

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0 , mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid , arr.length));
        return merge(left, right);

    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length+second.length];
        int i= 0;
        int j = 0;
        int k = 0; // pointer for k array

        while(i<first.length && j<second.length){
            if (first[i]<=second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
//        it may be possible that one  of the arrays is not complete
        while(i<first.length){
            mix[k] = first[i];
            i++;k++;
        }
        while(j<second.length){
            mix[k] = second[j];
            j++;k++;
        }
        return mix;
    }









}

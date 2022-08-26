package Recursion;

import java.util.ArrayList;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,51,6};
        int[] arr1 = {1,2,3,4,231,3,3,51,6,3,3};
        System.out.println(find(arr,3,0));

        System.out.println(findAllIndex(arr1,3,0,list));
    }

    static int find(int[] arr, int target, int index){
        if( index == arr.length ){
            return -1;
        }
        if(arr[index]==target)
            return index;
        else
            return find(arr, target, index+1);
    }

//    Finding all indexes of target
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index==arr.length)
            return list;
        if (arr[index]==target)
            list.add(index);
        return findAllIndex(arr, target, index+1, list);
    }




}

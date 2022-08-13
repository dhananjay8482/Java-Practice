package Logics;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {23, 3435, 12, 45, 76, 34, 12};
        int[][] arr1 = {
                {23,34,5,65,23,564,3,4},
                {453,234,23,345},
                {12,34,1,23,34,4,3},
                {1,2,342557,786,45,345,11}
        };
        String name = "Kunal";
        char target = 'u';
//        CHECKING CHAR CONTAIN IN STRING

        System.out.println(search(name, target));
        System.out.println(search1(name, target));
//        FIND MIN MAX
        minmax(arr);
//        2d Array Search
        search2d(arr1,11);

    }

    private static void search2d(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target) {
                    System.out.println("Element Found");
                    return;
                }

            }
        }
        System.out.println("Element Not Found");

    }

//    FOR 2d Array

    private static void minmax(int[] arr) {
        int max = arr[0],min=arr[0];
        for(int i=0;i< arr.length;i++){
            if (arr[i]>max)
                max = arr[i];
            if (arr[i]<min)
                min = arr[i];
        }
        System.out.println("Max = "+max+"\nMin = "+min);
    }

    //USING FOREACH
    private static boolean search1(String str, char target) {
        if(str.length()==0)
            return false;
        for(char ch: str.toCharArray())
            if(ch==target)
                return true;
        return false;
    }
//?USING FOR?
    static boolean search(String str, char target){
        if(str.length()==0)
            return false;

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i))
                return true;
        }

        return false;
    }

}

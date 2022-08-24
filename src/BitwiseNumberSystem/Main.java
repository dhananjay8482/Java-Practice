package BitwiseNumberSystem;

public class Main {

    public static void main(String[] args) {
        System.out.println("------ Bitwise Operations -------");
//        doubleNumber(30);
        System.out.println(isOdd(30));
        System.out.println(isOdd(31));
//        In given array every number occure twice except one find that one number
        int[] array1 = {1,2,3,4,5,1,4,2,3};
//      BRUTFORCE
//        System.out.println(findOneNumber(array1));
//      Bitwise Exor
        System.out.println(findOneNumberExor(array1));
    }

    private static int findOneNumberExor(int[] nums) {
//        Any number Exor with that number gives 0 and any number Exor with 0 gives that number itself.
        int unique = 0;

        for(int n : nums){
            unique ^= n;
        }
        return unique;
    }

    private static int findOneNumber(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            count=1;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j]&& i!=j)
                    count++;
            }
            if(count==1) return nums[i];
        }
        return -1;
    }

    public static boolean isOdd(int n){
//        0101010010 -> Check only last digit if 1 ->Odd else Even
//        01010010 & 00000001 -> gives last digit only
        return ((n & 1) == 1) ;
    }

    public static void doubleNumber(int n){
//     Bitwise Left Shift return value double
    }

}

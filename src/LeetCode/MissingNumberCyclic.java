package LeetCode;

import java.util.ArrayList;
import java.util.List;

// o-n or 1-n use Cyclic sort and then find whos index not matching with value those are Extra elements

//Amazon
public class MissingNumberCyclic {


    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println( findDisappearedNumbers(arr) );
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        // List<Integer> ans;
        List<Integer> ans = new ArrayList<>();

        int i = 0;
        while(i<nums.length){
            int counter = nums[i]-1;
            if(nums[i]!=nums[counter]){
                int temp = nums[i];
                nums[i] = nums[counter];
                nums[counter] = temp;
            }else{
                i++;
            }
        }
        for(i = 0; i<nums.length ; i++){
            if(nums[i]!=i+1){
                ans.add(i+1);
            }
        }

        return ans;
    }


}

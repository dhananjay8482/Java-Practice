package LeetCode;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//FACEBOOK

//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]

import java.util.Arrays;

public class FirstLastPosition {


    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int[] ans= searchRange(arr,-23);
        System.out.println("Answer : "+ ans[0]+" "+ans[1] );
    }
    public static int[] searchRange(int[] nums, int target) {
        int ans[] = {-1,-1};
        boolean findStartIndex = true;
        int start = search(nums, target, findStartIndex );
        int end = search(nums, target, !findStartIndex );
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    public static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0, end = nums.length-1, mid = 0;

        while(start<=end){

            mid = start+(end-start)/2;
            if(nums[mid]<target){
                start = mid+1;
            }else if(nums[mid]>target){
                end = mid-1;
            }else{
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }

        }
        return ans;

    }
}

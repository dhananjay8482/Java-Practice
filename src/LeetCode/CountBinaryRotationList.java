package LeetCode;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/


public class CountBinaryRotationList {

    public static void main(String[] args) {
        int[] nums = {90,91,92,93,2,4,7,9};
        System.out.println("Ans : "+ findRotation(nums));
    }

    public static int findRotation(int[] nums) {

        int len = nums.length;
        int l = 0;
        int r = len-1;
        if(nums[l] <= nums[r]) return nums[l];
        while(l<r){
            int mid = (r-l)/2 + l;
            int nMid = nums[mid];
            if(nMid > nums[mid+1])
                return nums[mid+1];
            if(mid > 0 && nMid < nums[mid-1])
                return nums[mid];
            if(nMid > nums[l])
                l = mid;
            else if(nMid < nums[l])
                r = mid;
        }
        return -1;

    }

}

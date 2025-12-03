package twoPointers;

import java.util.Arrays;

public class TwoSumII {
    public static int[] twoSum(int[] nums, int target){
        int l=0;
        int r= nums.length-1;

        while(l<r){
            int total = nums[l]+ nums[r];
            if(total==target){
                return new int[]{l+1, r+1};
            }
            else if(total<target){
                l++;
            }
            else { r--; }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 3, 4, 5, 6};
        int target= 9;
        int[] res= twoSum(numbers, target);
        System.out.println(Arrays.toString(res));

    }
}

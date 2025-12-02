package arrays;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static int[] productArray(int[] nums){
        int[] ans= new int[nums.length];
        ans[0]=1;
        int curr=1;
        for(int i=1; i<nums.length; i++){
            ans[i] = ans[i-1]*nums[i-1];
        }
        for (int i= nums.length-1; i>=0; i--){
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] ans= productArray(nums);
        System.out.println(Arrays.toString(ans));
    }
}

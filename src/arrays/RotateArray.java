package arrays;

public class RotateArray {
    public static void rotatation(int[] nums, int k){
        int n= nums.length;
        k= k%n;
        rotate(nums, 0, n-1);
        rotate(nums, 0, k-1);
        rotate(nums, k, n-1);
    }
    public static void rotate(int[] nums, int start, int end){
        while(start<end){
            int temp= nums[start];
            nums[start]=nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }
    public static void main (String[] args){
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int k=4;
        rotatation(nums, k);
        for(int num : nums){
            System.out.println(num);
        }
    }

}

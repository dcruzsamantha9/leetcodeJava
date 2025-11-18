package arrays;

public class RemoveDupsFromSortedArrayII {
    public static int removeDuplicates(int[] nums){
        int j=0;

        for(int i=0; i<nums.length; i++){
            if(j<2 || nums[i]!=nums[j-2])
            {
                nums[i]=nums[j];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args){
        int[] nums={1,1,1,2,3,3,3,4,4,5,6,7};
        int x= removeDuplicates(nums);
        System.out.println(x);
    }
}

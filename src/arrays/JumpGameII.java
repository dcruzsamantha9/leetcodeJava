package arrays;

public class JumpGameII {
    public static int jump(int[] nums){
        int l=0;
        int r=0;
        int farthest;
        int jumps=0;

        while(r<nums.length-1){
            farthest=0;
            for(int i=l; i<=r; i++){
                farthest=Math.max(farthest, i+nums[i]);
            }
            l=r+1;
            r=farthest;
            jumps++;
        }
        return jumps;
    }

    public static void main(String[] args) {
        int[] nums= {2,3,0,1,4};
        System.out.println(jump(nums));
    }
}

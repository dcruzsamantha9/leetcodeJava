package arrays;

public class MajorityElements {
    public static int majorityElement(int[] nums){
        int count=0;
        int candidate = 0;

        for(int num :nums){
            if(count==0){
                candidate=num;
                count++;
            }
            else if (num==candidate){
                count++;
            }
            else {
                count--;
            }
        }
        return candidate;
    }

    public static void main (String [] args){
        int nums[] ={1, 2, 2, 2, 2, 3, 3};
        int res = majorityElement(nums);
        System.out.println(res);
    }
}

package twoPointers;

public class ContainerWithMostWater {
    public static int container(int[] height){
        int l=0, r=height.length-1;
        int maxArea=0;
        while(l<r) {
            int area= (r-l)*Math.min(height[l], height[r]);
            maxArea= Math.max(area, maxArea);
            if(height[l]<height[r]){
                l++;
        }
            else {
                r--;
            }
    }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height= {1,8,6,2,5,4,8,3,7};
        System.out.println(container(height));
    }
}

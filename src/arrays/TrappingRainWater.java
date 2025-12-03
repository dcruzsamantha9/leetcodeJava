package arrays;

public class TrappingRainWater {
    public static  int trappingWater(int[] height){
        if(height.length==0){
            return 0;
        }
        int l=0;
        int r= height.length-1;
        int lMax= height[l];
        int rMax=height[r];
        int res=0;
        while (l<r){
            if(lMax<rMax){
                l= l+1;
                lMax= Math.max(lMax, height[l]);
                res += lMax-height[l];
            }
            else {
                r= r-1;
                rMax= Math.max(rMax, height[r]);
                res += rMax-height[r];
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] height= {0,1,0,2,1,0,1,3,2,1,2,1};
        int result= trappingWater(height);
        System.out.println(result);
    }
}

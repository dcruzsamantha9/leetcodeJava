package arrays;

public class BuyAndSellStockI {
    public static int buySellStock(int [] nums){
        int buy_price= nums[0];
        int currProfit;
        int maxProfit= Integer.MIN_VALUE;

        for(int i=1; i<nums.length; i++){
           if(buy_price>nums[i]){
               buy_price= nums[i];
           }
           else{
               currProfit= nums[i]-buy_price;
               maxProfit= Math.max(maxProfit, currProfit);
           }

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int nums[]= {7,1,5,3,6,4};
        int res= buySellStock(nums);
        System.out.println(res);
    }

}

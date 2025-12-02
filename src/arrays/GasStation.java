package arrays;

public class GasStation {
    public static int canComplete(int[] gas, int[] cost){
        int pos=0;
        int total=0, sum=0;

        for(int i=0; i<gas.length; i++){
            sum += gas[i]-cost[i];

            if(sum<0){
                total += sum;
                sum=0;
                pos= i+1;
            }
        }
        total +=sum;

        return total>=0?pos:-1;
    }

    public static void main(String[] args) {
        int[] gas= {1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        int res= canComplete(gas,cost);
        System.out.println(res);
    }
}

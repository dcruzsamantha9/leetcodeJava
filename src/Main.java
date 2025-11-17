public class Main {

    public static void mergeArray(int[] nums1, int m, int[] nums2, int n){
        int n1= m-1;
        int n2= n-1;
        int k= m+n-1;
        while(n2>=0 ){
            if(n1>=0 && nums1[n1]>= nums2[n2]){
                nums1[k]= nums1[n1];
                n1--;
            }
            else {
                nums1[k]=nums2[n2];
                n2--;
            }
            k--;
        }

    }

    public static void main(String[] args) {
        int[] nums1={ 1, 2, 3, 0 ,0 ,0};
        int[] nums2= {2, 5, 6};
        int m=3;
        int n=3;
        mergeArray(nums1, m, nums2, n);
        for(int num: nums1){
            System.out.println(num);
        }
    }
}
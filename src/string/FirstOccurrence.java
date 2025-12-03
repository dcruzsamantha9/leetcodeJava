package string;

public class FirstOccurrence {
    public static int firstOccurence(String haystack, String needle){
        int n1= haystack.length();
        int n2= needle.length();
        int i,j;
        for(i=0; i<n1-n2; i++){
            j=0;
            while(j<n2 && haystack.charAt(i+j)==needle.charAt(j)){
                j++;
            }
            if(j==n2){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack= "sadbutsad";
        String needle= "sad";
        System.out.println(firstOccurence(haystack, needle));
    }
}

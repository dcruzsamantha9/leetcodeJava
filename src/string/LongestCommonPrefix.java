package string;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestPrefix(String[] words){
        StringBuilder sb= new StringBuilder();
        if(words.length==0) { return null; }
        Arrays.sort(words);
        int n= words.length;
        String first = words[0];
        String last= words[n-1];
        for(int i=0; i<first.length(); i++){
            if (first.charAt(i) != last.charAt(i)){
                break;
            }
                sb.append(first.charAt(i));

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight" };
        String result = longestPrefix(words);
        System.out.println(result);
    }
}

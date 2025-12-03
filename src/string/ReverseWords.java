package string;

public class ReverseWords {
    public static String reverseWord(String s){
        String[] words= s.split(" ");
        int n= words.length;
        StringBuilder sb= new StringBuilder();

        for(int i=n-1; i>=0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s= "the sky is blue";
        System.out.println(reverseWord(s));
    }
}

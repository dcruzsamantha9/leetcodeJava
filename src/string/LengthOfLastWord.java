package string;

public class LengthOfLastWord {
public static int lengthOfWord(String s){
    int len=0;
    String sb= s.trim();
    for(int i=sb.length()-1; i>=0; i--){
        if(sb.charAt(i)==' '){
            return len;
        }
        len++;
    }
    return len;
}

    public static void main(String[] args) {
        String s= "The sky is blue";
        System.out.println(lengthOfWord(s));
    }

}

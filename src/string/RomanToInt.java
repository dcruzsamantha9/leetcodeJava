package string;

public class RomanToInt {
    public static int romanToInt(String s){
        if(s==null || s.length()==0){
            return 0;
        }
        int res=0;
        for(int i=0; i<s.length()-1; i++){
            if(valueAtChar(s.charAt(i))>= valueAtChar(s.charAt(i+1))){
                res += valueAtChar(s.charAt(i));
            }
            else
            {
                res -= valueAtChar(s.charAt(i));
            }
        }
        return res+ valueAtChar(s.charAt(s.length()-1));
    }

    public static int valueAtChar(Character ch){
        switch (ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }

    }

    public static void main(String[] args) {
        String s= "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}

package String_2;

import java.util.Arrays;

public class doubleChar {
    /*
    Given a string, return a string where for every char in the original, there are two chars.
doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
     */
    public String doubleChar(String str) {
        String result="";
        for(int i=0;i<str.length();i++){
            result+=str.substring(i,i+1)+str.charAt(i);
        }
        return result;

    }
    public String solution2_doubleChar(String str) {
        StringBuilder s=new StringBuilder();
        Arrays.stream(str.split("")).forEach(n->s.append(n+n));
        return ""+s;


    }
}

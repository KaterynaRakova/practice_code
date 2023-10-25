package String_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bobThere {
    /*
    Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
     */
    public boolean solution1_bobThere(String str) {
        return str.matches("(.*b.b.*)");
    }
    public boolean solution2_bobThere(String str) {
        return str.replaceAll("(b.b)", "").length() < str.length();
    }
    public boolean solution3_bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
                return true;
        }
        return false;
    }

    public boolean solution4_bobThere(String str) {
        String pattern ="b.b";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(str);
         return m.find();

    }
}

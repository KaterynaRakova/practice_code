package String_2;

public class countCode {
    /*
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
     */

    public int countCodee(String str) {
        String p = "co.e";
        return (str.length() - str.replaceAll("(" + p + ")", "").length()) / p.length();
    }
    public int solution2_countCode(String str) {
        return (str.length() - str.replaceAll("(co.e)", "").length()) / "code".length();
    }

    public int solution3_countCode(String str) {
        int l = "code".length();
        String result = str.replaceAll("(co.e)", "");
        return (str.length() - result.length()) / l;
    }
    public int solution4_countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

}

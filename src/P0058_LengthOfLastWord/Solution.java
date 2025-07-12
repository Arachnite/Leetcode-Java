
package P0058_LengthOfLastWord;

public class Solution {

    public int lengthOfLastWord(String s) {

        int index = s.length() - 1;
        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == ' ') {
                if (i + 1 != s.length() && s.charAt(i + 1) != ' '){

                    return index - i;

                }
                index--;
            }
        }

        return s.length() - (s.length() - index) + 1;
    }
}

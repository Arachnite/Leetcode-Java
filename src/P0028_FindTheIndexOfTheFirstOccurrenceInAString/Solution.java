
package P0028_FindTheIndexOfTheFirstOccurrenceInAString;

public class Solution {

    public int strStr(String haystack, String needle) {

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            if (haystack.charAt(i) == needle.charAt(0)) {

                boolean match = true;
                for (int ii = 1; ii <= needle.length() - 1; ii++) {

                    if (haystack.charAt(i + ii) != needle.charAt(ii)) {

                        match = false;
                        break;

                    }
                }

                if (match) {

                    return i;

                }
            }
        }

        return -1;
    }
}

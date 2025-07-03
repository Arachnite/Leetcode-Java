package P0014_LongestCommonPrefix;

public class Solution {

    public String longestCommonPrefix(String[] strs) {

        String prefix = "";

        if (strs == null || strs.length == 0) {
            return "";
        }

        for (int i = 0; i <= strs[0].length() - 1; i++) {

            prefix += strs[0].charAt(i);

            for (int ii = 1; ii <= strs.length - 1; ii++) {

                try {
                    if (strs[0].charAt(i) != strs[ii].charAt(i)) {

                        prefix = prefix.substring(0, prefix.length() - 1);
                        return prefix;

                    }
                } catch (Exception e) {

                    prefix = prefix.substring(0, prefix.length() - 1);
                    return prefix;

                }
            }
        }

        return prefix;
    }
}
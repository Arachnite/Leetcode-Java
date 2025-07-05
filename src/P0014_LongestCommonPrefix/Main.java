
package P0014_LongestCommonPrefix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many words do you want to compare? ");
        int length = sc.nextInt();
        String[] strs = new String[length];
        for (int i = 0; i <= strs.length - 1; i++) {

            System.out.print("Enter word " + (i + 1) + ": ");
            strs[i] = sc.next();

        }

        String result = solution.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);

        sc.close();
    }
}

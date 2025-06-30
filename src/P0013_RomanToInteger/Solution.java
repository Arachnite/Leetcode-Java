
package P0013_RomanToInteger;

public class Solution {

    public int romanToInt(String s) {

        int currentTotal = 0;
        int previousValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = getValue(c);

            if (value < previousValue) {
                currentTotal -= value;
            } else {
                currentTotal += value;
            }
            previousValue = value;
        }

        return currentTotal;
    }

    private int getValue(char c) {

        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}

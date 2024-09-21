package org.example;

public class NumberToWords {
    private static final String[] LESS_THAN_TWENTY = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] TENS = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static String convertNumberToWords(int num) {
        if (num == 0) {
            return "zero";
        } else if (num < 20) {
            return LESS_THAN_TWENTY[num];
        } else if (num < 100) {
            return TENS[num / 10] + (num % 10 != 0 ? " " + LESS_THAN_TWENTY[num % 10] : "");
        } else if (num < 1000) {
            return LESS_THAN_TWENTY[num / 100] + " hundred" + (num % 100 != 0 ? " and " + convertNumberToWords(num % 100) : "");
        } else {
            return "Number too large";
        }
    }
}

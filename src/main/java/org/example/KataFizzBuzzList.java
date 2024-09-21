package org.example;

import java.util.ArrayList;
import java.util.List;

public class KataFizzBuzzList {
    public static void main(String[] args) {
        int n = 100;

        // Call the fizzBuzz function to get the result List.
        List<String> resultList = fizzBuzz(n);

        // Print the result list.
        for (String result : resultList) {
            System.out.println(result);
        }

    }

    public static List<String> fizzBuzz(int n) {
        ArrayList<String> listOfStrings = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                listOfStrings.add("FizzBuzz");
            } else if (i % 3 == 0) {
                listOfStrings.add("Fizz");
            } else if (i % 5 == 0) {
                listOfStrings.add("Buzz");
            } else {
                listOfStrings.add(String.valueOf(i));
            }
        }
        return listOfStrings;
    }

    public static List<String> fizzBuzzStage2(int n) {
        ArrayList<String> listOfStrings = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                listOfStrings.add("FizzBuzz");
            } else if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                listOfStrings.add("Fizz");
            } else if (i % 5 == 0 || String.valueOf(i).contains("5")) {
                listOfStrings.add("Buzz");
            } else {
                listOfStrings.add(String.valueOf(i));
            }
        }
        return listOfStrings;
    }

}

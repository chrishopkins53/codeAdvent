package codeAdvent.utils.year2023;

import java.util.*;

public class Day1 {

    private Day1() {}

    public static int puzzleOne(List<String> calibrationDocument) {
        int total = 0;

        for(String oneline: calibrationDocument){
            int value = valueFromString(oneline);
            total += value;
        }
        return total;

    }




    public static int puzzleTwo(List<String> calibrationDocument) {

        int total = 0;

        for(String oneline: calibrationDocument){
            int value = valueFromStringWithDigits(oneline);
            total += value;
        }
        return total;

    }


    public static int valueFromStringWithDigits(String inputString) {
        return valueFromString(convertToDigits(inputString));
    }

    public static String convertToDigits(String inputString) {

        Map<Integer, String> numbers = new HashMap<>(Map.of(
                1, "one",
                2, "two",
                3, "three",
                4, "four",
                5, "five",
                6, "six",
                7, "seven",
                8, "eight",
                9, "nine"
        ));

        String resultString = inputString;
        char[] charArray = resultString.toCharArray();

        for (Map.Entry<Integer, String> number : numbers.entrySet()){
            int location = inputString.indexOf(number.getValue());
            if (location != -1) {
                charArray[location] = number.getKey().toString().charAt(0);
            }

            location = inputString.lastIndexOf(number.getValue());
            if (location != -1) {
                charArray[location] = number.getKey().toString().charAt(0);
            }
        }

        resultString = String.valueOf(charArray).replaceAll("\\D","");
        return resultString;
    }

    public static int valueFromString(String oneLine) {
        String first = "";
        String last = "";
        boolean firstInt = true;

        String resultString = oneLine.replaceAll("\\D","");

        String finalNumber = "" + resultString.charAt(0) + resultString.charAt(resultString.length() - 1);
        return Integer.parseInt(finalNumber);
    }
}

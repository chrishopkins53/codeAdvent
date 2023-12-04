package codeAdvent.utils.year2020;

import java.util.List;

public class DayTwo {

    private DayTwo() {

    }

    public static int puzzleOne(List<String> passwordList) {
        int count = 0;
        for (String passwordEntry : passwordList) {
            String[] parts = passwordEntry.split(" ");
            String[] range = parts[0].split("-");
            int min = Integer.valueOf(range[0]);
            int max = Integer.valueOf(range[1]);
            char letter = parts[1].charAt(0);
            String password = parts[2];

            int charCount = (int) password.chars().filter(num -> num == letter).count();

            if (charCount <= max && charCount >= min) {
                count++;
            }

        }
        return count;
    }

    public static int puzzleTwo(List<String> passwordList) {
        int count = 0;
        for (String passwordEntry : passwordList) {
            String[] parts = passwordEntry.split(" ");
            String[] range = parts[0].split("-");
            int firstPosition = Integer.valueOf(range[0]) - 1;
            int secondPosition = Integer.valueOf(range[1]) - 1;
            char letter = parts[1].charAt(0);
            String password = parts[2];

            if (password.charAt(firstPosition) == letter ^ password.charAt(secondPosition) == letter) {
                count++;
            }

        }
        return count;
    }
}

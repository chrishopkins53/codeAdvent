package codeAdvent;

import codeAdvent.utils.DayFour;
import codeAdvent.utils.DayOne;
import codeAdvent.utils.DayThree;
import codeAdvent.utils.DayTwo;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int result;

        try {
            // Day one - Puzzle one
            System.out.println("Day one - Puzzle one");
            result = DayOne.puzzleOne(getInputData("src/main/resources/inputs/day1.txt"));
            System.out.println(result);

            // Day one - Puzzle Two
            System.out.println("Day one - Puzzle Two");
            result = DayOne.puzzleTwo(getInputData("src/main/resources/inputs/day1.txt"));
            System.out.println(result);

            System.out.println("#################");
            // Day Two - Puzzle One
            System.out.println("Day Two - Puzzle One");
            result = DayTwo.puzzleOne(getInputData("src/main/resources/inputs/day2.txt"));
            System.out.println(result);

            // Day Two - Puzzle Two
            System.out.println("Day Two - Puzzle Two");
            result = DayTwo.puzzleTwo(getInputData("src/main/resources/inputs/day2.txt"));
            System.out.println(result);

            System.out.println("#################");
            // Day Three - Puzzle One
            System.out.println("Day Three - Puzzle One");
            result = DayThree.puzzleOne(getInputData("src/main/resources/inputs/day3.txt"));
            System.out.println(result);
            // Day Three - Puzzle Two
            System.out.println("Day Three - Puzzle Two");
            long longResult = DayThree.puzzleTwo(getInputData("src/main/resources/inputs/day3.txt"));
            System.out.println(longResult);

            System.out.println("#################");
            // Day Four - Puzzle One
            System.out.println("Day Four - Puzzle One");
            result = DayFour.puzzleOne(getInputData("src/main/resources/inputs/day4.txt"));
            System.out.println(result);


        } catch (Exception e){
            System.out.println("Some exception happened");
            System.out.println(e.getCause());
        }

    }



    private static List<String> getInputData(String fileName) throws IOException {

        return Files.readAllLines(Paths.get(fileName));

    }

}

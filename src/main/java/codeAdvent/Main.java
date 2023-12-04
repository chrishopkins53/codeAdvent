package codeAdvent;

import codeAdvent.utils.year2020.DayFour;
import codeAdvent.utils.year2020.DayOne;
import codeAdvent.utils.year2020.DayThree;
import codeAdvent.utils.year2020.DayTwo;
import codeAdvent.utils.year2023.Day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int result;
        // 2020 Puzzles
//        try {
//            // Day one - Puzzle one
//            System.out.println("Day one - Puzzle one");
//            result = DayOne.puzzleOne(getInputData("src/main/resources/inputs/2020/day1.txt"));
//            System.out.println(result);
//
//            // Day one - Puzzle Two
//            System.out.println("Day one - Puzzle Two");
//            result = DayOne.puzzleTwo(getInputData("src/main/resources/inputs/2020/day1.txt"));
//            System.out.println(result);
//
//            System.out.println("#################");
//            // Day Two - Puzzle One
//            System.out.println("Day Two - Puzzle One");
//            result = DayTwo.puzzleOne(getInputData("src/main/resources/inputs/2020/day2.txt"));
//            System.out.println(result);
//
//            // Day Two - Puzzle Two
//            System.out.println("Day Two - Puzzle Two");
//            result = DayTwo.puzzleTwo(getInputData("src/main/resources/inputs/2020/day2.txt"));
//            System.out.println(result);
//
//            System.out.println("#################");
//            // Day Three - Puzzle One
//            System.out.println("Day Three - Puzzle One");
//            result = DayThree.puzzleOne(getInputData("src/main/resources/inputs/2020/day3.txt"));
//            System.out.println(result);
//            // Day Three - Puzzle Two
//            System.out.println("Day Three - Puzzle Two");
//            long longResult = DayThree.puzzleTwo(getInputData("src/main/resources/inputs/2020/day3.txt"));
//            System.out.println(longResult);
//
//            System.out.println("#################");
//            // Day Four - Puzzle One
//            System.out.println("Day Four - Puzzle One");
//            result = DayFour.puzzleOne(getInputData("src/main/resources/inputs/2020/day4.txt"));
//            System.out.println(result);
//
//
//        } catch (Exception e){
//            System.out.println("Some exception happened");
//            System.out.println(e.getCause());
//        }

        // 2023 Puzzles
        try {
            // Day one - Puzzle one
            System.out.println("Day one - Puzzle one");
            result = Day1.puzzleOne(getInputData("src/main/resources/inputs/2023/day1.txt"));
            System.out.println(result);

            // Day one - Puzzle Two
            System.out.println("Day one - Puzzle Two");
            result = Day1.puzzleTwo(getInputData("src/main/resources/inputs/2023/day1.txt"));
            System.out.println(result);

//            System.out.println("#################");
//            // Day Two - Puzzle One
//            System.out.println("Day Two - Puzzle One");
//            result = DayTwo.puzzleOne(getInputData("src/main/resources/inputs/day2.txt"));
//            System.out.println(result);
//
//            // Day Two - Puzzle Two
//            System.out.println("Day Two - Puzzle Two");
//            result = DayTwo.puzzleTwo(getInputData("src/main/resources/inputs/day2.txt"));
//            System.out.println(result);
//
//            System.out.println("#################");
//            // Day Three - Puzzle One
//            System.out.println("Day Three - Puzzle One");
//            result = DayThree.puzzleOne(getInputData("src/main/resources/inputs/day3.txt"));
//            System.out.println(result);
//            // Day Three - Puzzle Two
//            System.out.println("Day Three - Puzzle Two");
//            long longResult = DayThree.puzzleTwo(getInputData("src/main/resources/inputs/day3.txt"));
//            System.out.println(longResult);
//
//            System.out.println("#################");
//            // Day Four - Puzzle One
//            System.out.println("Day Four - Puzzle One");
//            result = DayFour.puzzleOne(getInputData("src/main/resources/inputs/day4.txt"));
//            System.out.println(result);


        } catch (Exception e){
            System.out.println("Some exception happened");
            System.out.println(e.getCause());
        }

    }



    private static List<String> getInputData(String fileName) throws IOException {

        return Files.readAllLines(Paths.get(fileName));

    }

}

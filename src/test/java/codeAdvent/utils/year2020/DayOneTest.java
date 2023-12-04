package codeAdvent.utils.year2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayOneTest {

    private static List<String> expenseReport = new ArrayList<>(Arrays.asList(
        "1721", "979", "366", "299", "675", "1456"));

    @Test
    void puzzleOneTest() {
        Assertions.assertEquals(514579, DayOne.puzzleOne(expenseReport));
    }

    @Test
    void puzzleTwoTest() {
        Assertions.assertEquals(241861950, DayOne.puzzleTwo(expenseReport));
    }
}
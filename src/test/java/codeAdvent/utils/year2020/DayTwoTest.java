package codeAdvent.utils.year2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayTwoTest {

    List<String> passwordList = new ArrayList<>(Arrays.asList(
        "1-3 a: abcde", "1-3 b: cdefg", "2-9 c: ccccccccc"));

    @Test
    void puzzleOneTest() {
        Assertions.assertEquals(2, DayTwo.puzzleOne(passwordList));
    }

    @Test
    void puzzleTwoTest() {
        Assertions.assertEquals(1, DayTwo.puzzleTwo(passwordList));
    }



}
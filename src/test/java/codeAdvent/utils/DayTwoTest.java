package codeAdvent.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static codeAdvent.utils.DayTwo.puzzleOne;
import static codeAdvent.utils.DayTwo.puzzleTwo;
import static org.junit.jupiter.api.Assertions.*;

class DayTwoTest {

    List<String> passwordList = new ArrayList<>(Arrays.asList(
        "1-3 a: abcde", "1-3 b: cdefg", "2-9 c: ccccccccc"));

    @Test
    void puzzleOneTest() {
        assertEquals(2, puzzleOne(passwordList));
    }

    @Test
    void puzzleTwoTest() {
        assertEquals(1, puzzleTwo(passwordList));
    }



}
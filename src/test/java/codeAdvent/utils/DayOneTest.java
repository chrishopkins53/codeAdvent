package codeAdvent.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.junit.jupiter.api.Test;

import static codeAdvent.utils.DayOne.puzzleOne;
import static codeAdvent.utils.DayOne.puzzleTwo;
import static org.junit.jupiter.api.Assertions.*;

class DayOneTest {

    private static List<String> expenseReport = new ArrayList<>(Arrays.asList(
        "1721", "979", "366", "299", "675", "1456"));

    @Test
    void puzzleOneTest() {
        assertEquals(514579, puzzleOne(expenseReport));
    }

    @Test
    void puzzleTwoTest() {
        assertEquals(241861950, puzzleTwo(expenseReport));
    }
}
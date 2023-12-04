package codeAdvent.utils.year2023;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static codeAdvent.utils.year2023.Day1.convertToDigits;
import static codeAdvent.utils.year2023.Day1.valueFromStringWithDigits;
import static org.junit.jupiter.api.Assertions.*;

class Day1Test {

    private static List<String> calibrationDocument1 = new ArrayList<>(Arrays.asList(
            "1abc2", "pqr3stu8vwx", "a1b2c3d4e5f", "treb7uchet"
    ));

    private static List<String> calibrationDocument2 = new ArrayList<>(Arrays.asList(
            "two1nine",
            "eightwothree",
            "abcone2threexyz",
            "xtwone3four",
            "4nineeightseven2",
            "zoneight234",
            "7pqrstsixteen"
    ));

    @Test
    void puzzleOneTest() { assertEquals(142, Day1.puzzleOne(calibrationDocument1));
    }

    @Test
    void puzzleTwoTest() { assertEquals(281, Day1.puzzleTwo(calibrationDocument2));
    }

    @Test
    void convertToDigitsTest() {
        assertEquals("219", convertToDigits("two1nine"));
        assertEquals("823", convertToDigits("eightwothree"));
        assertEquals("123", convertToDigits("abcone2threexyz"));
        assertEquals("2134", convertToDigits("xtwone3four"));
        assertEquals("49872", convertToDigits("4nineeightseven2"));
        assertEquals("18234", convertToDigits("zoneight234"));
        assertEquals("76", convertToDigits("7pqrstsixteen"));
        assertEquals("3", convertToDigits("3f"));
        assertEquals("21", convertToDigits("twone"));

    }

    @Test
    void valueFromStringWithDigitsTest() {
        assertEquals(29, valueFromStringWithDigits("two1nine"));
        assertEquals(83, valueFromStringWithDigits("eightwothree"));
        assertEquals(13, valueFromStringWithDigits("abcone2threexyz"));
        assertEquals(24, valueFromStringWithDigits("xtwone3four"));
        assertEquals(42, valueFromStringWithDigits("4nineeightseven2"));
        assertEquals(14, valueFromStringWithDigits("zoneight234"));
        assertEquals(76, valueFromStringWithDigits("7pqrstsixteen"));
        assertEquals(33, valueFromStringWithDigits("3f"));
        assertEquals(21, valueFromStringWithDigits("twone"));
        assertEquals(11, valueFromStringWithDigits("one"));
        assertEquals(22, valueFromStringWithDigits("2911threeninesdvxvheightwobm"));
        assertEquals(38, valueFromStringWithDigits("3fiveeightoneightg"));
    }
}
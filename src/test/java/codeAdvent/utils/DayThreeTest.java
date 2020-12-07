package codeAdvent.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayThreeTest {

    List<String> treesList = new ArrayList<>(Arrays.asList(
    "..##.......",
        "#...#...#..",
        ".#....#..#.",
        "..#.#...#.#",
        ".#...##..#.",
        "..#.##.....",
        ".#.#.#....#",
        ".#........#",
        "#.##...#...",
        "#...##....#",
        ".#..#...#.#"));

    @Test
    void puzzleOne() {
        assertEquals(7, DayThree.puzzleOne(treesList));
    }

    @Test
    void puzzleTwo() {
        assertEquals(336, DayThree.puzzleTwo(treesList));
    }
}
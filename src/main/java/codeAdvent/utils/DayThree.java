package codeAdvent.utils;

import java.util.List;

public class DayThree {

    private static char TREE = '#';

    private DayThree() {

    }

    public static int puzzleOne(List<String> treesList) {

        return countTrees(treesList, 3, 1);
    }

    public static long puzzleTwo(List<String> treesList) {

        int run1 = countTrees(treesList, 1, 1);
        int run2 = countTrees(treesList, 3, 1);
        int run3 = countTrees(treesList, 5, 1);
        int run4 = countTrees(treesList, 7, 1);
        int run5 = countTrees(treesList, 1, 2);

        long result = run1;
        result = result * run2;
        result = result * run3;
        result = result * run4;
        result = result * run5;

        return result;
    }


    private static int countTrees(List<String> treesList, int right, int down){
        int row = 0;
        int column = 0;
        int treeCount = 0;
        int rowLength = treesList.get(0).length() - 1;

        while (row < treesList.size()){
            if (treesList.get(row).charAt(column) == TREE) {
                treeCount++;
            }
            column += right;
            if (column > rowLength){
                column -= (rowLength + 1);
            }
            row += down;
        }

        return treeCount;
    }
}

package codeAdvent.utils.year2020;

import java.util.List;

public class DayOne {

    private DayOne() {

    }

    public static int puzzleOne(List<String> expenseReport) {

        boolean matchFound = false;
        int result = 0;
        for (int i = 0; i < expenseReport.size(); i++) {

            for (int j = 1; j < expenseReport.size(); j++) {
                if (Integer.valueOf(expenseReport.get(i)) + Integer.valueOf(expenseReport.get(j)) == 2020 ) {
                    result = Integer.valueOf(expenseReport.get(i)) * Integer.valueOf(expenseReport.get(j));
                    matchFound = true;
                    break;
                }

            }

            if (matchFound){
                break;
            }
        }

        return result;
    }

    public static int puzzleTwo(List<String> expenseReport) {
        boolean matchFound = false;
        int result = 0;
        for (int i = 0; i < expenseReport.size(); i++) {
            for (int j = 1; j < expenseReport.size(); j++) {
                for (int k = 0; k < expenseReport.size(); k++) {
                    if ((Integer.valueOf(expenseReport.get(i)) + Integer.valueOf(expenseReport.get(j)) + Integer.valueOf(expenseReport.get(k))) == 2020 ) {
                        result = Integer.valueOf(expenseReport.get(i)) * Integer.valueOf(expenseReport.get(j)) * Integer.valueOf(expenseReport.get(k)) ;
                        matchFound = true;
                        break;
                    }
                }
                if (matchFound){
                    break;
                }
            }
            if (matchFound){
                break;
            }
        }
        return result;
    }

}

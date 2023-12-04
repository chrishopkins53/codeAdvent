package codeAdvent.utils.year2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DayFour {

    private DayFour() {

    }

    public static int puzzleOne(List<String> documentsList) {
        int documentNum = 0;
        List<String> combinedDocs = new ArrayList<>();
        StringBuilder documentBuilder = new StringBuilder();

        for (String documentLine : documentsList) {
            if (documentLine.equals("")){
                combinedDocs.add(documentBuilder.toString());
                documentBuilder = new StringBuilder();
            } else {
                documentBuilder.append(documentLine + "/");
            }
        }
        combinedDocs.add(documentBuilder.toString()); //add the last one

        for (String document: combinedDocs) {
            if (document.contains("byr") &&
            document.contains("iyr") &&
            document.contains("eyr") &&
            document.contains("hgt") &&
            document.contains("hcl") &&
            document.contains("ecl") &&
            document.contains("pid")) {
                documentNum++;
            }
        }

        return documentNum;

    }

    public static int puzzleTwo(List<String> documentsList) {
        List<String> combinedDocs = new ArrayList<>();
        StringBuilder documentBuilder = new StringBuilder();

        for (String documentLine : documentsList) {
            if (documentLine.equals("")){
                combinedDocs.add(documentBuilder.toString());
                documentBuilder = new StringBuilder();
            } else {
                documentBuilder.append(documentLine + " ");
            }
        }
        combinedDocs.add(documentBuilder.toString());

        List<Map<String, String>> passPorts = new ArrayList<>();

        for (String document: combinedDocs) {
            String[] passPortArray = document.split(" ");
            Map<String, String> passportMap = new HashMap<>();

            for (String passportString : passPortArray) {
                String[] kv = passportString.split(":");
                passportMap.put(kv[0], kv[1]);

            }
            passPorts.add(passportMap);

        }

        int validPassports = 0;

        for (Map<String, String> passport : passPorts) {
            if (validate(passport)) {
                validPassports++;
            }
        }


        return validPassports;
    }

    private static boolean validate(Map<String, String> passport) {
        boolean valid = false;

        //todo: all those boring rules.
        return valid;
    }
}

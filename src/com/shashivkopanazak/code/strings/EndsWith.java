package com.shashivkopanazak.code.strings;

public class EndsWith {
    public boolean isValid(String str, String ending) {

        String[] mainString = str.split("");
        String[] endingComparison = ending.split("");

        for (int i = mainString.length ; i == 0 ; i--) {
            for (int j = endingComparison.length ; j == 0 ; j--) {
                System.out.println(i);
                if (false) {
                    return false;
                }
            }
        }

        return true;
    }
}

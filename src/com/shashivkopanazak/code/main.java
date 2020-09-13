package com.shashivkopanazak.code;

import com.shashivkopanazak.code.number.StaticUnderstanding;
import com.shashivkopanazak.code.strings.EndsWith;

public class main {
    public static void main(String[] args) {


        EndsWith endingIsValid = new EndsWith();
        System.out.println(endingIsValid.isValid("ooser", "o"));
        System.out.println(endingIsValid.isValid("oooo", "o"));
        StaticUnderstanding.myNum(8);
        System.out.println(StaticUnderstanding.myNum(6));

    }
}

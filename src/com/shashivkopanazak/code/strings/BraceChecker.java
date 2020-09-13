package com.shashivkopanazak.code.strings;

import java.util.Arrays;

public class BraceChecker {

   public boolean isValid(String braces) {
       String[] array = braces.split("");

       for (int i = 0; i < array.length; i += 2 ) {
           String firstComp = array[i];
           String secondComp = array[i + 1];

           if ((firstComp.equals("(") && !secondComp.equals(")")) || (firstComp.equals("[") && !secondComp.equals("]")) || (firstComp.equals("{") && !secondComp.equals("}"))) {
               return false;
           }
       }
       return true;
   }
}

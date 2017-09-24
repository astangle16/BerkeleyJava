package com.alec;

import org.testng.annotations.Test;

/**
 * Created by Alec on 9/18/17.
 */
public class Rodriguez_stangle_module2 {


    //Part 1
    // Which of the following will cause a compiler error? For those that have an error, explain what the error is.
    @Test
    public void part1() {

        // boolean b = 1;  // ANSWER: Incompatible types...requires boolean, found int

        char c1 = 130;

        // char c2 = "a"; // ANSWER: Incompatible types...requires char, found java.lang.String

        //int i1 = 4e2; // ANSWER: Incompatible types...requires int,found double

        //int i2 = 0xG;// ANSWER: requires at least one hexadicmal

        // short s = 0b00011101;// ANSWER: binary literals are not supported at this language level (Java 1.8)

        double d = 0xCAFE;

        //double = 3.14F; // ANSWER:unexpected tocken

        //long L1 = 12.0L;// ANSWER: can not resolve 'L'

        //long L2 = 12F;// ANSWER: Incompatible types...requires long

        long L3 = 40;

        float f1 = (float)3.14;

        float f2 = (float)7e24;

        //float f3 = 7e24;// ANSWER: Incompatible types...requiresfloat and found double

        int i3 = (int)(1.0 * 6L) / 3;

       // int i4 = 1.0 * 6L / 3F;// ANSWER: Incompatible types...requires int, found double

    }

    // Part 2
    // Which of the following expressions return true?
    @Test
    public void part2() {  // Overall Answer: only the first expression is true


        boolean result1 = 21000 <= 2.1e4; // ANSWER: true
        if(result1 == true) {
            System.out.println("Is true: " + "21000 <= 2.1e4");
        } else {
            System.out.println("Is false: " + "21000 <= 2.1e4");
        }

        // assume that int year = 2001;
        int year = 2001;
        boolean result2 = (year % 4) == 0; // ANSWER: False
        if(result2 == true) {
            System.out.println("Is true: " + "(year % 4) == 0;");
        } else {
            System.out.println("Is false: " + "(year % 4) == 0;");
        }


        boolean result3 = (int)35.2 > 35; //ANSWER: False
        if(result3 == true) {
            System.out.println("Is true: " + "(int)35.2 > 35;");
        } else {
            System.out.println("Is false: " + "(int)35.2 > 35;");
        }
    }

    // Part 3
    // What boolean values of a and b will make the following expression return true?
    @Test
    public void part3i() {

        // ANWER:
        // If (a, b) = (false, false)...Then expression = TRUE
        // (a, b) = (false, true) ...Then expression = TRUE
        // (a, b) = (true, false) ...Then expression = false
        // (a, b) = (true, true) ...Then expression = TRUE

        boolean a = true;
        boolean b = true;
        boolean result = !a || b;
        if(result == true) {
            System.out.println("Is true: " + "!a || b;");
        } else {
            System.out.println("Is false: " + "!a || b;");
        }
    }

    @Test
    public void part3j() {

        // ANWER:
        // If (a, b) = (false, false)...Then expression = TRUE
        // (a, b) = (false, true) ...Then expression = TRUE
        // (a, b) = (true, false) ...Then expression = TRUE
        // (a, b) = (true, true) ...Then expression = false

        boolean a = true;
        boolean b = true;
        boolean result = !(a && b) && true;
        if(result == true){
            System.out.println("Is true: " + "!(a && b) && true;");
        } else {
            System.out.println("Is false: " + "!(a && b) && true;");
        }
    }

    @Test
    public void part3k() {

        // ANWER:
        // If (a, b) = (false, false)...Then expression = false
        // (a, b) = (false, true) ...Then expression = false
        // (a, b) = (true, false) ...Then expression = false
        // (a, b) = (true, true) ...Then expression = TRUE

        boolean a = false;
        boolean b = true;
        boolean result = (a && b) || false;
        if (result == true) {
            System.out.println("is true" + "(a && b) || false");
        }else {
            System.out.println("Is false: " + "(a && b) || false");


        }
    }
    // Part 4
    // Explain what is wrong with the following expressions (assume all variables are booleans):
    @Test
    public void part4() {

        //is_empty && !is_empty; // ANSWER: is allways false

        //!isElectric || isElectric; // ANSWER: is allways true
    }
}

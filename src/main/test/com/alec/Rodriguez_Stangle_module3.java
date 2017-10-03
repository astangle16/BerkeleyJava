package com.alec;

import org.testng.annotations.Test;

/**
 * Created by Alec on 9/26/17.
 */
public class Rodriguez_Stangle_module3 {

    // 1.What does the following do?
    // ANSWER: It printed the following numbers 0, 12, 24, 36, 48, 60, 72, 84, 96.
    // These are all factors of 12, from 0 to 100
    @Test
    public void part1() {
        for (int i = 0; i < 100; i = i + 3) {

            for (int j = 0; j < 100; j = j + 4) {

                if (i == j) System.out.println(j);

            }

        }
    }

    // 2.Rewrite the following to use while loop instead of a for loop.
    // GIVEN: FOR LOOP
    @Test
    public void part2a() {
        int sum = 0;

        for (int n = 0; n < 100; n++) {
            System.out.println("n=" + n + "\t" + "before: " + sum + "+" + n);
            sum = sum + n;
            System.out.println("n=" + n + "\t" + "after, sum: " + sum);
        }

        System.out.println(sum);
    }

    // ANSWER: WHILE LOOP BELOW
    @Test
    public void part2b() {
        int sum = 0;
        int n = 0;
        while (n < 100) {
            System.out.println("n=" + n + "\t" + "before: " + sum + "+" + n);
            sum = sum + n;
            System.out.println("n=" + n + "\t" + "after, sum: " + sum);
            n++;
        }

        System.out.println(sum);
    }


    // 3.Write a program that will print numbers from 0 to 200. Use any of the iteration statements.
    @Test
    public void part3() {

        int n = 0;
        while (n <= 200) {
            System.out.println("n=" + n);
            n++;
        }
    }

    // 4.Write a loop from 0 to 100. It should do the following:
    @Test
    public void part4() {

        //print all numbers less than 10
        //print numbers divisible by 10
        //if the number is =>90 exit the loop

        int n = 0;
        while (n <= 100) {
            // System.out.println("n=" + n);
            if (n <= 10) {
                System.out.println("n under 10 =" + n);
            }
            if (n % 10 == 0) {
                System.out.println("n % 10 =" + n);
            }
            n++;
            if (n >= 90) {
                System.out.println("n >= 90 exiting with numbers above 90");
                return;

            }
        }
    }
}
package com.alec;

import org.testng.annotations.Test;

/**
 * Created by Alec on 11/13/17.
 */
public class Rodriguez_stangle_module5 {
    //    1. Initialize a two dimensional array with any type and values of your choosing.
    @Test
    public void part1() {
        int[][] multi = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
    }

    //2. Write a method that returns the average of an int array. The array has one dimension and can be of any size.
    @Test
    public void part2() {

        int[] data;

        data = new int[10];
        data[2] = 300;
        data[3] = 400;
        data[4] = 500;
        data[5] = 600;
        data[6] = 700;
        data[7] = 800;
        data[8] = 900;
        data[9] = 1000;

        int sum = 0;

        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }

        double average = sum / data.length;


        System.out.println("Average value of array element is " + average);


    }

    //3. Write a method to print all of the strings that contain the substring "ware" in the following array:
    @Test
    public void part3() {

    String[] term = {"software", "hardware", "firmware", "summer wear", "warehouse", "whereabouts", "dinnerware", "wearable", "somewhere"};

        for (int i = 0; i < term.length; i++) {
            String word = term[i];
            String keyword = "ware";
            if(word.contains(keyword)){
                System.out.println(word);
            }

        }
    }

}
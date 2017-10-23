package com.alec;

import org.testng.annotations.Test;

/**
 * Created by Alec on 10/14/17.
 */
public class Rodriguez_Stangle_module4 {

    // Directions: Create a document with your answers and save it in either .pdf or .doc format and upload it by
    // clicking on the submit button on this page. Title the document with your last name and the assignment, so, for
    // example, "Smith_Module4.pdf" Although it is not necessary to include the questions in your assignment, do be sure
    // to number your answers and show all work including, but not limited to: calculations, assumptions, commentary,
    // calculation notes, screenshots, reference citations, etc.

//1. Using the Phone class as a baseline, write a method is USA. It should return true if the country code is 1 and false
// otherwise.
@Test
public void part1() {
    phone usPhone = new phone(1, 415, "San Francisco");   // call constructor
    boolean resulta = usPhone.isUSA();

    if (resulta == true){ //
        System.out.println("correct response");
    } else{
        System.out.println("wrong respose");
    }

    phone arPhone = new phone(54, 717, "Buenos Aries");      // call constructor
    boolean resultb = arPhone.isUSA();

    if (resultb == false){
        System.out.println("correct response");
    } else{
        System.out.println("wrong respose");
    }

    }




//2. Also expanding the Phone class, write a method that determines the location of an area code. It should return the
// name of the area code's city.
@Test
public void part2(){
    phone usPhone = new phone(1, 415, "San Francisco");
    String resulta = usPhone.getcityname();

    if (resulta.equals("San Francisco")){ //
        System.out.println("correct response");
    } else{
        System.out.println("wrong respose");
    }

    phone arPhone = new phone(54, 717,"Buenos Aries");
    String resultb = arPhone.getcityname();

    if (resultb.equals("Buenos Aries")){
        System.out.println("correct response");
    } else{
        System.out.println("wrong respose");
    }

}





//3. Write a Rectangle class. Its constructor should accept length and width as a parameter. It should have methods that
// return its length, width, perimeter and area.
@Test

    public void part3() {
    rectangle rectangle1 = new rectangle(5, 7);
    System.out.println(rectangle1.getlength());
    System.out.println(rectangle1.getWidth());
    System.out.println(rectangle1.getperimeter());
    System.out.println(rectangle1.getarea());

    rectangle rectangle2 = new rectangle(9, 6);
    System.out.println(rectangle2.getlength());
    System.out.println(rectangle2.getWidth());
    System.out.println(rectangle2.getperimeter());
    System.out.println(rectangle2.getarea());



    }}
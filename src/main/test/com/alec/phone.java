package com.alec;

/**
 * Created by Alec on 10/14/17.
 */
public class phone {
    //Using the Phone class as a baseline, write a method is USA. It should return true if the country code is 1 and
    // false otherwise.
    int countrycode;
    int areacode;
    String phonenumber="";
    String location="";

    public phone(int countrycode, int areacode, String location) { // constructor
        this.countrycode = countrycode;
        this.areacode=areacode;
        this.location=location;

    }

    public boolean isUSA(){
        return 1==countrycode;
    }

    public String getcityname(){
        return location;
    }
}

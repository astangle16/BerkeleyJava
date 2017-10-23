package com.alec;

/**
 * Created by Alec on 10/22/17.
 */
public class rectangle {
    int length;
    int width;

    public rectangle (int length, int width){
        this.length=length;
        this.width=width;

    }
    public int getlength() {
        return length;
    }
    public int getWidth(){
        return width;
    }
    public int getperimeter(){
        return width*2 + length*2;
    }
    public int getarea(){
        return width*length;
    }
}

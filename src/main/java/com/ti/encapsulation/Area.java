package com.ti.encapsulation;

public class Area {
    int length;
    int breadth;

    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    protected void getArea(){
        int area = length*breadth;
        System.out.println("Area is: " + area);
    }

}

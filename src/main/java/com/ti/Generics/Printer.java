package com.ti.Generics;

public class Printer {

    int thingToPrint;

    public int printer(int p){
        this.thingToPrint = p;
        return p;
    }

    public void print(){
        System.out.println(thingToPrint);
    }

}

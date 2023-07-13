package com.ti;

public class Decimals {

    public static void main(String[] args) {
        String num = "99.99";
        int i = num.lastIndexOf('.');
        if(i != -1 && num.substring(i + 1).length() == 2) {
            System.out.println("The number " + num + " has two digits after dot");
        } else {
            System.out.println("No es decimal");
        }
    }
}

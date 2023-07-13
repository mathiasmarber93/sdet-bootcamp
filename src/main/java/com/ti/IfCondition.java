package com.ti;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your hero: ");
        String hero = sc.nextLine();

        String badPerson = "";
        System.out.println(hero);

        if (hero.equals("Spider-Man")){
            badPerson = "Venom";
            System.out.println("The villain is: " + badPerson);
        }

    }
}

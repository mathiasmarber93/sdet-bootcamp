package com.ti;

public class ConditionalStructures {

    public static void main(String[] args) {
        String hero = "Spider-Man";
        String multiverse = "Miles Morales";
        String loki = "";

        /*if(hero == "Spider-Man"){
            if(multiverse.equals("Miles Morales")){
                loki = "Spider-Man 2099";
            } else {
                loki = "Venom";
            }
        }  else {
            loki = "Loki";
        }*/

        loki = (hero.equals("Spider-Man")?("Spider-Man 2099"):("Loki"));

        System.out.println("Result: " + loki);

    }

}

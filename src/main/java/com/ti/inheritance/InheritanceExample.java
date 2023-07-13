package com.ti.inheritance;

public class InheritanceExample {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();
        animal.walk();

        Cat gardfield = new Cat();
        gardfield.eat();
        gardfield.walk();
        gardfield.hateMondays();

        Dog scooby = new Dog();
        scooby.loveDogChow();
        scooby.eat();

        Bird piolin = new Bird();
        piolin.drinkWater();
        piolin.walk();

    }
}

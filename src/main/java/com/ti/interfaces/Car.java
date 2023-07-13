package com.ti.interfaces;

public class Car implements Vehicle {

    int speed = 0;
    @Override
    public String stop(int quantity) {
        speed = speed - quantity;
        return "The car has stopped and is going " + speed + " km/h";
    }

    @Override
    public String accelerate(int quantity) {
        String speeding = "";
        speed = speed + quantity;
        if(speed>MAXIMUM_SPEED)
            speeding = "Speeding";
            speeding += "The car has accelerated and is going " + speed + " km/h";
        return speeding;
    }

    @Override
    public void vehicleName(String name) {
        System.out.println("Im a mustang");
    }
}

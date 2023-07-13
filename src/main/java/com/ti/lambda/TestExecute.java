package com.ti.lambda;

import java.util.ArrayList;

public class TestExecute {
    public static void main(String[] args) {
        //Cat cat = new Cat();
        //Printable lambdaPrint = n -> "Meow my name is " + n;
        //System.out.println(lambdaPrint.print("Kitty"));
        //printThing(lambdaPrint);
        Calculator calculator = ((a,b)->{
            double result = a+b;
            System.out.println(result);
        });

        Calculator calculatorSub = ((a,b)->{
            double result = a-b;
            System.out.println(result);
        });

        Calculator calculator1 = ((a,b)->{
            double result = a*b;
            System.out.println(result);
        });

        //calculator.operation(2,3);
        //calculatorSub.operation(20,5);
        //calculator1.operation(20,10);

        ArrayList<Integer> arrayNum = new ArrayList<>();
        arrayNum.add(1);
        arrayNum.add(2);
        arrayNum.add(3);
        arrayNum.add(4);
        arrayNum.add(5);


        arrayNum.forEach(System.out::println);

    }

    static void printThing(Printable printable){
        printable.print("name");
    }
}

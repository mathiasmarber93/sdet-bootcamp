package com.ti;

import java.util.Scanner;

public class unaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(num);*/


        System.out.println("Enter a positive number: ");

        int num = scanner.nextInt();

        int result = +num;
        // print the result using plus
        System.out.println(result);

        //result = -num;
        //print the result using minus
        System.out.println(-result);

        //print the result using prefix (++)
        System.out.println((++num));

        //print the result using prefix (--)
        System.out.println((--num));

        //print the result using postfix (++)
        System.out.println((num++));

        //print the result using postfix (--)
        System.out.println((num--));


    }
}

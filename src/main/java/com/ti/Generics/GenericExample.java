package com.ti.Generics;

public class GenericExample {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.printer(10);
        p.print();

        PrinterString ps = new PrinterString();
        ps.printer("10");
    }
}

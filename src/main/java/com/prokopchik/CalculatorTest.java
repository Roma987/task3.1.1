package com.prokopchik;


public class CalculatorTest {

    public static void main(String[] args) {
        StringCalculator stringCalculator = new StringCalculator();
        System.out.println(stringCalculator.stringTtoInt("5*5+(10+5)+10"));
        System.out.println(stringCalculator.stringTtoInt("sdsad"));
        System.out.println(stringCalculator.stringTtoInt("2/0"));
    }
}

package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // Number
        int firstNumber;
        int secondNumber;
        int answer;
        //Number initialized
        firstNumber = 5;
        secondNumber = 7;
        answer = 0;
        // Mathematical Operator
        String operator = "-";

        if (operator.equals("+")) {
            answer = firstNumber + secondNumber;
        } else if(operator.equals("-")) {
            answer = firstNumber - secondNumber;
//        } else {
//            answer
        }
        System.out.println(answer);
    }
}

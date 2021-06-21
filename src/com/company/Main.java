package com.company;

public class Main {
    public static void main(String[] args) {
        // Number and answer variables
        int firstNumber;
        int secondNumber;
        int answer;
        // Numbers
        firstNumber= 19;
        secondNumber= 21;
        answer= 0;

        // Mathematical Operator, You can choose +, -, *, /
        String operator="*";

        if (operator.equals("+")) {
            answer = firstNumber + secondNumber;
        } else if(operator.equals("-")) {
            answer = firstNumber - secondNumber;
        } else if(operator.equals("*")) {
            answer = firstNumber * secondNumber;
        } else if(operator.equals("/")) {
            answer = firstNumber / secondNumber;
        } else {
            System.out.println("Something went wrong, lets check the code");
        }
        System.out.println(answer);
    }
}

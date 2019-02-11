package com.training;

import java.util.Scanner;

public class View {
    public static final String INPUT_NUMBER = "Input number in range: ";
    public static final String TRY_NUMBER = "Try #";
    public static final String WRONG_NUMBER = "Wrong number.";
    public static final String WRONG_DATA_TYPE = "Wrong data type.";
    public static final String OUT_OF_RANGE = "Number is out of range. Repeat, please.";
    public static final String RESULT = "That is right number! Total number of tries: ";

    public void print(String message) {
        System.out.println(message);
    }
    public void printWithNumber(String message, int num) {
        System.out.println(message + " " + num);
    }
    public void printWithNumbers(String message, int num1, int num2) {
        System.out.println(message + " " + num1 + "-" + num2);
    }


}

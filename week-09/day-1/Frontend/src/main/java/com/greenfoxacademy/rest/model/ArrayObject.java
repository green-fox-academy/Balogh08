package com.greenfoxacademy.rest.model;

import java.util.List;

public class ArrayObject {
    private String what;
    private int[] numbers;

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public ArrayObject() {
    }

    public int sum() {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public int multiply() {
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }

    public int[] doubling() {
        int[] result = numbers.clone();
        for (int i = 0; i < result.length; i++) {
            result[i] *= 2;
        }
        return result;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

}


//    private String what;
//    private int[] numbers;
//    private Object result;
//
//    public int[] getNumbers() {
//        return numbers;
//    }
//
//    public void setNumbers(int[] numbers) {
//        this.numbers = numbers;
//    }
//
//    public ArrayObject() {
//    }
//
//    public void sum() {
//        Integer temp = 0;
//        for (int number : numbers) {
//            temp += temp;
//        }
//        result = temp;
//    }
//
//    public void multiply() {
//        Integer temp = 1;
//        for (int number : numbers) {
//            temp *= temp;
//        }
//        result = temp;
//    }
//
//    public void doubling() {
//        Integer[] temp = new Integer[numbers.length];
//        for (int i = 0; i < numbers.length; i++) {
//            temp[i] = numbers[i] * 2;
//        }
//        result = temp;
//    }
//
//    public String getWhat() {
//        return what;
//    }
//
//    public void setWhat(String what) {
//        this.what = what;
//    }
//
//    public Object getResult() {
//        return result;
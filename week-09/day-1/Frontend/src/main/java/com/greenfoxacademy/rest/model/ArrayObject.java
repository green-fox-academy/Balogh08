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

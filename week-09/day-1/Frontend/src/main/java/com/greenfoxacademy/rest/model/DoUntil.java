package com.greenfoxacademy.rest.model;

public class DoUntil {
    private Integer result;

    public DoUntil() {
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(String action, Integer number) {
        Integer temp = 0;
        Integer temp2 = 1;
        if (action.equalsIgnoreCase("sum")) {
            for (int i = 0; i <= number; i++) {
                temp += i;
            }
            this.result = temp;
        }
        if (action.equalsIgnoreCase("factor")) {
            for (int i = 1; i <= number ; i++) {
                temp2 *=i;
            }
            this.result = temp2;
        }
    }
}

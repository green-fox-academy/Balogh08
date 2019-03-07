package com.id.demo.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("red")
public class RedColor implements MyColor {
    public void printColor() {
        System.out.println("PRINTS IN: - RED");
    }
}

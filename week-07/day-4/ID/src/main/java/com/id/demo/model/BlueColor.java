package com.id.demo.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("blue")
public class BlueColor implements MyColor{
    private Printer printer;

    public BlueColor(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("PRINTS IN: - BLUE");
    }
}

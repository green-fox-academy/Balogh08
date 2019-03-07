package com.id.demo;

import com.id.demo.model.MyColor;
import com.id.demo.model.Printer;
import com.id.demo.model.RedColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrinterApplication implements CommandLineRunner {

    private Printer printer;
    private MyColor myColor;

    @Autowired
    PrinterApplication(Printer printer, @Qualifier("blue") MyColor myColor) {
        this.printer = printer;
        this.myColor = myColor;
    }


    public static void main(String[] args) {
        SpringApplication.run(PrinterApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("NICE JOB, IT'S WORKING!");
        myColor.printColor();
    }

}

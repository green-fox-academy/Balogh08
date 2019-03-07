package com.id.demo.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
    private ArrayList<String> colors;
    private Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public String validateEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            return "<span style=\"color:green\">" + email +  " is a valid email address!</span>";
        } else {
            return "<span style=\"color:red\">" + email + "<span style=\"color:red\"> is not a valid email address!</span>";
        }
    }

    public String caesar(String text, int number) {
        if (number < 0) {
            number = 26 + number;
        }

        String result = "";
        for(int i = 0; i < text.length(); i++) {
            int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
            result += (char)(((int)text.charAt(i) + number - offset) % 26 + offset);
        }
        System.out.println(result);
        return result;
    }
}

package practice;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create a lambda that takes two integer parameters and returns their sum
        //                      (argument list)   arrow token     { body of lambda}
        //AddInterface addFunction = (int a, int b)      ->           a+b;

        // Store it in a variable (Functional interface --> has only one abstract method)


        // Write in even simpler:
        AddInterface addFunction = (a, b)      ->           a+b;

        // Pass it to a method:
        // displaySum(addFunction);


        // Make it without creating a new variable
        displaySum((a, b)-> a+b);

        // Another example with one parameter / duplicate the input:
        DuplicateInterface duplicateFunction =  a -> a*2;
        System.out.println(duplicateFunction.duplicate(55));


        // Without new variable
        displayDuplicate(a -> a*2);

        SubtractInterface kivon = (a, b) -> a - b;
        System.out.println(kivon.subtract(0, 1));

        displaySubtraction((a, b) -> a - b);


    }

    private static void displaySum(AddInterface addFunction){
        System.out.println(addFunction.add(10,20));
    }

    private static void displayDuplicate(DuplicateInterface duplicateFunction){
        System.out.println(duplicateFunction.duplicate(55));
    }

    private static void displaySubtraction(SubtractInterface kivonas) {
        System.out.println(kivonas.subtract(5,4));
    }
}
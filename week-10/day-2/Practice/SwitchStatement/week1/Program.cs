using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace week1
{
    class Program
    {
        static void Main(string[] args)
        {

            //console.writeline("hello world!");

            //console.writeline(42);

            //console.write(3.1415);

            //console.writeline(2 + 2);
            //console.writeline(7 - 2);
            //console.writeline(3 * 2);
            //console.writeline(5 / 2);
            //console.writeline(7 % 2);
            //console.writeline(7 / 2.0);

            //console.write("my name is boti\n23\n180");

            //int workdays = 5;
            //int weeks = 17;
            //int avgworkperday = 6;

            //console.writeline("student writes code for " + workdays * avgworkperday * weeks + " during greenfox!");

            //// print the body mass index (bmi) based on these values
            //double massinkg = 81.2;
            //double heightinm = 1.78;

            //console.writeline(massinkg / (heightinm * heightinm));

            //console.writeline("hello user what is your name?");
            //string name = console.readline();

            //console.writeline("hello, " + name);
            //console.writeline("how old are you? ");

            //string age = console.readline();
            //console.writeline(age + " is a nice age");

            //int[] numbers = new int[5];
            //int avg = 0;
            //int sum = 0;
            //for (int i = 0; i < 5; i++)
            //{
            //    console.writeline("give me" + (5 - i) + " number!");
            //    numbers[i] = int.parse(console.readline());
            //    sum += numbers[i];
            //}

            //console.writeline("avg: " + (sum / numbers.length) + ", sum: " + sum);

            //console.writeline("please select coffee size: 1=small, 2=medium, 3=large");
            //string input = console.readline();
            //int price = 0;

            //switch (input)
            //{
            //    case "1":
            //    case "small":
            //        price = 5;
            //        break;
            //    case "2":
            //    case "medium":
            //        price = 7;
            //        break;
            //    case "3":
            //    case "large":
            //        price = 9;
            //        break;
            //    default:
            //        console.error.writeline("invalid size. please try again.");
            //        return;
            //}

            //console.writeline($"price: ${price}");

            // Create a very simplistic calculator: ask for two numbers and an operation (add, subtract, multiply or divide)
            // Based on the operation provided print the result of the calculation.

            //Console.WriteLine("Welcome to the Calculator!");
            //Console.WriteLine("Please provide the first number:");

            //// Get the first number:
            //int num1 = int.Parse(Console.ReadLine());
            //// int number1 = ...

            //Console.WriteLine("Please provide the second number:");

            //// Get the second number:
            //int num2 = int.Parse(Console.ReadLine());
            //// int number2 = ...

            //Console.WriteLine("Please provide the operation (add, subtract, multiply or divide):");

            //string input = Console.ReadLine();
            //switch(input)
            //{
            //    case "add":
            //    case "+":
            //        Console.WriteLine("Result of add: " + (num1 + num2));
            //        break;
            //    case "subtract":
            //    case "-":
            //        Console.WriteLine("Result of subtract: " + (num1 - num2));
            //        break;
            //    case "multiply":
            //    case "*":
            //        Console.WriteLine("Result of multiply: " + (num1 * num2));
            //        break;
            //    case "divide":
            //    case "/":
            //        Console.WriteLine("Result of divide: " + (num1 / num2));
            //        break;
            //    default:
            //        Console.Error.WriteLine("Invalid operator, please try again");
            //        return;
            //}
            //// Get the operation from standard input:
            //// string operation = ...

            //// use the `switch` statement and the corresponding calculation
            //// store the result of the calculation in the `result` variable

            //double result = 0.0;

            //Console.WriteLine($"The result of the calculation is {result}");


            string myWord = "Hello";
            string subWord = myWord.Substring(1,2);
            string subWord2 = "ll";
            substr(myWord, subWord2);

            Console.WriteLine(subWord);
            Console.WriteLine(substr("valami", "mi"));

            Console.Read();
        }

        static String substr(string myWord, string subWord)
        {

            char[] letters = subWord.ToCharArray();
            char[] myWordsLetters = myWord.ToCharArray();

            for(int i = 0; i < myWord.Length; i++)
            {
                if(myWordsLetters[i] == letters[0])
                {
                    for(int j = 1; j < letters.Length; j++)
                    {
                        try
                        {
                            if (letters[j] != myWordsLetters[i + j])
                            {
                                break;
                            }
                        }
                        catch (IndexOutOfRangeException ex)
                        {
                            break;
                        }

                        if (letters[j] == letters[letters.Length - 1])
                            {
                                return subWord;
                            }
                        
                    }
                }
            }


            return "-1";
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StringAndList
{
    class Program
    {
        static void Main(string[] args)
        {
            // The code provided will print ‘Hello World’ to the console.
            // Press Ctrl+F5 (or go to Debug > Start Without Debugging) to run your app.
            Console.WriteLine("Hello World!");
            Console.ReadKey();

            // Go to http://aka.ms/dotnet-get-started-console to continue learning how to build a console app! 

            string example = "In a dishwasher far far away";
            string replaced = example.Replace("dishwasher", "galaxy");

            // I would like to replace "dishwasher" with "galaxy" in this example, but it has a problem.
            // Please fix it for me!
            // Expected ouput: In a galaxy far far away

            Console.WriteLine(replaced);
            Console.ReadLine();

            string todoText = " - Buy milk\n";
            // Add "My todo:" to the beginning of the todoText
            // Add " - Download games" to the end of the todoText
            // Add " - Diablo" to the end of the todoText but with indentation

            // Expected output:

            // My todo:
            //  - Buy milk
            //  - Download games
            //      - Diablo

            todoText = "My todo:\n - Buy milk\n - Download games\n     - Diablo";

            Console.WriteLine(todoText);
            Console.ReadLine();

            string reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

            // Create a method that can reverse a String, which is passed as the parameter
            // Use it on this reversed string to check it!



            Console.WriteLine(Reverse(reversed));
            Console.ReadLine();

            string simpleString = "Hello";
            StringBuilder myString = new StringBuilder(simpleString);
            myString.Append(" Boti!");

            Console.WriteLine(myString);
            Console.ReadLine();

            List<string> names = new List<string>();
            names.Add("Laci");
            names.Add("Jani");
            names.Add("Zsófi");
            names.Add("Szabi");
            names.Add("Boti");

            writeAllListElement(names);
            Console.WriteLine("Count: {0}", names.Count);
            if (names.Count == 0)
            {
                Console.WriteLine("It's an empty list!");
            }
            else
            {
                Console.WriteLine("Size of list: {0}", names.Count);
            }

            Console.ReadLine();

            Dictionary<int, string> map = new Dictionary<int, string>();

            checkIfEmpty(map);

            map.Add(1, "one");
            map.Add(2, "two");
            map.Add(3, "three");
            map.Add(4, "four");

            foreach (KeyValuePair<int, string> entry in map)
            {
                Console.WriteLine("Key: " + entry.Key + ", value: " + entry.Value);
            }


            Console.ReadLine();

            checkIfEmpty(map);

            map.Remove(2);

            foreach (KeyValuePair<int, string> entry in map)
            {
                Console.WriteLine("Key: " + entry.Key + ", value: " + entry.Value);
            }

            Console.WriteLine(map.Values.Max());
            Console.WriteLine(map.Values.Min());
            Console.ReadLine();

            checkIfEmpty(map);
        }

        public static void checkIfEmpty(Dictionary<int, string> map)
        {
            if (map.Count == 0)
            {
                Console.WriteLine("Empty");
                Console.ReadLine();
            }
            else
            {
                Console.WriteLine("Map size is {0}", map.Count);
                Console.ReadLine();
            }
        }

        public static string Reverse(string word)
        {
            //char[] charArray = word.ToCharArray();
            //Array.Reverse(charArray);
            //return new String(charArray);
            return new string(word.Reverse().ToArray());
            //return string.Join("", word.ToArray().Reverse());
        }

        public static void writeAllListElement(List<string> original)
        {
            foreach(string element in original)
            {
                Console.WriteLine(element);
            }
        }
    }
}

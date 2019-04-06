using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LinQ
{
    class Program
    {
        static void Main(string[] args)
        {

            int[] n = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };

            var exc1 = from number in n
                       where number % 2 == 0
                       orderby number descending
                       select number;
            foreach (int number in exc1)
            {
                Console.WriteLine(number);
            }

            Console.WriteLine("-------------New excercise-------------");

            List<int> exc1lambda = n.Where(x => x % 2 == 0).OrderBy(x => x).ToList();

            exc1lambda.ForEach(x => Console.Write(@"{0}, ", x));

            Console.WriteLine("-------------New excercise-------------");

            int[] n2 = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };

            var exc2 = from number in n2
                       where number % 2 != 0
                       select number;
            Console.WriteLine(exc2.Average());

            double exc2Avg = 0;
            foreach(int number in exc2)
            {
                exc2Avg += number;
            }


            exc2Avg = exc2Avg / exc2.Count();

            Console.WriteLine(@"Average: {0}", exc2Avg);

            Console.WriteLine("-------------New excercise-------------");

            double exc2lambda = n.Where(x => x % 2 != 0).Average();

            Console.WriteLine(@"Average: {0}", exc2lambda);
            Console.WriteLine(n.Where(x => x % 2 != 0).Average());
            
            Console.WriteLine("-------------Exercise 5-------------");

            int[] n5 = new int[] { 5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2 };

            var exc5 = from number in n5
                       group number by number;

            foreach(var number in exc5)
            {
                Console.WriteLine(@"Key: {0}, Value: {1}", number.Key, number.Count());
            }

            Console.WriteLine("-------------Exercise 6-------------");

            string myString = "Mehecske";
            var exc6 = from character in myString
                       group character by character;

            foreach(var charachter in exc6)
            {
                Console.WriteLine(@"Charachter: {0} , apperance: {1}", charachter.Key, charachter.Count());
            }

            Console.WriteLine("-------------Exercise Delegate and Func-------------");

            int[] myNumbers = { 1,2,3,4,5};

            Func<int, int, int> addFunciton = delegate(int a, int b){
                return a + b;
            };
            Console.WriteLine(myNumbers.Aggregate(addFunciton));

            Console.WriteLine("-------------Exercise 7-------------");

            string[] cities = { "ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS" };

            var exc7lambda = cities.Where(x => x[0] == 'A' && x[x.Length - 1] == 'I');

            foreach (var city in exc7lambda)
            {
                Console.WriteLine(@"City: {0}", city);
            }

            var exc7 = from c in cities
                       where (c[0] == 'Z' && c[c.Length - 1] == 'H')
                       select (c);

            foreach (var c in exc7)
            {
                Console.WriteLine(@"City: {0}", c);
            }

            Console.WriteLine("-------------Exercise 8-------------");

            string[] cities2 = { "Rome", "London", "Nairobi", "CalifOrnia", "Zurich", "New Deldhi"};

            var exc8 = from c in cities2
                       from chars in c
                       where Char.IsUpper(chars)
                       select chars;

            foreach (var chars in exc8)
            {
                Console.WriteLine(@"Character: {0}", chars);
            }

            List<char> chars2 = new List<char>();

            foreach (string city in cities2)
            {
                for(int i = 0; i < city.Length; i++)
                {
                    if (Char.IsUpper(city[i]))
                    {
                        Console.WriteLine(@"Character by for: {0}
                        ", city[i]);
                    }
                }
            }

            Console.WriteLine("-------------Exercise 9-------------");

            char[] myCharacterArray = { 'B', 'o', 't', 'i' };

            var exc9 = from c in myCharacterArray
                       select c;

            string exc9String = "";

            StringBuilder myBuilder = new StringBuilder();

            foreach(char c in myCharacterArray)
            {
                exc9String += c;
                myBuilder.Append(c);
            }

            Console.WriteLine(exc9String);
            Console.WriteLine(myBuilder);



            Console.ReadLine();
           
        }
    }
}

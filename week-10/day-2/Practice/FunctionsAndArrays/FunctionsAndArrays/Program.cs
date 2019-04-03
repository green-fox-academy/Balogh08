using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FunctionsAndArrays
{
    class Program
    {
        public static object MessageBox { get; private set; }

        static void Main(string[] args)
        {
            Console.WriteLine("Tell me which number to fract!");
            int num = int.Parse(Console.ReadLine());
            Console.WriteLine(factorial(num));
            Console.ReadKey();

            DateTime time = DateTime.Now;
            Console.WriteLine("Today is {0:d} at {0:T}.", time);
            Console.WriteLine("Today is {0}.", time);
            Console.ReadKey();

            int[] numbers = { 1, 2, 3, 8 };

            // Print the second element of the array
            Console.WriteLine(numbers[1]);

            // Print all the array elements
            for (int i = 0; i < numbers.Length; i++)
            {
                Console.Write(numbers[i] + ", ");
            }

            Console.ReadLine();

            int[] p1 = { 1, 2, 3 };
            int[] p2 = { 1, 2 };

            if (p1.Length > p2.Length)
            {
                printAll(p1);
            }
            else if (p1.Length < p2.Length)
            {
                printAll(p2);
            }
            else
            {
                printAll(p1);
                printAll(p2);
            }
            Console.ReadLine();

            int[] toBeReversedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            toBeReversedArray.Reverse();
            ArrayList myList = new ArrayList(5);
            myList.Add(1);
            myList.Add(2);
            myList.Add(3);
            myList.Add(4);
            myList.Add(5);
            myList.Reverse();
            foreach(int number in myList)
            {
                Console.WriteLine(number + ", ");
            }

            Console.ReadLine();

            int[] toBeSorted = { 3, 4, 5, 6, 2, 3 };
            Array.Sort(toBeSorted);
            printAll(toBeSorted);
            Console.ReadLine();

            

        }

        public static int factorial(int num)
        {
            int result = 1;

            for (int i = 0; i < num; i++)
            {
                result *= (i + 1);
            }

            return result;
        }

        public static void printAll(int[] array)
        {
            foreach (int element in array)
            {
                Console.Write(element + ", ");
            }
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FunctionsAndArrays
{
    class Program
    {
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
    }
}

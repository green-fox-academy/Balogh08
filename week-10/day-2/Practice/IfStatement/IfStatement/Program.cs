using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IfStatement
{
    class Program
    {
        static void Main(string[] args)
        {
            string myString = "Hello";
            int myNumber = 10;

            if(myString == "Hello")
            {
                Console.WriteLine("True");
            }
            else
            {
                Console.WriteLine("False");
            }

            if(myNumber == 10)
            {
                Console.WriteLine(myNumber);
            }

            Console.Read();
        }
    }
}

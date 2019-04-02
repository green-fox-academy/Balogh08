using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloWorld
{
    class Program
    {
        static void Main(string[] args)
        {
            string message = "Enter your name: ";
            string name;

            Console.Write(message);

            name = Console.ReadLine();

            Console.WriteLine("Hello, " + name + "!");

            Console.ReadLine();

        }
    }
}

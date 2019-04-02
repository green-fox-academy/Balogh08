using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SwitchStatement
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Please enter a number");
            int userNumber = int.Parse(Console.ReadLine());
            /*
            if(userNumber == 10)
            {
                Console.WriteLine("Your number is 10");
            }
            else if (userNumber == 20)
            {
                Console.WriteLine("Your number is 20");
            }
            else if (userNumber == 30)
            {
                Console.WriteLine("Your number is 30");
            }
            else
            {
                Console.WriteLine("Your number is not 10, 20 nor 30");
            }
            */

            /*
            switch (userNumber)
            {
                case 10:
                    Console.WriteLine("Your number is 10");
                    break;
                case 20:
                    Console.WriteLine("Your number is 20");
                    break;
                case 30:
                    Console.WriteLine("Your number is 30");
                    break;
                default:
                    Console.WriteLine("Your number is not 10, 20 nor 30");
                    break;
            }
            */
            switch (userNumber)
            {
                case 10:
                case 20:
                case 30:
                    Console.WriteLine("Your number is {0}", userNumber);
                    break;
                default:
                    Console.WriteLine("Your number is not 10, 20 nor 30");
                    break;
            }

            //{0} placeholder

            //Console.ReadLine();
        }
    }
}

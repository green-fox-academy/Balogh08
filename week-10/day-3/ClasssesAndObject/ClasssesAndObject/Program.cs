using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClasssesAndObject
{
    class Program
    {
        static void Main(string[] args)
        {
            Person person1 = new Person();
            SuperPerson superPerson = new SuperPerson();

            person1.FirstName = "Botond";
            person1.LastName = "Balogh";

            superPerson.FirstName = "László";
            superPerson.LastName = "Molnár";

            person1.GetFullName();
            superPerson.Fly();
            Console.ReadLine();
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inheritence
{
    class Program
    {
        static void Main(string[] args)
        {
            Person person1 = new Person("Boti", 23, Gender.Male);
            person1.Introduce();
            person1.GetGoal();

            Student person2 = new Student("László", 29, Gender.Male);
            person2.UseAllMethods();
            Console.WriteLine(person2.SkipDays);

            Console.ReadLine();
        }
    }
}

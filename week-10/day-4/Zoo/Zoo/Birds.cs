using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Zoo
{
    class Birds : Animal
    {
        public Birds(string name, int age, Gender gender) : base(name, age, gender)
        {

        }

        public override void Greet()
        {
            Console.WriteLine("A bird says: csip csirip!");
        }

        public override void ToString()
        {
           Console.WriteLine($"The name of the bird is {Name}, it is {Age} year old and {Gender}, and says \"csip csirip!\"");
        }

        public override void WantChild()
        {
            Console.WriteLine("want a child from an egg!");
        }
    }
}

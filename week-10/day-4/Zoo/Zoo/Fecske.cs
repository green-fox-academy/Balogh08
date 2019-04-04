using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Zoo
{
    class Fecske : Birds, Moveable
    {
        public Fecske(string name, int age, Gender gender) : base(name, age, gender)
        {
        }

        public void Swim()
        {
            Console.WriteLine("This type of bird can fly but not swim!");
        }

        public override void ToString()
        {
            Console.WriteLine($"The name of the bird, which is a fecske, is {Name}. It is {Age} year old and {Gender}, and says \"csip csirip!\"");
        }
    }
}

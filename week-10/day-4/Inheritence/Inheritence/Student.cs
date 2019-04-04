using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inheritence
{
    class Student : Person
    {
        private int skipDays;

        public Student(string name, int age, Gender gender) : base(name, age, gender)
        {
            skipDays = 0;
        }

        public int SkipDays { get => skipDays; set => skipDays = value; }

        public override void GetGoal()
        {
            Console.WriteLine("My goal is: Learn C#!");
        }

        public void UseAllMethods()
        {
            GetGoal();
            Introduce();
        }
    }
}

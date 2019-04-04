using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inheritence
{
    class Person
    {
        private string name;
        private int age;
        private Gender gender;

        public string Name { get => name; set => name = value; }
        public int Age { get => age; set => age = value; }
        internal Gender Gender { get => gender; set => gender = value; }

        public Person ()
        {
        }

        public Person(string name, int age, Gender gender)
        {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public void Introduce()
        {
            Console.WriteLine($"Hi, I'm {name}, a {age} year old {gender}.");
        }

        public virtual void GetGoal()
        {
            Console.WriteLine("My goal is: Live for the moment!");
        }
    }
}

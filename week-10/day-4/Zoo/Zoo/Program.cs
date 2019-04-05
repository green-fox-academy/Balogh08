using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Zoo
{
    class Program
    {
        public delegate void SomeMehtodPtr();
        static void Main(string[] args)
        {
            var bird = new Penguin("Madár", 4, Gender.female);
            var bird2 = new Fecske("RigóJancsi", 14, Gender.male);
            var bird3 = new Fecske("Jancsi", 19, Gender.male);

            bird.ToString();
            bird.Swim();
            bird2.ToString();
            bird2.Swim();
            List<Animal> animals = new List<Animal>();
            animals.Add(bird);
            animals.Add(bird2);
            animals.Add(bird3);

            animals = animals.OrderBy(x => x.Name).ToList();
            foreach(Animal animal in animals)
            {
                animal.ToString();
            }

            Console.WriteLine("--------------------------------------------");

            int yearsTotal = animals.Sum(x => x.Age);
            Console.WriteLine(yearsTotal);
            var animalsMoreThan10YearsOld = from x in animals
            where x.Age > 10
            select x;
            foreach (Animal animal in animalsMoreThan10YearsOld)
                Console.WriteLine(animal.Name);
            Console.WriteLine("--------------------------------------------");

            var animalsMoreThan10YearsOld2 =
                animals
                .Where(n => n.Age > 10)
                .Select(n => n);
            foreach (Animal animal in animalsMoreThan10YearsOld2)
                Console.WriteLine(animal.Name);
            Console.WriteLine("--------------------------------------------");

            SomeMehtodPtr obj = new SomeMehtodPtr(SomeMethod);
            obj.Invoke();

            Console.ReadLine();
        }

        static void SomeMethod()
        {
            Console.WriteLine("Method called");
        }
    }
}

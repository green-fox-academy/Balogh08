using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Zoo
{
    class Program
    {
        static void Main(string[] args)
        {
            var bird = new Penguin("madár", 4, Gender.female);
            var bird2 = new Fecske("RigóJancsi", 14, Gender.male);
            
            bird.ToString();
            bird.Swim();
            bird2.ToString();
            bird2.Swim();

            Console.ReadLine();
        }
    }
}

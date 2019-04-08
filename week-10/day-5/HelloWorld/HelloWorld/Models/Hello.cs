using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace HelloWorld.Models
{
    public class Hello
    {
        public string Greet { get; set; }
        public string Size { get; set; }
        public int Red { get; set; }
        public int Green { get; set; }
        public int Blue { get; set; }
        public string[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

        public string[] getHellos()
        {
            return hellos;
        }

        public override string ToString()
        {
            string hello = "";

            foreach(string hi in hellos)
            {
                hello += "! " + hi;
            }

            return hello;
        }

        public Hello()
        {
            Random random = new Random();
            int randomIndex = random.Next(1, hellos.Length - 1);
            Size = random.Next(10, 100).ToString() + "px";
            Red = random.Next(0, 254);
            Green = random.Next(0, 254);
            Blue = random.Next(0, 254);
            Greet = hellos[randomIndex];
        }
    }
}

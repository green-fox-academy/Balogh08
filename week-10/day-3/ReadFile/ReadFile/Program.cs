using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ReadFile
{
    class Program
    {
        private static object error;

        static void Main(string[] args)
        {
            //The code provided will pgit arint ‘Hello World’ to the console.
            // Press Ctrl+F5(or go to Debug > Start Without Debugging) to run your app.
            Console.WriteLine("Hello World!");
            Console.ReadKey();

            //Go to http://aka.ms/dotnet-get-started-console to continue learning how to build a console app! 

            File.WriteAllText("myFile", "Hello");
            Console.WriteLine(File.ReadAllText("myFile"));
            Console.ReadLine();

            StreamReader myReader = new StreamReader("TextFile1.txt");
            string line = "";

            while (line != null)
            {
                line = myReader.ReadLine();
                if (line != null)
                {
                    Console.WriteLine(line);
                }
            }

            Console.WriteLine(File.ReadAllText("TextFile1.txt"));
            myReader.Close();
            Console.ReadLine();

            string[] lines = { "This is line1", "This is line2", "This is line5" };
            System.IO.StreamWriter writer = new System.IO.StreamWriter(@"C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-10\day-3\ReadFile\ReadFile\bin\Debug\myFile.txt");

            using (writer)
            {
                foreach (string row in lines)
                {
                    writer.WriteLine(row);
                }
            }

            int x = 1;
            int y = 0;

            try
            {
                double z = x / y;
                Console.WriteLine(z);
            }
            catch (Exception ex)
            {
                Console.WriteLine("Cannot divide by 0");
            }
            finally
            {
                Console.WriteLine(x);
                Console.WriteLine(y);
            }

            Console.ReadLine();

            //StreamReader myReader2 = new StreamReader(@"..\..\beep.txt");

            //string data = myReader2.ReadLine();

            //while (data != null)
            //{
            //    Console.WriteLine(data);
            //    string[] values = data.Split(',');
            //    int frequency = Int32.Parse(values[0]);
            //    int duration = Int32.Parse(values[1]);
            //    Console.Beep(frequency, duration);
            //    data = myReader2.ReadLine();
            //}
            //Console.ReadLine();
            string fileName = "my-file";
            File.WriteAllText("my-file", "Hello\nBoti\nvagyok\n!");
            try
            {
                Console.WriteLine(File.ReadAllText(fileName));
            }
            catch (System.IO.FileNotFoundException e)
            {
                Console.WriteLine($"Unable to read file: {fileName}");
            }
            Console.ReadLine();

            File.Delete("my-files");
        }
    }
}

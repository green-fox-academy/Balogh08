using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClasssesAndObject
{
    public class Person
    {
        private string _firstName;
        //private string _lastName;

        public string FirstName {
            get
            {
                return _firstName;
            }

            set
            {
                _firstName = value;
            }
        }

        public string LastName { get; set; }

        //public string LastName
        //{
        //    get
        //    {
        //        return _lastName;
        //    }
        //    set
        //    {
        //        _lastName = value;
        //    }
        //}

        public Person()
        {

        }

        public Person(string FirstName, string LastName)
        {
            this.FirstName = FirstName;
            this.LastName = LastName;
        }

        public void GetFullName()
        {
            Console.WriteLine("Get my fullname {0} {1}", FirstName, LastName);
        }
    }
}

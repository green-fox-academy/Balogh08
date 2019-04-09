using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Simba.Models
{
    public class BankAccount 
    {
        public string Name { get; set; }
        public long Balance { get; set; }
        public AnimalType AnimalType { get; set; }
        public int Id { get; private set; }
        public bool IsKing { get; set; }
        public bool IsGood { get; set; }
    
        private static int IdGenerator;

        public BankAccount()
        {
            IdGenerator++;
        }

        public BankAccount(string name, long balance, AnimalType animalType)
        {
            Name = name;
            Balance = balance;
            AnimalType = animalType;
            IdGenerator++;
            Id = IdGenerator;

        }

        public BankAccount(string name, long balance, AnimalType animalType, bool isKing)
        {
            Name = name;
            Balance = balance;
            AnimalType = animalType;
            IdGenerator++;
            Id = IdGenerator;
            IsKing = isKing;
        }

        public BankAccount(string name, long balance, AnimalType animalType, bool isKing, bool isGood)
        {
            Name = name;
            Balance = balance;
            AnimalType = animalType;
            IdGenerator++;
            Id = IdGenerator;
            IsGood = isGood;
        }

        public void IncreaseBalance()
        {
            Balance += 100;
        }
    }
}

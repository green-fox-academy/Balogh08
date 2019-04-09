using Simba.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Simba.ViewModel
{
    public class AccountIndex
    {
        public List<BankAccount> Accounts { get; set; }

        public AccountIndex()
        {
            Accounts = new List<BankAccount> {
            new BankAccount("Simba", 2000, AnimalType.lion, true, true),
            new BankAccount("Lali", 1000, AnimalType.cat, false, true),
            new BankAccount("MufaAa", 5000, AnimalType.monkey, false, true),
            new BankAccount("Pumba", 2000, AnimalType.dog, false, false),
            };
        }

        public BankAccount FindById(int id)
        {
            return Accounts[id];
        }

        public void IncreaseBalance(int id)
        {
            Accounts[id].Balance += 100;
        }
    }
}

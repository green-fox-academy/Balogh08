using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Simba.Models;
using Simba.ViewModel;

namespace Simba.Controllers
{
    [Route("")]
    public class AccountController : Controller

    {
        AccountIndex Accounts;

        public AccountController(AccountIndex accounts)
        {
            this.Accounts = accounts;
        }

        [HttpGet("show")]
        public IActionResult Index()
        {
            return View(Accounts);
        }

        [HttpGet("html")]
        public IActionResult Htmlception()
        {
            string myString = "This is an<em> HTML </em> text. <b> Enjoy yourself!</b> ";

            ViewData["printText"] = myString;
            return View();
        }

        [HttpPost("add/{id}")]
        public IActionResult AddGold(int Id)
        {
            Accounts.FindById(Id).IncreaseBalance();
            return Redirect("/show");
        }

        [HttpGet("show/{id}")]
        public IActionResult SingleAccount(int Id)
        {
            BankAccount account = Accounts.FindById(Id);
            return View(account);
        }

    }
}   
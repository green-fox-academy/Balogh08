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
        static AccountIndex accounts = new AccountIndex();

        [HttpGet("show")]
        public IActionResult Index()
        {
            return View(accounts);
        }

        [HttpGet("html")]
        public IActionResult Htmlception()
        {
            string myString = "This is an<em> HTML </em> text. <b> Enjoy yourself!</b> ";

            ViewData["printText"] = myString;
            return View();
        }

        [HttpPost("add/{id}")]
        public IActionResult AddGold([FromQuery]int Id)
        {
            accounts.FindById(Id).IncreaseBalance();
            return Redirect("/show");
        }

        [HttpGet("show/{id}")]
        public IActionResult SingleAccount([FromQuery]int Id)
        {
            
            return View(accounts.FindById(Id));
        }

    }
}   
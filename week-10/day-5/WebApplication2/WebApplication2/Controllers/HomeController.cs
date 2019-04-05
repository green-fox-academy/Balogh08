using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;

namespace WebApplication2.Controllers
{
    public class HomeController : Controller
    {
        [Route("/")]
        public string Index()
        {
            return "Hello from the Controller!";
        }
    }
}
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using DependencyInjection.Models;
using Microsoft.AspNetCore.Mvc;

namespace DependencyInjection.Controllers
{
    
    public class PrinterController : Controller
    {
        Printer printer = new Printer();

        [Route("/")]
        public IActionResult Index()
        {
            printer.Log("Nice job!");
            return View(printer);
        }
    }
}
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using HelloWorld.Models;
using Microsoft.AspNetCore.Mvc;

namespace HelloWorld.Controllers
{   
    //[Route("[contorller]") --> hello
    [Route("web")]
    public class HelloController : Controller
    {
        [HttpGet("languages")]
        public IActionResult Languages()
        {
            var languages = new Hello();

            return View(languages);
        }
    }
}
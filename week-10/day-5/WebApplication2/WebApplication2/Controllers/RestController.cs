using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using WebApplication2.Models;

namespace WebApplication2.Controllers
{

    [Route("api")]
    public class RestController : Controller
    {

        static int counter;
        static int siteCounter;

        [Route("greeting")]
        [HttpGet]
        public Greeting Greet(String name)
        {
            if(name != null)
            {
            counter++;
            return new Greeting(counter, name);
            } else
            {
                return new Greeting(counter, "No name was provided!");
            }
        }

        [HttpGet("counter")]
        public String Counter(String name)
        {
            siteCounter++;
            counter++;
            Greeting greet = new Greeting(counter, name);
            return $"Hello, {name}! This site was loaded {siteCounter} times since last server start.";
        }
    }
}
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using DataBaseIntegration.Models;
using Microsoft.AspNetCore.Mvc;

namespace DataBaseIntegration.Controllers
{
    [Route("todo")]
    public class TodoController : Controller
    {
        private readonly ApplicationContext ApplicationContext;

        public TodoController(ApplicationContext ApplicationContext)
        {
            this.ApplicationContext = ApplicationContext;
        }

        [HttpGet("list")]
        [HttpGet("")]
        public IActionResult List()
        {
            List<Todo> todos = new List<Todo>
            {
                new Todo("Eat"),
                new Todo("Drink"),
                new Todo("Wash"),
                new Todo("Iron"),
            };
            return View(todos);
        }

        [HttpGet("mytodos")]
        public IActionResult Index(bool IsActive)
        {
            // Create a SQL query in the background

            if (IsActive)
            {
                var todos = ApplicationContext.Todos
                .Where(x => x.IsDone == false)
                .ToList();
                return View(todos);
            }
            else
            {
                var todos = ApplicationContext.Todos.ToList();
                return View(todos);
            }
            
        }
    }
}
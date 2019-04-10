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
        public IActionResult Index(string IsActive="")
        {
            // Create a SQL query in the background

            if (IsActive.Equals("true", StringComparison.InvariantCultureIgnoreCase))
            {
                var todos = ApplicationContext.Todos
                .Where(x => x.IsDone == false)
                .ToList();
                return View(todos);
            }
            else if(IsActive.Equals("false", StringComparison.InvariantCultureIgnoreCase))
            {
                var todos = ApplicationContext.Todos
                .Where(x => x.IsDone == true)
                .ToList();
                return View(todos);
            }
            else
            {
                var todos = ApplicationContext.Todos.ToList();
                return View(todos);
            }
        }

        [HttpGet("add")]
        public IActionResult AddTodo()
        {
            return View("Add");
        }

        [HttpPost("add")]
        public IActionResult AddTodoAndReturnList(string title)
        {
            ApplicationContext.Todos.Add(new Todo(title));
            ApplicationContext.SaveChanges();

            //return RedirectToAction("Index");
            return Redirect("mytodos");
        }
    }
}
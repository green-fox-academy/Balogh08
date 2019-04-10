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
        private readonly ApplicationContext app;

        public TodoController(ApplicationContext ApplicationContext)
        {
            this.app = ApplicationContext;
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
                var todos = app.Todos
                .Where(x => x.IsDone == false)
                .ToList();
                return View(todos);
            }
            else if(IsActive.Equals("false", StringComparison.InvariantCultureIgnoreCase))
            {
                var todos = app.Todos
                .Where(x => x.IsDone == true)
                .ToList();
                return View(todos);
            }
            else
            {
                var todos = app.Todos.ToList();
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
            app.Todos.Add(new Todo(title));
            app.SaveChanges();

            //return RedirectToAction("Index");
            return Redirect("mytodos");
        }

        [HttpGet("{id}/edit")]
        public IActionResult Update([FromRoute]long id)
        {
            return View("update", app.Todos.Find(id));
        }
       
        [HttpPost("{id}/edit")]
        public IActionResult UpdateTodo(long id, string title, bool isUrgent, bool isDone)
        {
            Todo updatedTodo = app.Todos.FirstOrDefault(todo => todo.Id == id);
            updatedTodo.Title = title;
            updatedTodo.IsUrgent = isUrgent;
            updatedTodo.IsDone = isDone;
            app.Todos.Update(updatedTodo);
            app.SaveChanges();

            return RedirectToAction("Index");
        }

        [HttpGet("delete")]
        public IActionResult DeleteTodo(int id)
        {
            Todo deletedCustomer = app.Todos.FirstOrDefault(todo => todo.Id == id);
            app.Todos.Remove(deletedCustomer);
            app.SaveChanges();

            return Redirect("mytodos");
        }

        [HttpGet("{id}/delete")]
        public IActionResult DeleteTodoByRoute([FromRoute]long id)
        {
            //Todo deletedCustomer = app.Todos.FirstOrDefault(todo => todo.Id == id);
            //app.Todos.Remove(deletedCustomer);
            app.Todos.Remove(app.Todos.Find(id));
            app.SaveChanges();

            //mivel az Id bent maradna a routbe ezért redirect to action method kell
            return RedirectToAction("Index");
        }
    }
}
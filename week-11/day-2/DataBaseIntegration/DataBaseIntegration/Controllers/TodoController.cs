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
                //return Accepted(todos);
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
            Todo updatedTodo = app.Todos.FirstOrDefault(todo => todo.Id == id);
            //return View("update", app.Todos.Find(id));
            //return Accepted(app.Todos.Find(id));
            return View(updatedTodo);
        }
       
        [HttpPut("{id}/edit")]
        public IActionResult UpdateTodo(Todo todo)
        {
            //Todo updatedTodo = app.Todos.FirstOrDefault(todo => todo.Id == id);
            //updatedTodo.Title = title;
            //updatedTodo.IsUrgent = isUrgent;
            //updatedTodo.IsDone = isDone;
            //app.Todos.Update(updatedTodo);

            //long id, string title, bool isUrgent, bool isDone

            app.Todos.Attach(app.Todos.Find(todo.Id));
            if(app.Todos.Find(todo.Id).Title != todo.Title)
            {
            app.Todos.Find(todo.Id).Title = todo.Title;
            }

            if(app.Todos.Find(todo.Id).IsUrgent != todo.IsUrgent)
            {
            app.Todos.Find(todo.Id).IsUrgent = todo.IsUrgent;
            }

            if(app.Todos.Find(todo.Id).IsDone != todo.IsDone)
            {
            app.Todos.Find(todo.Id).IsDone = todo.IsDone;
            }

            app.SaveChanges();

            return RedirectToAction("Index");
            //return Accepted("Entyt has been modyfied", todo); //postmanben headersnél kiírja, hogy Location →Entyt has been modyfied, bodyban pedig az objectet
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
        public IActionResult DeleteTodoByRoute([FromRoute]Todo todo)
        {
            //Todo deletedCustomer = app.Todos.FirstOrDefault(todo => todo.Id == id);
            //app.Todos.Remove(deletedCustomer);
            app.Todos.Remove(app.Todos.Find(todo.Id));
            app.SaveChanges();

            //mivel az Id bent maradna a routbe ezért redirect to action method kell
            //return RedirectToAction("Index");
            return Accepted("Entity has been deleted", todo);
        }
    }
}
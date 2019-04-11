using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace DataBaseIntegration.Models
{
    public class Assignee
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public string Email { get; set; }
        public IList<Todo> Todos { get; set; }

    public Assignee(string name, string email)
    {
        this.Name = name;
        this.Email = email;
    }

    }
}

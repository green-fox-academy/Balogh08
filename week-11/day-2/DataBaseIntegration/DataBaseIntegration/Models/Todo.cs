using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace DataBaseIntegration.Models
{
    public class Todo
    {
        public long Id { set; get; }
        public static long IdGenerator { get; private set; }

        [Required]
        public string Title { set; get; }
        public bool IsUrgent{ set; get; }
        public bool IsDone{ set; get; }

        public Todo()
        {
            IdGenerator++;
            Id = IdGenerator;
            IsUrgent = false;
            IsDone = false;
        }

        public Todo(string Title)
        {
            IdGenerator++;
            Id = IdGenerator;
            this.Title = Title;
            IsUrgent = false;
            IsDone = false;
        }
    }
}

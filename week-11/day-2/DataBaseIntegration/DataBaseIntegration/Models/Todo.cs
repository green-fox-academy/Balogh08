using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace DataBaseIntegration.Models
{
    public class Todo
    {
        public long Id { get; set; }
        public static long IdGenerator { get; private set; }

        [Required]
        public string Title { get; set; }
        public string Descriptopn { get; set; }
        public bool IsUrgent { get; set; }
        public bool IsDone { get; set; }

        public int? AssigneeId { get; set; } //Foreign Key and int? is for c# to have null value
        [JsonIgnore]
        public Assignee Assignee { get; set; } //Navigation Property

        public Todo()
        {
            //Id must be commented as explicit ID generation is not allowed in the DataBase
            //IdGenerator++;
            //Id = IdGenerator;
            IsUrgent = false;
            IsDone = false;
        }

        public Todo(string Title)
        {
            //IdGenerator++;
            //Id = IdGenerator;
            this.Title = Title;
            IsUrgent = false;
            IsDone = false;
        }
    }
}

using DependencyInjection.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace DependencyInjection.ViewModel
{
    public class PrinterIndexViewModel
    {
        public Printer Printer;

        public PrinterIndexViewModel(Printer Printer)
        {
            this.Printer = Printer;
        }
    }
}

using DependencyInjection.ViewModel;
using Microsoft.AspNetCore.Http;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace DependencyInjection.Models
{
    public class ConsoleLoggerMiddleware : IMiddleware
    {
        PrinterIndexViewModel PrinterIndexViewModel;

        public ConsoleLoggerMiddleware(PrinterIndexViewModel PrinterIndexViewModel)
        {
            this.PrinterIndexViewModel = PrinterIndexViewModel;
        }

        public Task InvokeAsync(HttpContext context, RequestDelegate next)
        {
            Console.WriteLine("Hi from the middleware");

            return next(context);
        }
    }
}

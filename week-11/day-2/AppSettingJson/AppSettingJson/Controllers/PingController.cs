using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using AppSettingJson.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Options;

namespace AppSettingJson.Controllers
{
    public class PingController : Controller
    {
        private readonly AppSettings _appSettings;

        public PingController(IOptions<AppSettings> appsettings)
        {
            _appSettings = appsettings.Value;
        }
        [HttpGet]
        [Route("ping")]
        public IActionResult Index()
        {
            var env = _appSettings.Environment;

            return Ok();
        }
    }
}
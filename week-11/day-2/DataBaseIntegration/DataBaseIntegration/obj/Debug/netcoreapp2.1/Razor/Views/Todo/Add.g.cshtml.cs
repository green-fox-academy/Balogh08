#pragma checksum "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\Add.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "d6af5d6eec4b17e87012c05e845776e89c4f13dc"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(AspNetCore.Views_Todo_Add), @"mvc.1.0.view", @"/Views/Todo/Add.cshtml")]
[assembly:global::Microsoft.AspNetCore.Mvc.Razor.Compilation.RazorViewAttribute(@"/Views/Todo/Add.cshtml", typeof(AspNetCore.Views_Todo_Add))]
namespace AspNetCore
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Mvc;
    using Microsoft.AspNetCore.Mvc.Rendering;
    using Microsoft.AspNetCore.Mvc.ViewFeatures;
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"d6af5d6eec4b17e87012c05e845776e89c4f13dc", @"/Views/Todo/Add.cshtml")]
    public class Views_Todo_Add : global::Microsoft.AspNetCore.Mvc.Razor.RazorPage<dynamic>
    {
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
            BeginContext(0, 2, true);
            WriteLiteral("\r\n");
            EndContext();
#line 2 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\Add.cshtml"
  
    ViewData["Title"] = "Add";

#line default
#line hidden
            BeginContext(41, 202, true);
            WriteLiteral("\r\n<h2>Add</h2>\r\n\r\n<form action=\"add\" method=\"post\">\r\n    <label>\r\n        Title\r\n        <input type=\"text\" name=\"title\" required />\r\n    </label>\r\n    <button type=\"submit\">Add Todo</button>\r\n</form>\r\n");
            EndContext();
        }
        #pragma warning restore 1998
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.ViewFeatures.IModelExpressionProvider ModelExpressionProvider { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IUrlHelper Url { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IViewComponentHelper Component { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IJsonHelper Json { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IHtmlHelper<dynamic> Html { get; private set; }
    }
}
#pragma warning restore 1591
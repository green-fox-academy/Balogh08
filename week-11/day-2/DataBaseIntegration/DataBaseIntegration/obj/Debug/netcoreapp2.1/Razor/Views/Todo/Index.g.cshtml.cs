#pragma checksum "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\Index.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "c7ecaede725c8aed027fcccc9fcf56d47b7b64fa"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(AspNetCore.Views_Todo_Index), @"mvc.1.0.view", @"/Views/Todo/Index.cshtml")]
[assembly:global::Microsoft.AspNetCore.Mvc.Razor.Compilation.RazorViewAttribute(@"/Views/Todo/Index.cshtml", typeof(AspNetCore.Views_Todo_Index))]
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
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"c7ecaede725c8aed027fcccc9fcf56d47b7b64fa", @"/Views/Todo/Index.cshtml")]
    public class Views_Todo_Index : global::Microsoft.AspNetCore.Mvc.Razor.RazorPage<dynamic>
    {
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
            BeginContext(0, 2, true);
            WriteLiteral("\r\n");
            EndContext();
#line 2 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\Index.cshtml"
  
    ViewData["Title"] = "Index";

#line default
#line hidden
            BeginContext(43, 205, true);
            WriteLiteral("\r\n<h2>Index</h2>\r\n<table>\r\n    <thead>\r\n        <tr>\r\n            <th>Id</th>\r\n            <th>Title</th>\r\n            <th>Urgent</th>\r\n            <th>Done</th>\r\n        </tr>\r\n    </thead>\r\n    <tbody>\r\n");
            EndContext();
#line 17 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\Index.cshtml"
         foreach(var todo in Model)
        { 

#line default
#line hidden
            BeginContext(297, 30, true);
            WriteLiteral("        <tr>\r\n            <td>");
            EndContext();
            BeginContext(328, 7, false);
#line 20 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\Index.cshtml"
           Write(todo.Id);

#line default
#line hidden
            EndContext();
            BeginContext(335, 23, true);
            WriteLiteral("</td>\r\n            <td>");
            EndContext();
            BeginContext(359, 10, false);
#line 21 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\Index.cshtml"
           Write(todo.Title);

#line default
#line hidden
            EndContext();
            BeginContext(369, 23, true);
            WriteLiteral("</td>\r\n            <td>");
            EndContext();
            BeginContext(393, 13, false);
#line 22 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\Index.cshtml"
           Write(todo.IsUrgent);

#line default
#line hidden
            EndContext();
            BeginContext(406, 23, true);
            WriteLiteral("</td>\r\n            <td>");
            EndContext();
            BeginContext(430, 11, false);
#line 23 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\Index.cshtml"
           Write(todo.IsDone);

#line default
#line hidden
            EndContext();
            BeginContext(441, 22, true);
            WriteLiteral("</td>\r\n        </tr>\r\n");
            EndContext();
#line 25 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\Index.cshtml"
        }

#line default
#line hidden
            BeginContext(474, 26, true);
            WriteLiteral("    </tbody>\r\n</table>\r\n\r\n");
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
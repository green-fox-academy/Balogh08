#pragma checksum "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\Index2.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "efee37ade2bcb8fe83f1b7815979d73633ac9c4b"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(AspNetCore.Views_Todo_Index2), @"mvc.1.0.view", @"/Views/Todo/Index2.cshtml")]
[assembly:global::Microsoft.AspNetCore.Mvc.Razor.Compilation.RazorViewAttribute(@"/Views/Todo/Index2.cshtml", typeof(AspNetCore.Views_Todo_Index2))]
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
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"efee37ade2bcb8fe83f1b7815979d73633ac9c4b", @"/Views/Todo/Index2.cshtml")]
    public class Views_Todo_Index2 : global::Microsoft.AspNetCore.Mvc.Razor.RazorPage<dynamic>
    {
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
#line 2 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\Index2.cshtml"
  
    ViewData["Title"] = "Index2";

#line default
#line hidden
            BeginContext(96, 171, true);
            WriteLiteral("\r\n\r\n<table>\r\n    <thead>\r\n        <tr>\r\n            <th>Id</th>\r\n            <th>Assignee Name</th>\r\n            <th>Title</th>\r\n        </tr>\r\n    </thead>\r\n    <tbody>\r\n");
            EndContext();
#line 16 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\Index2.cshtml"
         foreach (var assignee in Model)
        {

#line default
#line hidden
            BeginContext(320, 38, true);
            WriteLiteral("            <tr>\r\n                <td>");
            EndContext();
            BeginContext(359, 11, false);
#line 19 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\Index2.cshtml"
               Write(assignee.Id);

#line default
#line hidden
            EndContext();
            BeginContext(370, 27, true);
            WriteLiteral("</td>\r\n                <td>");
            EndContext();
            BeginContext(398, 13, false);
#line 20 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\Index2.cshtml"
               Write(assignee.Name);

#line default
#line hidden
            EndContext();
            BeginContext(411, 12, true);
            WriteLiteral("</td>     \r\n");
            EndContext();
#line 21 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\Index2.cshtml"
                 foreach (var todo in assignee.Todos)
                {

#line default
#line hidden
            BeginContext(497, 24, true);
            WriteLiteral("                    <td>");
            EndContext();
            BeginContext(522, 10, false);
#line 23 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\Index2.cshtml"
                   Write(todo.Title);

#line default
#line hidden
            EndContext();
            BeginContext(532, 10, true);
            WriteLiteral(" ||</td>\r\n");
            EndContext();
#line 24 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\Index2.cshtml"
                }

#line default
#line hidden
            BeginContext(561, 19, true);
            WriteLiteral("            </tr>\r\n");
            EndContext();
#line 26 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\Index2.cshtml"
        }

#line default
#line hidden
            BeginContext(591, 22, true);
            WriteLiteral("    </tbody>\r\n</table>");
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
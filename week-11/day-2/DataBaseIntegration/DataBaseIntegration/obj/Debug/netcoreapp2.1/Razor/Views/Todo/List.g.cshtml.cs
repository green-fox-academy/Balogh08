#pragma checksum "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\List.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "f10266ae900818508c07e53baf3944b93a34a1ac"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(AspNetCore.Views_Todo_List), @"mvc.1.0.view", @"/Views/Todo/List.cshtml")]
[assembly:global::Microsoft.AspNetCore.Mvc.Razor.Compilation.RazorViewAttribute(@"/Views/Todo/List.cshtml", typeof(AspNetCore.Views_Todo_List))]
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
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"f10266ae900818508c07e53baf3944b93a34a1ac", @"/Views/Todo/List.cshtml")]
    public class Views_Todo_List : global::Microsoft.AspNetCore.Mvc.Razor.RazorPage<dynamic>
    {
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
            BeginContext(0, 2, true);
            WriteLiteral("\r\n");
            EndContext();
#line 2 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\List.cshtml"
  
    ViewData["Title"] = "List";

#line default
#line hidden
            BeginContext(42, 37, true);
            WriteLiteral("\r\n<h2>Todos for today:</h2>\r\n\r\n<ul>\r\n");
            EndContext();
#line 9 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\List.cshtml"
     foreach(var todo in Model)
    {

#line default
#line hidden
            BeginContext(119, 8, true);
            WriteLiteral("    <li>");
            EndContext();
            BeginContext(128, 10, false);
#line 11 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\List.cshtml"
   Write(todo.Title);

#line default
#line hidden
            EndContext();
            BeginContext(138, 7, true);
            WriteLiteral("</li>\r\n");
            EndContext();
#line 12 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-2\DataBaseIntegration\DataBaseIntegration\Views\Todo\List.cshtml"
    }

#line default
#line hidden
            BeginContext(152, 37, true);
            WriteLiteral("</ul>\r\n\r\n<a href=\"#\">Add Todo</a>\r\n\r\n");
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

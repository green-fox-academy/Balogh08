#pragma checksum "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-1\Simba\Simba\Views\Account\singleAccount.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "67c5d3a13b466c62aed1834d205f836c2a0c1cc6"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(AspNetCore.Views_Account_singleAccount), @"mvc.1.0.view", @"/Views/Account/singleAccount.cshtml")]
[assembly:global::Microsoft.AspNetCore.Mvc.Razor.Compilation.RazorViewAttribute(@"/Views/Account/singleAccount.cshtml", typeof(AspNetCore.Views_Account_singleAccount))]
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
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"67c5d3a13b466c62aed1834d205f836c2a0c1cc6", @"/Views/Account/singleAccount.cshtml")]
    public class Views_Account_singleAccount : global::Microsoft.AspNetCore.Mvc.Razor.RazorPage<Simba.Models.BankAccount>
    {
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
#line 2 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-1\Simba\Simba\Views\Account\singleAccount.cshtml"
  
    ViewData["Title"] = "singleAccount";

#line default
#line hidden
            BeginContext(82, 28, true);
            WriteLiteral("\r\n<h2>singleAccount</h2>\r\n\r\n");
            EndContext();
            BeginContext(111, 10, false);
#line 8 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-1\Simba\Simba\Views\Account\singleAccount.cshtml"
Write(Model.Name);

#line default
#line hidden
            EndContext();
            BeginContext(121, 2, true);
            WriteLiteral("\r\n");
            EndContext();
            BeginContext(124, 8, false);
#line 9 "C:\Users\Balogh Botond\Desktop\GreenFox\Balogh08\week-11\day-1\Simba\Simba\Views\Account\singleAccount.cshtml"
Write(Model.Id);

#line default
#line hidden
            EndContext();
            BeginContext(132, 2, true);
            WriteLiteral("\r\n");
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
        public global::Microsoft.AspNetCore.Mvc.Rendering.IHtmlHelper<Simba.Models.BankAccount> Html { get; private set; }
    }
}
#pragma warning restore 1591

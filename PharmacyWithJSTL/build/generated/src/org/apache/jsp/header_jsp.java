package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.store.common.beans.AdminBean;
import java.util.HashSet;
import com.store.presn.constansApp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.Constants.TITLE_ATTRIBUTE}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                margin: 0px;\n");
      out.write("                padding: 0px;\n");
      out.write("            }\n");
      out.write("            .head{ \n");
      out.write("                background-color: #69f4f2;\n");
      out.write("                margin: 0px;\n");
      out.write("                height: 70px;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .head-1{\n");
      out.write("                display: inline;\n");
      out.write("                color: blue;\n");
      out.write("                float: left;\n");
      out.write("                padding-left: 40px;\n");
      out.write("                padding-top: 20px;\n");
      out.write("                font-size: 30px;\n");
      out.write("            }\n");
      out.write("            .admin{\n");
      out.write("                float: right;\n");
      out.write("                padding-right: 50px;\n");
      out.write("                padding-top: 20px;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            a{\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            ul {\n");
      out.write("                list-style-type: none;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color: white;\n");
      out.write("                padding-left: 110px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li {\n");
      out.write("                float: left;\n");
      out.write("                width: 10%;\n");
      out.write("                background-color: green;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li a {\n");
      out.write("                display: block;\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Change the link color to #111 (black) on hover */\n");
      out.write("            li a:hover {\n");
      out.write("                background-color: #111;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"head\">\n");
      out.write("            <div class=\"head-1\">\n");
      out.write("\n");
      out.write("                <a href=\"MenuController?page=home\">PHARMACARE</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"admin\">\n");
      out.write("    <!--            <a href=\"MenuController?page=home\" class=\"js-logo-clone\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${log.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </a>-->\n");
      out.write("                <a href=\"MenuController?page=home\" class=\"js-logo-clone\"> aliali</a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div >\n");
      out.write("            <nav >\n");
      out.write("                <ul >\n");
      out.write("                    <li  ><a href=\"MenuController?page=home\">Home</a></li>\n");
      out.write("                    <!--#############################################################################-->\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"#\" >Sales</a>\n");
      out.write("                        <ul  >\n");
      out.write("                            <li><a  href=\"MenuController?page=newsales\">   New Sales      </a>   </li>\n");
      out.write("                            <li><a  href=\"MenuController?page=deliverylist\">  Delivery List </a>  </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!--#########################################################################3-->\n");
      out.write("\n");
      out.write("                    <li  >\n");
      out.write("                        <a href=\"#\">Purchases</a>\n");
      out.write("                        <ul >\n");
      out.write("                            <li  ><a href=\"MenuController?page=newpurchase\">New Bill</a></li>\n");
      out.write("                            <li   >\n");
      out.write("\n");
      out.write("                                <a href=\"#\">Founded</a>\n");
      out.write("                                <ul >\n");
      out.write("                                    <li ><a href=\"MenuController?page=foundedall\">ALL</a></li>\n");
      out.write("                                    <li  ><a href=\"MenuController?page=foundedname\">NAME</a></li>\n");
      out.write("                                    <li><a href=\"MenuController?page=foundedtype\">TYPE</a></li>\n");
      out.write("                                    <li><a href=\"MenuController?page=foundedquantity\">QUANTITY</a></li>\n");
      out.write("                                    <li><a href=\"MenuController?page=foundedexpiry\">EXPIRY</a></li>\n");
      out.write("                                    <li><a href=\"MenuController?page=foundedprice\">PRICE</a></li>\n");
      out.write("                                    <li><a href=\"MenuController?page=foundedcompany\">COMPANY</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li >\n");
      out.write("                            <li >\n");
      out.write("                                <a href=\"#\">Requested</a>\n");
      out.write("                                <ul >\n");
      out.write("                                    <li   >\n");
      out.write("                                        <a href=\"#\">SEARCH</a>\n");
      out.write("                                        <ul >\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"MenuController?page=requestall\">ALL</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"MenuController?page=requestname\">NAME</a>\n");
      out.write("                                            </li >\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>             \n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"MenuController?page=requestadd\">ADD</a>\n");
      out.write("                                    </li> \n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                        </ul>                                                  \n");
      out.write("                    </li>\n");
      out.write("                    <!--################################################################-->\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Customer</a>\n");
      out.write("                        <ul >\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <li >\n");
      out.write("                                <a href=\"#\">SEARCH</a>\n");
      out.write("                                <ul >\n");
      out.write("                                    <li >\n");
      out.write("                                        <a href=\"MenuController?page=customerall\">ALL</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"MenuController?page=customername\">NAME</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>   \n");
      out.write("\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"MenuController?page=customeradd\">ADD</a>\n");
      out.write("                            </li> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>   \n");
      out.write("                    <!--            ##############################-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li  >\n");
      out.write("                        <a href=\"#\">Search</a>\n");
      out.write("                        <ul >\n");
      out.write("                            <li  ><a href=\"MenuController?page=searchall\">ALL</a></li>\n");
      out.write("                            <li ><a href=\"MenuController?page=searchname\">NAME</a></li>\n");
      out.write("                            <li ><a href=\"MenuController?page=searchtype\">TYPE</a></li>\n");
      out.write("                            <li ><a href=\"MenuController?page=searchprice\">PRICE</a></li>\n");
      out.write("                            <li ><a href=\"MenuController?page=searchexpiry\">EXPIRY</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <!--####################################################-->\n");
      out.write("\n");
      out.write("                    <li  >\n");
      out.write("                        <a href=\"#\">Discount</a>\n");
      out.write("                        <ul >\n");
      out.write("                            <li  ><a href=\"MenuController?page=discountall\">ALL</a></li>\n");
      out.write("                            <li ><a href=\"MenuController?page=discountname\">NAME</a></li>\n");
      out.write("                            <li ><a href=\"MenuController?page=discounttype\">TYPE</a></li>\n");
      out.write("                            <li ><a href=\"MenuController?page=discountprice\">PRICE</a></li>\n");
      out.write("                            <li  ><a href=\"MenuController?page=discountdiscount\">DISCOUNT</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li >\n");
      out.write("\n");
      out.write("                    <!--################################################-->\n");
      out.write("\n");
      out.write("                    <li >\n");
      out.write("                        <a href=\"#\">Reports</a>\n");
      out.write("                        <ul >\n");
      out.write("                            <li >\n");
      out.write("                                <a href=\"#\" >Sale Bills By</a>\n");
      out.write("                                <ul >\n");
      out.write("                                    <li><a href=\"MenuController?page=salebillreportsall\" >All</a></li>\n");
      out.write("                                    <li><a href=\"MenuController?page=salebillreportsbillcode\">Bill Code</a></li>\n");
      out.write("                                    <li><a href=\"MenuController?page=salebillreportsdate\">Date</a></li> \n");
      out.write("                                    <li><a href=\"MenuController?page=salebillreportstotal\" >Total</a></li> \n");
      out.write("                                    <li><a href=\"MenuController?page=salebillreportsprofit\" >Profit</a></li>         \n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                            <li >\n");
      out.write("                                <a href=\"#\" >Purchase Bills By</a>\n");
      out.write("                                <ul >\n");
      out.write("\n");
      out.write("                                    <li ><a href=\"MenuController?page=purchasebillreportsall\">All</a></li>\n");
      out.write("                                    <li  ><a href=\"MenuController?page=purchasebillreportsbillcode\">Bill Code</a></li>\n");
      out.write("                                    <li  ><a href=\"MenuController?page=purchasebillreportsdate\">Date</a></li> \n");
      out.write("                                    <li ><a href=\"MenuController?page=purchasebillreportstotal\">Total</a></li> \n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"MenuController?page=analysisbillreports\">Analysis</a></li>                                                \n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <!--###################################################33-->\n");
      out.write("                    <li   >\n");
      out.write("                        <a href=\"#\">Setting</a>\n");
      out.write("                        <ul >\n");
      out.write("                            <li ><a href=\"MenuController?page=addaccount\">Add Account</a></li>\n");
      out.write("                            <li ><a href=\"MenuController?page=deleteaccount\">Delete Account</a></li>\n");
      out.write("                            <li><a href=\"MenuController?page=editaccount\">Change Password</a></li>\n");
      out.write("                            <li><a href=\"MenuController?page=viewaccounts\">View Accounts</a></li>\n");
      out.write("                            <li><a href=\"MenuController?page=priviliges\"> Priviliges </a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <!--#####################################################-->\n");
      out.write("                    <li><a href=\"MenuController?page=logout\">Log Out</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

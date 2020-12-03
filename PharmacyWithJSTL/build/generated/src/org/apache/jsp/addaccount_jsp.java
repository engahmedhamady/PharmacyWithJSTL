package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.store.common.beans.AdminBean;
import java.util.HashSet;
import com.store.presn.constansApp.*;

public final class addaccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_remove_var_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_remove_var_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_remove_var_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
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
      out.print(   request.getAttribute(Constants.TITLE_ATTRIBUTE)  );
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
      out.write("\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar {\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color: #333;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar a {\n");
      out.write("                float: left;\n");
      out.write("                font-size: 16px;\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown {\n");
      out.write("                float: left;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown .dropbtn {\n");
      out.write("                font-size: 16px;  \n");
      out.write("                border: none;\n");
      out.write("                outline: none;\n");
      out.write("                color: white;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                background-color: inherit;\n");
      out.write("                font-family: inherit;\n");
      out.write("                margin: 0;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar a:hover,  .dropbtn:hover  {\n");
      out.write("                background-color: red;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content {\n");
      out.write("                display: none;\n");
      out.write("                position: absolute;\n");
      out.write("                background-color: #f9f9f9;\n");
      out.write("                min-width: 160px;\n");
      out.write("                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("                z-index: 1;\n");
      out.write("            }\n");
      out.write("            .dropdown-content1 {\n");
      out.write("                display: none;\n");
      out.write("                position:absolute;\n");
      out.write("                background-color: #f9f9f9;\n");
      out.write("                min-width: 100px;\n");
      out.write("                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("                z-index: 1;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content a {\n");
      out.write("                float: none;\n");
      out.write("                color: black;\n");
      out.write("                padding: 12px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: block;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("            .dropdown-content1 a {\n");
      out.write("                float: none;\n");
      out.write("                color: black;\n");
      out.write("                padding: 12px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: block;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("            .dropdown-content a:hover {\n");
      out.write("                background-color: #ddd;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown:hover .dropdown-content{\n");
      out.write("                display:block;\n");
      out.write("            }\n");
      out.write("            .link:hover .dropdown-content1{\n");
      out.write("                display:inline;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"head\">\n");
      out.write("            <div class=\"head-1\">\n");
      out.write("                <a href=\"MenuController?page=home\">PHARMACARE</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"admin\">\n");
      out.write("                  <a href=\"MenuController?page=home\" class=\"js-logo-clone\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${log.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div  class=\"navbar\" >\n");
      out.write("            <a href=\"MenuController?page=home\">Home</a>\n");
      out.write("            <!--#############################################################################-->\n");
      out.write("            <div  class=\"dropdown\">\n");
      out.write("                <button class=\"dropbtn\" >Sales</button>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a  href=\"MenuController?page=newsales\">   New Sales      </a>   \n");
      out.write("                    <a  href=\"MenuController?page=deliverylist\">  Delivery List </a>  \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--#########################################################################3-->\n");
      out.write("\n");
      out.write("            <div  class=\"dropdown\">\n");
      out.write("\n");
      out.write("                <button class=\"dropbtn\" >Purchases</button>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a href=\"MenuController?page=newpurchase\">New Bill</a>\n");
      out.write("                    <div class=\"link\">\n");
      out.write("                        <a href=\"#\" class=\"droplink\">Founded</a> \n");
      out.write("                        <div class=\"dropdown-content1\" >\n");
      out.write("                            <a href=\"MenuController?page=foundedall\">ALL</a>\n");
      out.write("                            <a href=\"MenuController?page=foundedname\">NAME</a>\n");
      out.write("                            <a href=\"MenuController?page=foundedtype\">TYPE</a>\n");
      out.write("                            <a href=\"MenuController?page=foundedquantity\">QUANTITY</a>\n");
      out.write("                            <a href=\"MenuController?page=foundedexpiry\">EXPIRY</a>\n");
      out.write("                            <a href=\"MenuController?page=foundedprice\">PRICE</a>\n");
      out.write("                            <a href=\"MenuController?page=foundedcompany\">COMPANY</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"link\">\n");
      out.write("\n");
      out.write("                        <a href=\"#\" class=\"droplink\">Requested</a> \n");
      out.write("                        <div class=\"dropdown-content1\">\n");
      out.write("                            <a href=\"MenuController?page=requestadd\" >ADD</a>\n");
      out.write("                            <div class=\"link\">\n");
      out.write("                                <a href=\"#\" class=\"droplink\">SEARCH</a>  \n");
      out.write("                                <div class=\"dropdown-content1\">\n");
      out.write("                                    <a href=\"MenuController?page=requestall\">ALL</a>\n");
      out.write("                                    <a href=\"MenuController?page=requestname\">NAME</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>    \n");
      out.write("            </div>\n");
      out.write("            <!--################################################################-->\n");
      out.write("            <div  class=\"dropdown\">\n");
      out.write("                <button class=\"dropbtn\">Customer</button>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a href=\"MenuController?page=customeradd\">ADD</a>\n");
      out.write("                    <div class=\"link\">\n");
      out.write("                        <a href=\"#\" class=\"droplink\">SEARCH</a>\n");
      out.write("                        <div class=\"dropdown-content1\"> \n");
      out.write("                            <a href=\"MenuController?page=customerall\">ALL</a>\n");
      out.write("                            <a href=\"MenuController?page=customername\">NAME</a>\n");
      out.write("                        </div>                \n");
      out.write("                    </div>\n");
      out.write("                </div>     \n");
      out.write("            </div>     \n");
      out.write("            <!--            ##############################-->\n");
      out.write("            <div  class=\"dropdown\">\n");
      out.write("                <button class=\"dropbtn\">Search</button>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a href=\"MenuController?page=searchall\">ALL</a>\n");
      out.write("                    <a href=\"MenuController?page=searchname\">NAME</a>\n");
      out.write("                    <a href=\"MenuController?page=searchtype\">TYPE</a>\n");
      out.write("                    <a href=\"MenuController?page=searchprice\">PRICE</a>\n");
      out.write("                    <a href=\"MenuController?page=searchexpiry\">EXPIRY</a>\n");
      out.write("                </div>     \n");
      out.write("            </div>\n");
      out.write("            <!--####################################################-->\n");
      out.write("            <div  class=\"dropdown\">\n");
      out.write("                <button class=\"dropbtn\">Discount</button>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a href=\"MenuController?page=discountall\">ALL</a>\n");
      out.write("                    <a href=\"MenuController?page=discountname\">NAME</a>\n");
      out.write("                    <a href=\"MenuController?page=discounttype\">TYPE</a>\n");
      out.write("                    <a href=\"MenuController?page=discountprice\">PRICE</a>\n");
      out.write("                    <a href=\"MenuController?page=discountdiscount\">DISCOUNT</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--################################################-->\n");
      out.write("            <div  class=\"dropdown\">\n");
      out.write("                <button class=\"dropbtn\">Reports</button>                \n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a href=\"MenuController?page=analysisbillreports\">Analysis</a> \n");
      out.write("                    <div class=\"link\" >\n");
      out.write("                        <a href=\"#\" class=\"droplink\">Sale Bills By</a>\n");
      out.write("                        <div class=\"dropdown-content1\">                                                \n");
      out.write("                            <a href=\"MenuController?page=salebillreportsall\" >All</a>\n");
      out.write("                            <a href=\"MenuController?page=salebillreportsbillcode\">Bill Code</a>\n");
      out.write("                            <a href=\"MenuController?page=salebillreportsdate\">Date</a>\n");
      out.write("                            <a href=\"MenuController?page=salebillreportstotal\" >Total</a>\n");
      out.write("                            <a href=\"MenuController?page=salebillreportsprofit\" >Profit</a>                      \n");
      out.write("                        </div>                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"link\" >\n");
      out.write("                        <a href=\"#\" class=\"droplink\">Purchase Bills By</a>\n");
      out.write("                        <div class=\"dropdown-content1\">                           \n");
      out.write("                            <a href=\"MenuController?page=purchasebillreportsall\">All</a>\n");
      out.write("                            <a href=\"MenuController?page=purchasebillreportsbillcode\">Bill Code</a>\n");
      out.write("                            <a href=\"MenuController?page=purchasebillreportsdate\">Date</a>\n");
      out.write("                            <a href=\"MenuController?page=purchasebillreportstotal\">Total</a>\n");
      out.write("                        </div>                        \n");
      out.write("                    </div>                                                             \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--###################################################33-->\n");
      out.write("            <div  class=\"dropdown\">\n");
      out.write("                <button class=\"dropbtn\">Setting</button>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a href=\"MenuController?page=addaccount\">Add Account</a>\n");
      out.write("                    <a href=\"MenuController?page=deleteaccount\">Delete Account</a>\n");
      out.write("                    <a href=\"MenuController?page=editaccount\">Change Password</a>\n");
      out.write("                    <a href=\"MenuController?page=viewaccounts\">View Accounts</a>\n");
      out.write("                    <a href=\"MenuController?page=priviliges\"> Priviliges </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--#####################################################-->\n");
      out.write("            <a href=\"MenuController?page=logout\">Log Out</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"display: inline; background-color:darkseagreen; padding:0px;\">\n");
      out.write("   \n");
      out.write("<div class=\"site-block-cover-content text-center\" \n");
      out.write("     style=\"   background-color:darkseagreen; padding:100px; \">\n");
      out.write("    <form action=\"SettingOperationsController?page=addaccount&operation=addaccount\" method=\"POST\">\n");
      out.write("        <table border=\"0\" width=\"40%\" cellspacing=\"5 \" >\n");
      out.write("\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td> user name </td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\" value=\"\"  /> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>password</td>\n");
      out.write("                    <td> <input type=\"password\" name=\"password\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td colspan=\"2\"  align=\" center\"> <input type=\"submit\" value=\"Add\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("      ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("     <div style=\"width: 20%;background-color: black; height: 100%;\">\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty founded}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_choose_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_remove_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("    \n");
        out.write("            ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${founded == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write("\n");
        out.write("                <h1>   ");
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("  </h1>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${'sorry this username not invalid try with another name'}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${founded == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write("\n");
        out.write("                <h1>   ");
        if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("  </h1>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${'username is created'}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_remove_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_remove_0 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _jspx_tagPool_c_remove_var_nobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    _jspx_th_c_remove_0.setPageContext(_jspx_page_context);
    _jspx_th_c_remove_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_remove_0.setVar("founded");
    int _jspx_eval_c_remove_0 = _jspx_th_c_remove_0.doStartTag();
    if (_jspx_th_c_remove_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_remove_var_nobody.reuse(_jspx_th_c_remove_0);
      return true;
    }
    _jspx_tagPool_c_remove_var_nobody.reuse(_jspx_th_c_remove_0);
    return false;
  }
}

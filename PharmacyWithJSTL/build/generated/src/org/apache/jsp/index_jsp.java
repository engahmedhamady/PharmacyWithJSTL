package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.store.presn.constansApp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       \n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("         ");
  request.setAttribute(Constants.TITLE_ATTRIBUTE, "login page");
      out.write("\n");
      out.write("        <title>");
      out.print(   request.getAttribute(Constants.TITLE_ATTRIBUTE)  );
      out.write("</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Rubik:400,700|Crimson+Text:400,400i\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/icomoon/style.css\">\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"site-navbar py-2\">\n");
      out.write("\n");
      out.write("            <div class=\"search-wrap\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <a href=\"#\" class=\"search-close js-search-close\"><span class=\"icon-close2\"></span></a>\n");
      out.write("                    <form action=\"#\" method=\"post\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Search keyword and hit enter...\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"container\" >\n");
      out.write("                <div class=\"d-flex align-items-center justify-content-between\">\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                        <div class=\"site-logo\">\n");
      out.write("                            <a href=\"index.jsp\" class=\"js-logo-clone\">Pharma</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("   \n");
      out.write("    <div class=\"site-blocks-cover\" style=\"background-image: url('images/hero_1.jpg');\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-7 mx-auto order-lg-2 align-self-center\">\n");
      out.write("            <div class=\"site-block-cover-content text-center\">\n");
      out.write("               <form action=\"OperationsController?page=home&operation=login\" method=\"POST\">\n");
      out.write("            <table border=\"0\" width=\"40%\" cellspacing=\"5 \" >\n");
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> user name </td>\n");
      out.write("                        <td><input type=\"text\" name=\"name\" value=\"\"  /> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>password</td>\n");
      out.write("                        <td> <input type=\"password\" name=\"password\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td colspan=\"2\"  align=\" center\"> <input type=\"submit\" value=\"login\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("Constants.TITLE_ATTRIBUTE");
    _jspx_th_c_set_0.setScope("session");
    _jspx_th_c_set_0.setValue(new String("login page"));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}

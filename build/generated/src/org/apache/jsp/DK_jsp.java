package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DK_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>BookStore</title>\n");
      out.write("\n");
      out.write("        <link href=\"css/tooplate_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nivo-slider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("    </head>\n");
      out.write("    <div id=\"tooplate_body_wrapper\">\n");
      out.write("        <div id=\"tooplate_wrapper\">\n");
      out.write("            <div id=\"tooplate_top_bar\">\n");
      out.write("            </div>  \n");
      out.write("            <div id=\"tooplate_header\">\n");
      out.write("                <div id=\"site_title\"><h1><a href=\"\">Library</a></h1></div>\n");
      out.write("                <div id=\"tooplate_menu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"index.html\" class=\"current\">Trang chủ</a></li>\n");
      out.write("                        <li><a href=\"\">Danh mục</a></li>\n");
      out.write("                        <li><a href=\"\">Giỏ sách</a></li>\n");
      out.write("                        <li><a href=\"\">Liên hệ</a></li>\n");
      out.write("                    </ul>       \n");
      out.write("                </div> <!-- end of tooplate_menu -->\n");
      out.write("            </div> <!-- end of forever header -->\n");
      out.write("\n");
      out.write("            <div class=\"login-card\">\n");
      out.write("                <center>\n");
      out.write("                    <form action=\"Control?action=register\" method=\"post\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"text\" name=\"firstname\" placeholder=\"Firstname\"></td>\n");
      out.write("                            <td>\n");
      out.write("                                <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error_first}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"text\" name=\"lastname\" placeholder=\"Lastname\"></td>\n");
      out.write("                            <td>\n");
      out.write("                                <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error_last}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"text\" name=\"username\" placeholder=\"Username\"></td>\n");
      out.write("                            <td>\n");
      out.write("                                <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error_usernames}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"password\" name=\"password\" placeholder=\"Password\"></td>\n");
      out.write("                            <td>\n");
      out.write("                                <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error_passwords}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"text\" name=\"email\" placeholder=\"Email\"></td>\n");
      out.write("                            <td>\n");
      out.write("                                <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error_email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td><input type=\"submit\" name=\"register\" value=\"REGISTER\" class=\"register-submit\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </form>   \n");
      out.write("                </center>\n");
      out.write("            </div> <!-- end of middle -->\n");
      out.write("        </div>   \n");
      out.write("    </div>  \n");
      out.write("</body>\n");
      out.write("</html>");
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

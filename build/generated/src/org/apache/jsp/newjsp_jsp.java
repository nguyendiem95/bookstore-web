package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Library</title>\n");
      out.write("        <link href=\"css/tooplate_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nivo-slider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"tooplate_body_wrapper\">\n");
      out.write("            <div id=\"tooplate_wrapper\">\n");
      out.write("                <div id=\"tooplate_top_bar\">\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.html\" class=\"social_btn dangxuat\">&nbsp;</a>\n");
      out.write("                </div>\t\n");
      out.write("\n");
      out.write("                <div id=\"tooplate_header\">\n");
      out.write("                    <div id=\"site_title\"><h1><a href=\"#\">Library</a></h1></div>\n");
      out.write("                    <div id=\"tooplate_menu\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"index.html\" class=\"current\">Trang Chủ</a></li>\n");
      out.write("                            <li><a href=\"\">Danh Mục</a></li>\n");
      out.write("                            <li><a href=\"\">Giỏ Sách</a></li>\n");
      out.write("                            <li><a href=\"\">Liên Hệ</a></li>\n");
      out.write("                        </ul>   \t\n");
      out.write("                    </div> <!-- end of tooplate_menu -->\n");
      out.write("                </div> <!-- end of forever header -->\n");
      out.write("            </div></div>\n");
      out.write("        <div id=\"tooplate_main1\">\n");
      out.write("            <center>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <br><br>\n");
      out.write("                <h3> Danh sách các cuốn sách đã mượn </h3>\n");
      out.write("                <table border=\"2px\" style=\"animation: normal\" cellpadding=\"10px\">\n");
      out.write("                    <tr style=\"background-color:#ffccff\">\n");
      out.write("                        <th style=\"width:50%\">Id</th>\n");
      out.write("                        <th style=\"width:10%\">Name</th>\n");
      out.write("                        <th style=\"width:50%\">Quantity</th>\n");
      out.write("                        <th style=\"width:50%\">Price</th>\n");
      out.write("                        <th style=\"width:50%\">Total</th>\n");
      out.write("                        <th style=\"width:100%\"></th>\n");
      out.write("                        <th style=\"width:100%\"></th>\n");
      out.write("                        <th style=\"width:100%\"></th>\n");
      out.write("                    </tr>\n");
      out.write("                    <c:forEach var=\"item\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${carts}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <tr>\n");
      out.write("                        <form action=\"Control?action=update&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getBook().getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&name=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" method=\"post\">\n");
      out.write("\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getBook().getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getBook().getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td><input type=\"text\" name=\"Quantity\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getQuantity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getBook().getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getBook().getPrice()*item.getQuantity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </td>\n");
      out.write("                            <td> \n");
      out.write("                                <button><i class=\"fa fa-edit\"></i></button>\n");
      out.write("                            </td>\n");
      out.write("                        </form>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"Control?action=remove&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getBook().getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&Quantity=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getQuantity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&name=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <i class=\"fa fa-trash-o\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </c:forEach>\n");
      out.write("                    </body>\n");
      out.write("                    </html>\n");
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
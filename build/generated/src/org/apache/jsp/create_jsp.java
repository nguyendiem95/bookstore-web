package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>BookStore</title>\n");
      out.write("\n");
      out.write("        <link href=\"css/tooplate_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nivo-slider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("    </head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("    <body>\n");
      out.write("        <div id=\"tooplate_body_wrapper\">\n");
      out.write("            <div id=\"tooplate_wrapper\">\n");
      out.write("                <div id=\"tooplate_top_bar\">\n");
      out.write("                    <a href=\"/index.html\" class=\"social_btn dangxuat\">&nbsp;</a>\n");
      out.write("                    <a> <input style=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"username\"></a>\n");
      out.write("                </div>\t\n");
      out.write("                <div id=\"tooplate_header\">\n");
      out.write("                    <div id=\"site_title\"><h1><a href=\"#\">Library</a></h1></div>\n");
      out.write("                    <div id=\"tooplate_menu\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"create.jsp\" class=\"current\">Trang Chủ</a></li>\n");
      out.write("                            <li><a href=\"\">Danh Mục</a></li>\n");
      out.write("                            <li><a href=\"Control?action=create&username=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Giỏ Sách</a></li>\n");
      out.write("                            <li><a href=\"\">Liên Hệ</a></li>\n");
      out.write("                        </ul>    \t\n");
      out.write("                    </div> <!-- end of tooplate_menu -->\n");
      out.write("                </div> <!-- end of forever header -->\n");
      out.write("\n");
      out.write("                <div id=\"tooplate_middle\">\n");
      out.write("                    <a href=\"#\"><img src=\"images/tooplate_lp_01.jpg\" /></a>\n");
      out.write("                </div> <!-- end of middle -->\n");
      out.write("\n");
      out.write("                <div id=\"tooplate_main\">\n");
      out.write("\n");
      out.write("                    <div class=\"col_allw300\">\n");
      out.write("                        <h2>Welcome to NTP Library</h2>\n");
      out.write("                        <ul class=\"tooplate_list\">\n");
      out.write("                            BookStore đã, đang và sẽ phấn đấu không ngừng để trở thành nơi lưu truyền tri thức và khơi nguồn cảm hứng thực sự tin cậy, thân thiện của bạn đọc trong và ngoài nước, có uy tín và vị thế xứng đáng trong cộng đồng thư viện Việt Nam.\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                        <a class=\"more\" href=\"#\">More</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col_allw300\">\n");
      out.write("                        <h2><center>Service</center> </h2>\n");
      out.write("                        <ul class=\"tooplate_list\">\n");
      out.write("                            BookStore với các phòng đọc sách hiện đại, tiên tiến, số lượng đầu sách phong phú, đa dạng. Bên cạnh đó còn có các dịch vụ đặt mượn sách online, giúp bạn lựa chọn trước cuốn sách mình mong muốn.\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                        <a class=\"more\" href=\"#\">More</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col_allw300 col_last\">\n");
      out.write("                        <h2>BookStore</h2>\n");
      out.write("                        <div class=\"fp_lp_box\">\n");
      out.write("\n");
      out.write("                            <img src=\"images/tooplate_lp_02.jpg\" alt=\"Image 01\" />\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("            </div>   \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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

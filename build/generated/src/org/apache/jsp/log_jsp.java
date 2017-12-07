package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class log_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <center>\n");
      out.write("            <h1>\n");
      out.write("                Login page\n");
      out.write("            </h1>\n");
      out.write("        </center>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"white\">\n");
      out.write("        <center>\n");
      out.write("        <form mehod=post action=\"login.jsp\" name=\"myform\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <b> REGISTER ID</b></td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=text name=\"txt1\">  \n");
      out.write("                    </td> \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td> <b>\n");
      out.write("                         PASSWORD\n");
      out.write("                    </b></td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=password name=\"txt2\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"submit\">\n");
      out.write("             <br>\n");
      out.write("             <br>\n");
      out.write("             <br>\n");
      out.write("             <hr>\n");
      out.write("             <a href=\"registration.jsp\"><H2>sign up!</H2></a>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

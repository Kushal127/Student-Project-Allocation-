package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class resultdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <H1><B><center>STUDENT PROJECT ALLOCATION</center></B></H1> \n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"00ff00ff\">\n");
      out.write("         <form method=\"post\" action=\"teamalot.jsp\">\n");
      out.write("                    <center>\n");
      out.write("                        <table cellspacing=\"5\" cellpading=\"5\">\n");
      out.write("                        <tr><td>Teamno</td><td> <input type=\"text\" name=\"txt\" value=\"\" /> </td></tr>\n");
      out.write("                        <tr><td>Mem1  </td><td><input type=\"text\" name=\"txt1\" value=\"\"/> </td></tr>\n");
      out.write("                        <tr><td>Mem2</td> <td> <input type=\"text\" name=\"txt2\" value=\"\"/></td> </tr>\n");
      out.write("                        <tr><td>Mem3  </td><td><input type=\"text\" name=\"txt3\" value=\"\"/> </td></tr>\n");
      out.write("                        \n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <tr><td>Title</td><td> <input type=\"text\" name=\"txt4\" value=\"\" /> </td> </tr>\n");
      out.write("                        <tr><td>front End </td><td><input type=\"text\" name=\"txt5\" value=\"\" /> </td></tr>\n");
      out.write("                        <tr><td> Back End</td><td> <input type=\"text\" name=\"txt6\" value=\"\" /></td> </tr>\n");
      out.write("                        <tr><td> Remark</td><td> <input type=\"text\" name=\"txt7\" value=\"\" /> </td></tr>\n");
      out.write("                        <center> <tr><td><center> <input type=\"submit\" value=\"submit\"/></center></td></tr> \n");
      out.write("                    </center></table>\n");
      out.write("                </form>\n");
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

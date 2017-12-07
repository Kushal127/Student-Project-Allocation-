package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class projallocation_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <h1> </h1>\n");
      out.write("    <form action=\"\" method=\"POST\">\n");
      out.write("        <center><table>  \n");
      out.write("                <tr>TEAM NUMBER\n");
      out.write("                    <td><select name=\"tno\">\n");
      out.write("                        <option>1</option>\n");
      out.write("                        <option>2</option>\n");
      out.write("                        <option>3</option>\n");
      out.write("                        <option>4</option>\n");
      out.write("                        <option>5</option>\n");
      out.write("                        <option>6</option>\n");
      out.write("                        <option>7</option>\n");
      out.write("                        <option>8</option>\n");
      out.write("                        <option>9</option>\n");
      out.write("                        <option>10</option>\n");
      out.write("                        <option>11</option>\n");
      out.write("                        <option>12</option>\n");
      out.write("                        <option>13</option>\n");
      out.write("                        <option>14</option>\n");
      out.write("                        <option>15</option>\n");
      out.write("                        <option>16</option>\n");
      out.write("                        <option>17</option>\n");
      out.write("                        <option>18</option>\n");
      out.write("                        <option>19</option>\n");
      out.write("                        <option>20</option>\n");
      out.write("                  </select>   \n");
      out.write("                </td></tr>\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                <tr>    TEAM MEMBERS\n");
      out.write("                    <td> <select name=\"tmem\" size=\"3\">\n");
      out.write("                            <option></option>\n");
      out.write("                            <option></option>\n");
      out.write("                            <option></option>\n");
      out.write("                     </select> \n");
      out.write("                 </td></tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <tr><td> <input type=\"checkbox\" name=\"a\" value=\" \"/>student project alloc</td></tr>\n");
      out.write("                <tr><td><input type=\"checkbox\" name=\"a\" value=\" \" />online examination</td></tr>\n");
      out.write("                <tr><td><input type=\"checkbox\" name=\"a\" value=\" \" />libraby management</td></tr>\n");
      out.write("                <tr><td><input type=\"checkbox\" name=\"a\" value=\" \" />ofice management</td></tr>\n");
      out.write("                <tr><td><input type=\"checkbox\" name=\"\" value=\" aaa\" />aaa</td></tr>\n");
      out.write("                <tr><td><input type=\"checkbox\" name=\"\" value=\"bbb\" />bbb</td></tr>\n");
      out.write("            </table>            \n");
      out.write("        </center>    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("    \n");
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

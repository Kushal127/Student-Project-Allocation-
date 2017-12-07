package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class resultgrades_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <H1><B><center>STUDENT PROJECT ALLOCATION</center></B></H1>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"green\">\n");
      out.write("                <form name=\"form1\"><center>\n");
      out.write("                        ");

                        try
                        {
                        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                        Connection cn=DriverManager.getConnection("jdbc:odbc:team1","anila","gopisetty");
                        Statement st=cn.createStatement();
                        Statement st1=cn.createStatement();
                        Statement st2=cn.createStatement();                     
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <table border=\"2\" cellspacing=5 cellpading=5>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Regid </th>\n");
      out.write("                                <th>total</th>\n");
      out.write("                                <th>subid </th>\n");
      out.write("                                <th>grade </th>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            ");

                            
                            ResultSet rs=st.executeQuery("select * from result where grade='A'");
                            while(rs.next())
                            {
                            
                            
                            out.println("<tr>");
                            out.println("<td>"+rs.getString(1)+"</td>");
                            out.println("<td>"+rs.getString(2)+"</td>");
                            out.println("<td>"+rs.getString(3)+"</td>");
                            out.println("<td>"+rs.getString(4)+"</td>");
                            
                            out.println("</tr>"); 
                            
                            
                            }
                            rs.close();
                            
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <table border=\"2\" cellspacing=5 cellpading=5>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Regid </th>\n");
      out.write("                                <th>total</th>\n");
      out.write("                                <th>subid </th>\n");
      out.write("                                <th>grade </th>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            ");

                            ResultSet rs1=st1.executeQuery("select * from result where grade='B'");
                            while(rs1.next())
                            {
                            out.println("<tr>");
                            out.println("<td>"+rs1.getString(1)+"</td>");
                            out.println("<td>"+rs1.getString(2)+"</td>");
                            out.println("<td>"+rs1.getString(3)+"</td>");
                            out.println("<td>"+rs1.getString(4)+"</td>");
                            out.println("</tr>");
                            
                            
                            }
                            rs1.close();
                            
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <table border=\"2\" cellspacing=5 cellpading=5>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Regid </th>\n");
      out.write("                            <th>total</th>\n");
      out.write("                            <th>subid </th>\n");
      out.write("                            <th>grade </th>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                        ");

                        ResultSet rs2=st2.executeQuery("select * from result where grade='C'");
                        while(rs2.next())
                        {
                        out.println("<tr>");
                        out.println("<td>"+rs2.getString(1)+"</td>");
                        out.println("<td>"+rs2.getString(2)+"</td>");
                        out.println("<td>"+rs2.getString(3)+"</td>");
                        out.println("<td>"+rs2.getString(4)+"</td>");
                        out.println("</tr>");
                        
                        
                        }
                        rs2.close();
                        
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        ");

                        }
                        catch(Exception e)
                        {
                        out.println("error is"+e);
                        
                        }
                        
      out.write("\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                    </center>             \n");
      out.write("                </form>\n");
      out.write("   \n");
      out.write("<a href=\"linker.jsp\"><H2>exit!</H2></a>\n");
      out.write("     \n");
      out.write("  <a href=\"resultdetails.jsp\"><H2>team Allot!</H2></a>\n");
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

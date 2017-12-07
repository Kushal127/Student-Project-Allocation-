package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class teamreport_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <h1><b><center>STUDENT PROJECT ALLOCATION</center></b></h1>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"pink\">\n");
      out.write("\n");
      out.write("    ");

     try
         {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          Connection cn=DriverManager.getConnection("jdbc:odbc:team1","anila","gopisetty");
          Statement st=cn.createStatement();
          ResultSet rs=st.executeQuery("select * from team");
          
          
     
          
      out.write(" \n");
      out.write("          <form name=\"form1\">\n");
      out.write("              \n");
      out.write("          <table border=\"2\" cellspacing=\"5\" cellpadding=\"5\">\n");
      out.write("              <thead>\n");
      out.write("                  <tr>\n");
      out.write("                      <th> Teamno</th>\n");
      out.write("                      <th>Grade A</th>\n");
      out.write("                      <th>Grade B</th>\n");
      out.write("                      <th>Grade C</th>\n");
      out.write("                      <th>projecttitle</th>\n");
      out.write("                      <th>Front end</th>\n");
      out.write("                      <th>Back end</th>\n");
      out.write("                      <th>Remark</th>\n");
      out.write("                     \n");
      out.write("                      \n");
      out.write("                  </tr>\n");
      out.write("              </thead>\n");
      out.write("              <tbody>\n");
      out.write("                  \n");
      out.write("              \n");
      out.write("          \n");
      out.write("            ");

            
            while(rs.next())
                {
                out.println("<tr>");
                out.println("<td>"+rs.getString(1)+"</td>");
                out.println("<td>"+rs.getString(2)+"</td>");
                out.println("<td>"+rs.getString(3)+"</td>");
                out.println("<td>"+rs.getString(4)+"</td>");
                out.println("<td>"+rs.getString(5)+"</td>");
                out.println("<td>"+rs.getString(6)+"</td>");
                out.println("<td>"+rs.getString(7)+"</td>");
                out.println("<td>"+rs.getString(8)+"</td>");
                 
                
               }
           

    
    //rs.close();
      out.write("\n");
      out.write("       \n");
      out.write("   ");
 }
     catch(Exception e)
     {
         //out.prinln("error is"+e);
         
     }
        
    
    // st.close();
     //cn.close();
    
      out.write("\n");
      out.write(" \n");
      out.write("    </tbody>\n");
      out.write("          </table>\n");
      out.write("          <br><center>\n");
      out.write("              <input type=\"button\" value=\"print\" onclick=\"window().print();\">\n");
      out.write("      </center></form>\n");
      out.write("          \n");
      out.write("    </body>\n");
      out.write("     \n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class teamalot_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("  ");

       try
               {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               Connection cn=DriverManager.getConnection("jdbc:odbc:team1","anila","gopisetty");
               Statement st=cn.createStatement();
               
       int tno=Integer.parseInt(request.getParameter("txt"));
       int mem1=Integer.parseInt(request.getParameter("txt1"));
        int mem2=Integer.parseInt(request.getParameter("txt2"));
        int mem3=Integer.parseInt(request.getParameter("txt3"));
        String tit=request.getParameter("txt4");
        String front=request.getParameter("txt5");
        String back=request.getParameter("txt6");
        String remark=request.getParameter("txt7");
       String qry="insert into team values("+tno+","+mem1+","+mem2+","+mem3+",'"+tit+"','"+front+"','"+back+"','"+remark+"')";
       if(st.executeUpdate(qry)>0)
           {
      out.write("\n");
      out.write("              ");
      if (true) {
        _jspx_page_context.forward("mesage1.jsp? p1=green&p2=recordinserted");
        return;
      }
      out.write("\n");
      out.write("          ");
 }
          else
              {
      out.write("\n");
      out.write("             ");
      if (true) {
        _jspx_page_context.forward("mesage1.jsp? p1=red&p2=record not inserted");
        return;
      }
      out.write(" \n");
      out.write("             ");
 }
              }
           catch(Exception e)
           {
               out.println("error is"+e);
               
           }
       
      out.write("\n");
      out.write("   \n");
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

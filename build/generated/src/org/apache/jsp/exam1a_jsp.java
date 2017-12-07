package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class exam1a_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#00ff00\">\n");
      out.write("\n");
      out.write("    <h1>JSP Page</h1>\n");
      out.write("     <form action=\"result.jsp\" method=\"post\">\n");
      out.write("    \n");
      out.write("      ");

    try
                   {
                   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                   Connection cn=DriverManager.getConnection("jdbc:odbc:team1","anila","gopisetty");
                   Statement st=cn.createStatement();
                   ResultSet rs=st.executeQuery("select * from exam1");
                   String a[]=new String[50];
                   int i,cnt=0;
                   String grade;
                   
                    for(i=1;i<=10;i++)
		{
		
		a[i-1]=(request.getParameter(i+"q"));
		}         
         

i=0;
   while(rs.next())
  {
  
      if(a[i].equals(rs.getString(2)))
  	  
           cnt++;
i++;
  }
   
 if(cnt>=7)
    { 
        grade="A";
        
  } 
 else if((cnt<7)&&(cnt>=4))

    {  grade="B";
      
  }
 else
{
      grade="C";  
      
     
 }  
   
        
         //out.println("count"+cnt);
          //out.println("grade"+grade);
         request.setAttribute("count",cnt);
          request.setAttribute("grade",grade);
       }
          catch(Exception e)
          {
              out.println("error at"+e);
          }
    
        
      out.write("\n");
      out.write("            <h2>\n");
      out.write("               if u hav completed ur exam click result to view ur result\n");
      out.write("           </h2>\n");
      out.write("          <input type=\"button\" value=\"view result\">\n");
      out.write("            \n");
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

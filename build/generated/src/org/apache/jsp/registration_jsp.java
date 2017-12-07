package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title></title>\n");
      out.write("        <script type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"gray\">\n");
      out.write("\n");
      out.write("    <CENTER>  <h1>REGISTRATION FORM</h1></CENTER>\n");
      out.write("\n");
      out.write("\n");
 
int regid=0;
 
try
        {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection cn=DriverManager.getConnection("jdbc:odbc:team1","anila","gopisetty");
        Statement st=cn.createStatement();
        ResultSet rs=st.executeQuery("select max(regid) from register");
        rs.next();
        regid=rs.getInt(1);
        if(regid==0)
            {
            regid=1000;
            }
            else
                {
                regid++;
                rs.close();
                st.close();
                cn.close();
                }
                }
                catch(Exception e)
                {
                    out.println("Exception e"+e);
                    
                }
                
        
 
      out.write("\n");
      out.write("    \n");
      out.write("  \n");
      out.write("\n");
      out.write(" \n");
      out.write("    <h3><marquee><i> FILL THE DETAILS TO WRITE EXAM</i></MARQUEE></H3>\n");
      out.write("      <center>\n");
      out.write("          <form method=\"post\" action=\"registrationform.jsp\">\n");
      out.write("              <table border=\"0\" cellspacing=\"10\" cellpadding=\"10\">\n");
      out.write("                  <thead>\n");
      out.write("                      <tr>\n");
      out.write("                          <th></th>\n");
      out.write("                          <th></th>\n");
      out.write("                      </tr>\n");
      out.write("                  </thead>\n");
      out.write("                  <tbody>\n");
      out.write("                      <tr>\n");
      out.write("                          <td>REGISTRATION ID</td>\n");
      out.write("                          <td><input type=\"text\" name=\"txt1\" value=");
      out.print(regid);
      out.write("> </td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                          <td>REGISTER NAME</td>\n");
      out.write("                          <td><input type=\"text\" name=\"txt2\" value=\"\" /></td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                          <td>DATE OF BIRTH</td>\n");
      out.write("                          <td><select name=\"lst1\">\n");
      out.write("                                  <option>1 </option>\n");
      out.write("                                  <option>2 </option>\n");
      out.write("                                  <option>3 </option>\n");
      out.write("                                  <option>4 </option>\n");
      out.write("                                  <option>5 </option>\n");
      out.write("                                  <option>6 </option>\n");
      out.write("                                  <option>7 </option>\n");
      out.write("                                  <option>8 </option>\n");
      out.write("                                  <option>9 </option>\n");
      out.write("                                  <option>10 </option>\n");
      out.write("                              </select><select name=\"mlst1\">\n");
      out.write("                                  <option>JAN </option>\n");
      out.write("                                  <option>FEB </option>\n");
      out.write("                                  <option>MARCH </option>\n");
      out.write("                                  <option>APRL </option>\n");
      out.write("                                  <option>MAY </option>\n");
      out.write("                                  <option>JUNE </option>\n");
      out.write("                                  <option>JULY </option>\n");
      out.write("                                  <option>AUGUST </option>\n");
      out.write("                                  <option>SEP </option>\n");
      out.write("                                  <option>OCT </option>\n");
      out.write("                                  <option>NOV </option>\n");
      out.write("                                  <option>DEC </option>\n");
      out.write("                              </select><select name=\"ylst1\">\n");
      out.write("                                  <option>1986</option>\n");
      out.write("                                  <option>1987</option>\n");
      out.write("                                  <option>1988</option>\n");
      out.write("                                  <option>1989</option>\n");
      out.write("                                  <option>1990</option>\n");
      out.write("                                  <option>1991</option>\n");
      out.write("                                  <option>1992</option>\n");
      out.write("                                  <option>1993</option>\n");
      out.write("                                  <option>1994</option>\n");
      out.write("                                  <option>1995</option>\n");
      out.write("                          </select></td>\n");
      out.write("                      </tr>\n");
      out.write("                      \n");
      out.write("                      <tr>\n");
      out.write("                          <td>GENDER</td>\n");
      out.write("                          <td>f<input type=\"radio\" name=\"rad1\" value=\"f\" />\n");
      out.write("                              m<input type=\"radio\" name=\"rad1\" value=\"m\" />\n");
      out.write("                              \n");
      out.write("                      </td>\n");
      out.write("                      </tr>\n");
      out.write("                      \n");
      out.write("                      <tr>\n");
      out.write("                          <td>PHONE NUMBER</td>\n");
      out.write("                          <td><input type=\"text\" name=\"txt3\" value=\"\" /></td>\n");
      out.write("                      </tr>\n");
      out.write("                       <tr>\n");
      out.write("                          <td>ADDRESS</td>\n");
      out.write("                          <td> <input type=\"text\" name=\"txt4\" value=\"\" />\n");
      out.write("                           </td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                          <td>\n");
      out.write("                              E-MAIL\n");
      out.write("                          </td>\n");
      out.write("                          <td><input type=\"text\" name=\"txt5\" value=\"\" /></td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                          <td>COURSE</td>\n");
      out.write("                          <td>MCA<select name=\"year\">\n");
      out.write("                                  <option value=\"1st year\">MCA1st year</option>\n");
      out.write("                                  <option value=\"2nd year\">MCA2nd year</option>\n");
      out.write("                                  <option value=\"3rd year\">MCA3rd year</option>\n");
      out.write("                          </select></td>\n");
      out.write("                      </tr>\n");
      out.write("                      \n");
      out.write("                       \n");
      out.write("                      <tr>\n");
      out.write("                          <td>PASSWORD</td>\n");
      out.write("                          <td><input type=\"password\" name=\"pword\" value=\"\" /></td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr align=\"center\">\n");
      out.write("                         <td><input type=\"reset\" value=\"reset\" /></td>\n");
      out.write("                           <td><input type=\"submit\" value=\"submit\" /></td>\n");
      out.write("                      </tr>\n");
      out.write("                     <!--  <tr>\n");
      out.write("                          <td><input type=\"reset\" value=\"reset\" /></td>\n");
      out.write("                           \n");
      out.write("                      </tr>-->\n");
      out.write("                  </tbody>\n");
      out.write("              </table>\n");
      out.write("              \n");
      out.write("          </form>\n");
      out.write("      </center>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!--copied code-->\n");
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

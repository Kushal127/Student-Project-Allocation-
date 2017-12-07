package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class exam1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <H1>STUDENT PROJECT ALLOCATION</H1>  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <center><h2> ONLINE EXAMINATION FORM</h2></center>\n");
      out.write("    <form action=\"exam1a.jsp\" method=\"POST\">\n");
      out.write("        ");

           String uid = session.getAttribute("userId").toString();
           System.out.println("user id is : "+uid);
           String sid=session.getAttribute("subid").toString();
           System.out.println("subject id:"+sid);
        
      out.write("\n");
      out.write("        <table border=\"0\" cellspacing=\"10\" cellpadding=\"10\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Regid<input type=\"text\" name=\"txt\" value=");
      out.print(uid);
      out.write("></th>\n");
      out.write("                    \n");
      out.write("                    <th>Subid<input type=\"text\" name=\"text\" value=");
      out.print(sid);
      out.write("></th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Ques no </td>\n");
      out.write("                    <td><input type=\"text\" name=\"txt1\" value=\"1\" readonly=\"readonly\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Desc</td>\n");
      out.write("                    <td><textarea name=\"txt2\" rows=\"2\" cols=\"20\" readonly=\"readonly\">who is father of computers\n");
      out.write("                    </textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>a<input type=\"radio\" name=\"1q\" value=\"a\" />franklin</td>\n");
      out.write("                    <td>b<input type=\"radio\" name=\"1q\" value=\"b\" />godfrey</td>\n");
      out.write("                    <td>c<input type=\"radio\" name=\"1q\" value=\"c\" />charles babbage</td>\n");
      out.write("                    <td>d<input type=\"radio\" name=\"1q\" value=\"d\" />dennis rich</td>\n");
      out.write("                   </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>ques no</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txt3\" value=\"2\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Desc</td>\n");
      out.write("                    <td><textarea name=\"txt4\" rows=\"2\" cols=\"50\">who developed java\n");
      out.write("                    </textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <td>a<input type=\"radio\" name=\"2q\" value=\"a\" />james goslin</td>\n");
      out.write("                    <td>b<input type=\"radio\" name=\"2q\" value=\"b\" />franklin</td>\n");
      out.write("                    <td>c<input type=\"radio\" name=\"2q\" value=\"c\" />dennisrich</td>\n");
      out.write("                    <td>d<input type=\"radio\" name=\"2q\" value=\"d\" />charles babbage</td>\n");
      out.write("                      \n");
      out.write("                </tr>\n");
      out.write("                 \n");
      out.write("                  <tr>\n");
      out.write("                    <td>Ques no </td>\n");
      out.write("                    <td><input type=\"text\" name=\"txt1\" value=\"3\" readonly=\"readonly\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Desc</td>\n");
      out.write("                    <td><textarea name=\"txt2\" rows=\"2\" cols=\"50\" readonly=\"readonly\">abbrevation of jdk \n");
      out.write("                    </textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   <td>a<input type=\"radio\" name=\"3q\" value=\"a\" />java desk kit</td>\n");
      out.write("                    <td>b<input type=\"radio\" name=\"3q\" value=\"b\" />java development kit</td>\n");
      out.write("                    <td>c<input type=\"radio\" name=\"3q\" value=\"c\" />java developer kit</td>\n");
      out.write("                    <td>d<input type=\"radio\" name=\"3q\" value=\"d\" />java divert kit</td>\n");
      out.write("                     \n");
      out.write("                </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>Ques no </td>\n");
      out.write("                    <td><input type=\"text\" name=\"txt1\" value=\"4\" readonly=\"readonly\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Desc</td>\n");
      out.write("                    <td><textarea name=\"txt2\" rows=\"2\" cols=\"50\" readonly=\"readonly\">extension  of cpp \n");
      out.write("                    </textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                     <td>a<input type=\"radio\" name=\"4q\" value=\"a\" />.cpp</td>\n");
      out.write("                    <td>b<input type=\"radio\" name=\"4q\" value=\"b\" />.xyz</td>\n");
      out.write("                    <td>c<input type=\"radio\" name=\"4q\" value=\"c\" />.c++</td>\n");
      out.write("                    <td>d<input type=\"radio\" name=\"4q\" value=\"d\" />.c</td>\n");
      out.write("                     \n");
      out.write("                </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>Ques no </td>\n");
      out.write("                    <td><input type=\"text\" name=\"txt1\" value=\"5\" readonly=\"readonly\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Desc</td>\n");
      out.write("                    <td><textarea name=\"txt2\" rows=\"2\" cols=\"50\" readonly=\"readonly\">developer of c language\n");
      out.write("                    </textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                     <td>a<input type=\"radio\" name=\"5q\" value=\"a\" />subranthi</td>\n");
      out.write("                    <td>b<input type=\"radio\" name=\"5q\" value=\"b\" />balaguru swami</td>\n");
      out.write("                    <td>c<input type=\"radio\" name=\"5q\" value=\"c\" />dennisrich</td>\n");
      out.write("                    <td>d<input type=\"radio\" name=\"5q\" value=\"d\" />vera</td>\n");
      out.write("                     \n");
      out.write("                </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>Ques no </td>\n");
      out.write("                    <td><input type=\"text\" name=\"txt1\" value=\"6\" readonly=\"readonly\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Desc</td>\n");
      out.write("                    <td><textarea name=\"txt2\" rows=\"2\" cols=\"50\" readonly=\"readonly\">developer of c++\n");
      out.write("                    </textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                     <td>a<input type=\"radio\" name=\"6q\" value=\"a\" />dennis</td>\n");
      out.write("                    <td>b<input type=\"radio\" name=\"6q\" value=\"b\" />balaguruswami</td>\n");
      out.write("                    <td>c<input type=\"radio\" name=\"6q\" value=\"c\" />bj stras strup</td>\n");
      out.write("                    <td>d<input type=\"radio\" name=\"6q\" value=\"d\" />franklin</td>\n");
      out.write("                     \n");
      out.write("                </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>Ques no </td>\n");
      out.write("                    <td><input type=\"text\" name=\"txt1\" value=\"7\" readonly=\"readonly\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Desc</td>\n");
      out.write("                    <td><textarea name=\"txt2\" rows=\"2\" cols=\"50\" readonly=\"readonly\">what is the programming independent language\n");
      out.write("                    </textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>a<input type=\"radio\" name=\"7q\" value=\"a\" />java</td>\n");
      out.write("                    <td>b<input type=\"radio\" name=\"7q\" value=\"b\" />c</td>\n");
      out.write("                    <td>c<input type=\"radio\" name=\"7q\" value=\"c\" />c++</td>\n");
      out.write("                    <td>d<input type=\"radio\" name=\"7q\" value=\"d\" />fortran</td>\n");
      out.write("                     \n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Ques no </td>\n");
      out.write("                    <td><input type=\"text\" name=\"txt1\" value=\"8\" readonly=\"readonly\" /></td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Desc</td>\n");
      out.write("                    <td><textarea name=\"txt2\" rows=\"2\" cols=\"50\" readonly=\"readonly\">what is the object oriented programing language\n");
      out.write("                    </textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>a<input type=\"radio\" name=\"8q\" value=\"a\" />c</td>\n");
      out.write("                    <td>b<input type=\"radio\" name=\"8q\" value=\"b\" />java</td>\n");
      out.write("                    <td>c<input type=\"radio\" name=\"8q\" value=\"c\" />fortran</td>\n");
      out.write("                    <td>d<input type=\"radio\" name=\"8q\" value=\"d\" />cobol</td>\n");
      out.write("                     \n");
      out.write("                </tr> <tr>\n");
      out.write("                    <td>Ques no </td>\n");
      out.write("                    <td><input type=\"text\" name=\"txt1\" value=\"9\" readonly=\"readonly\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Desc</td>\n");
      out.write("                    <td><textarea name=\"txt2\" rows=\"2\" cols=\"50\" readonly=\"readonly\">Abrevation of ALP\n");
      out.write("                    </textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>a<input type=\"radio\" name=\"9q\" value=\"a\" />assembler language program</td>\n");
      out.write("                    <td>b<input type=\"radio\" name=\"9q\" value=\"b\" />assembly language programming</td>\n");
      out.write("                    <td>c<input type=\"radio\" name=\"9q\" value=\"c\" />assembly language principles</td>\n");
      out.write("                    <td>d<input type=\"radio\" name=\"9q\" value=\"d\" />assembed progamming language</td>\n");
      out.write("                     \n");
      out.write("                </tr> <tr>\n");
      out.write("                    <td>Ques no </td>\n");
      out.write("                    <td><input type=\"text\" name=\"txt1\" value=\"10\" readonly=\"readonly\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Desc</td>\n");
      out.write("                    <td><textarea name=\"txt2\" rows=\"2\" cols=\"50\" readonly=\"readonly\">why we call java object orinted language\n");
      out.write("                    </textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>a<input type=\"radio\" name=\"10q\" value=\"a\" />with out object no program</td>\n");
      out.write("                    <td>b<input type=\"radio\" name=\"10q\" value=\"b\" />object are not used</td>\n");
      out.write("                    <td>c<input type=\"radio\" name=\"10q\" value=\"c\" />objects are used</td>\n");
      out.write("                    <td>d<input type=\"radio\" name=\"10q\" value=\"d\" />without class no program </td>\n");
      out.write("                     \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("         <center>\n");
      out.write("            <input type=\"submit\" value=\"submit\">\n");
      out.write("        </center>\n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("   \n");
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

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%--
The taglib directive below imports the JSTL library. If you uncomment it,
you must also add the JSTL library to the project. The Add Library... action
on Libraries node in Projects view can be used to add the JSTL 1.1 library.
--%>
<%--
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" import="java.sql.*"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <script type="text/javascript"></script>
        
    </head>
    <body bgcolor="gray">

    <CENTER>  <h1>REGISTRATION FORM</h1></CENTER>


<% 
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
                
        
 %>
    
  

 
    <h3><marquee><i> FILL THE DETAILS TO WRITE EXAM</i></MARQUEE></H3>
      <center>
          <form method="post" action="registrationform.jsp">
              <table border="0" cellspacing="10" cellpadding="10">
                  <thead>
                      <tr>
                          <th></th>
                          <th></th>
                      </tr>
                  </thead>
                  <tbody>
                      <tr>
                          <td>REGISTRATION ID</td>
                          <td><input type="text" name="txt1" value=<%=regid%>> </td>
                      </tr>
                      <tr>
                          <td>REGISTER NAME</td>
                          <td><input type="text" name="txt2" value="" /></td>
                      </tr>
                      <tr>
                          <td>DATE OF BIRTH</td>
                          <td><select name="lst1">
                                  <option>1 </option>
                                  <option>2 </option>
                                  <option>3 </option>
                                  <option>4 </option>
                                  <option>5 </option>
                                  <option>6 </option>
                                  <option>7 </option>
                                  <option>8 </option>
                                  <option>9 </option>
                                  <option>10 </option>
                              </select><select name="mlst1">
                                  <option>JAN </option>
                                  <option>FEB </option>
                                  <option>MARCH </option>
                                  <option>APRL </option>
                                  <option>MAY </option>
                                  <option>JUNE </option>
                                  <option>JULY </option>
                                  <option>AUGUST </option>
                                  <option>SEP </option>
                                  <option>OCT </option>
                                  <option>NOV </option>
                                  <option>DEC </option>
                              </select><select name="ylst1">
                                  <option>1986</option>
                                  <option>1987</option>
                                  <option>1988</option>
                                  <option>1989</option>
                                  <option>1990</option>
                                  <option>1991</option>
                                  <option>1992</option>
                                  <option>1993</option>
                                  <option>1994</option>
                                  <option>1995</option>
                          </select></td>
                      </tr>
                      
                      <tr>
                          <td>GENDER</td>
                          <td>f<input type="radio" name="rad1" value="f" />
                              m<input type="radio" name="rad1" value="m" />
                              
                      </td>
                      </tr>
                      
                      <tr>
                          <td>PHONE NUMBER</td>
                          <td><input type="text" name="txt3" value="" /></td>
                      </tr>
                       <tr>
                          <td>ADDRESS</td>
                          <td> <input type="text" name="txt4" value="" />
                           </td>
                      </tr>
                      <tr>
                          <td>
                              E-MAIL
                          </td>
                          <td><input type="text" name="txt5" value="" /></td>
                      </tr>
                      <tr>
                          <td>COURSE</td>
                          <td>MCA<select name="year">
                                  <option value="1st year">MCA1st year</option>
                                  <option value="2nd year">MCA2nd year</option>
                                  <option value="3rd year">MCA3rd year</option>
                          </select></td>
                      </tr>
                      
                       
                      <tr>
                          <td>PASSWORD</td>
                          <td><input type="password" name="pword" value="" /></td>
                      </tr>
                      <tr align="center">
                         <td><input type="reset" value="reset" /></td>
                           <td><input type="submit" value="submit" /></td>
                      </tr>
                     <!--  <tr>
                          <td><input type="reset" value="reset" /></td>
                           
                      </tr>-->
                  </tbody>
              </table>
              
          </form>
      </center>
   
    
    
    <!--copied code-->
    
    </body>
</html>

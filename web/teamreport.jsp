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
        <h1><b><center>STUDENT PROJECT ALLOCATION</center></b></h1>
    </head>
    <body bgcolor="pink">

    <%
     try
         {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          Connection cn=DriverManager.getConnection("jdbc:odbc:team1","anila","gopisetty");
          Statement st=cn.createStatement();
          ResultSet rs=st.executeQuery("select * from team");
          
          
     
          %> 
          <form name="form1">
              
          <table border="2" cellspacing="5" cellpadding="5">
              <thead>
                  <tr>
                      <th> Teamno</th>
                      <th>Grade A</th>
                      <th>Grade B</th>
                      <th>Grade C</th>
                      <th>projecttitle</th>
                      <th>Front end</th>
                      <th>Back end</th>
                      <th>Remark</th>
                     
                      
                  </tr>
              </thead>
              <tbody>
                  
              
          
            <%
            
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
           

    
    //rs.close();%>
       
   <% }
     catch(Exception e)
     {
         //out.prinln("error is"+e);
         
     }
        
    
    // st.close();
     //cn.close();
    %>
 
    </tbody>
          </table>
          <br><center>
              <input type="button" value="print" onclick="window().print();">
      </center>
  <a href="mmm.jsp"><H2>back!</H2></a>
  
  </form>
          
    </body>
     
    </body>
</html>

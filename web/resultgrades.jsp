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
        <H1><B><center>STUDENT PROJECT ALLOCATION</center></B></H1>
    </head>
    <body bgcolor="green">
                <form name="form1"><center>
                        <%
                        try
                        {
                        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                        Connection cn=DriverManager.getConnection("jdbc:odbc:team1","anila","gopisetty");
                        Statement st=cn.createStatement();
                        Statement st1=cn.createStatement();
                        Statement st2=cn.createStatement();                     
                        %>
                        
                        
                        <table border="2" cellspacing=5 cellpading=5>
                            <tr>
                                <th>Regid </th>
                                <th>total</th>
                                <th>subid </th>
                                <th>grade </th>
                                
                            </tr>
                            
                            <%
                            
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
                            %>
                        </table>
                        <br>
                        <br>
                        <br>
                        <table border="2" cellspacing=5 cellpading=5>
                            <tr>
                                <th>Regid </th>
                                <th>total</th>
                                <th>subid </th>
                                <th>grade </th>
                                
                            </tr>
                            <%
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
                            %>
                        </table>
                        <br>
                        <br>
                        <br>
                        <table border="2" cellspacing=5 cellpading=5>
                        <tr>
                            <th>Regid </th>
                            <th>total</th>
                            <th>subid </th>
                            <th>grade </th>
                            
                        </tr>
                        <%
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
                        
                        %>
                        
                        <%
                        }
                        catch(Exception e)
                        {
                        out.println("error is"+e);
                        
                        }
                        %>
                    
                        
                    </center>             
                </form>
   
<a href="linker.jsp"><H2>exit!</H2></a>
     
  <a href="resultdetails.jsp"><H2>team Allot!</H2></a>
    <input type="button" value="print" onclick="window().print();">
    </body>
</html>

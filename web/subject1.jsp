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
        
    </head>
    <body>

    
    
    <%
    
   try{
           
           int str=Integer.parseInt(request.getParameter("sid"));
            session.setAttribute("subid",str);
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           Connection cn=DriverManager.getConnection("jdbc:odbc:team1","anila","gopisetty");
           Statement st=cn.createStatement();
           
           
           if(str==1){%>
               <jsp:forward page="exam1.jsp"/>
                       <%} else if(str==2){
                          %> <jsp:forward page="exam2.jsp"/>
                          <%}
           
           }catch(Exception e){
               out.println("error is"+e);
               
           }
           
    %>
    
    </body>
</html>

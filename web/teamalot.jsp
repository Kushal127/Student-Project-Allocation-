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
           {%>
              <jsp:forward page="message3.jsp?p1=green&p2=recordinserted"/>
          <% }
          else
              {%>
             <jsp:forward page="message3.jsp? p1=red&p2=record not inserted"/> 
             <% }
              }
           catch(Exception e)
           {
               out.println("error is"+e);
               
           }
       %>
   
    </body>
</html>

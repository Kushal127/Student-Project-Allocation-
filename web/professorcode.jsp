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
        <title>JSP Page</title>
    </head>
    <body>

    <% 
              try{
                  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                  Connection cn=DriverManager.getConnection("jdbc:odbc:team1","anila","gopisetty");
                  Statement st=cn.createStatement();
                  String uid=request.getParameter("txt1");
                  String pwd=request.getParameter("txt2");
                  //if(uid=="anila"&&pwd=="rao")
                      if(uid.equals("anila")&&pwd.equals("rao"))
                      {%>
                      <jsp:forward page="linker.jsp"/>
                      <%}
                      else
                         { %><jsp:forward page="message2.jsp?p1=black&p2=wrong entry"/>
                     <% }
                  }
                   catch(Exception e)
                         {
                            out.println("exception is"+e);
                         }
                        %>
    </body>
</html>

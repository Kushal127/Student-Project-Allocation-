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
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <h1><B>STUDENT PROJECT ALLOCATION</B></h1>
    </head>
     

    <h1>To Know ur Result</h1>
    <%
    String s1=request.getParameter("p1");
    String s2=request.getParameter("p2");
    %>
    <body bgcolor= <%=s1%> text=white>
        <center>
            <h1><%=s2%></h1>
            <br>
            
            <a href="resultgrades.jsp">Result</a>
            <h2>to move back to home click here</h2>
            <a href="home.html">back</a>
            
        </center>
    
    
    </body>
</html>

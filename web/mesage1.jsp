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
        <H1>STUDENT PROJECT ALLOCATION</H1>  
    </head>
    <body>

    
     

 
    <%
    String s1=request.getParameter("p1");
    String s2=request.getParameter("p2");
    %>
    <body bgcolor= <%=s1%> text=white>
        <center>
            <h1><%=s2%></h1>
            <br>
            <h2>to continue for writing exam click</h2> 
            <a href="subject.jsp">next</a>
            <h2>to exit from this page click back</h2>
            <a href ="home.html">back</a>
            
        </center>
   
    </c:if>
     
    
    </body>
</html>

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
    <body bgcolor="00ff00ff">
         <form method="post" action="teamalot.jsp">
                    <center>
                        <table cellspacing="5" cellpading="5">
                        <tr><td>Teamno</td><td> <input type="text" name="txt" value="" /> </td></tr>
                        <tr><td>Mem1  </td><td><input type="text" name="txt1" value=""/> </td></tr>
                        <tr><td>Mem2</td> <td> <input type="text" name="txt2" value=""/></td> </tr>
                        <tr><td>Mem3  </td><td><input type="text" name="txt3" value=""/> </td></tr>
                        
                        <br>
                        <br>
                        <tr><td>Title</td><td> <input type="text" name="txt4" value="" /> </td> </tr>
                        <tr><td>front End </td><td><input type="text" name="txt5" value="" /> </td></tr>
                        <tr><td> Back End</td><td> <input type="text" name="txt6" value="" /></td> </tr>
                        <tr><td> Remark</td><td> <input type="text" name="txt7" value="" /> </td></tr>
                       
                        
                        <center> <tr><td><center> <input type="submit" value="submit"/></center></td></tr> 
                    </center></table>
                     <a href="resultgrades.jsp"><H2>back!</H2></a>
                </form>
    </body>
</html>

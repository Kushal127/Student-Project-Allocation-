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
<%@ page language="java" import="java.sql.*" session="false"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <H1><B><center>STUDENT PROJECT ALLOCATION</center></B></H1>
    </head>
    <body bgcolor="ffff66">
        <center>
            <form action="subject1.jsp" method="POST">
                <table border="0" cellspacing="10" cellpadding="10">
                    <thead>
                        <tr>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>SUBJECT ID </td>
                            <td><select name="sid">
                                    <option value=" "> </option>
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                            </select></td>
                        </tr>
                        <tr>
                            <td>SUBJECT DESC</td>
                            <td><textarea name="subdesc" rows="4" cols="20">
                            </textarea></td>
                        </tr>
                        <tr>
                            <td>
                                <input type="submit" value="next" />
                            </td>
                        </tr>
                    </tbody>
                </table>
                
            </form>
        </center>
   
    
    </body>
    
</html>

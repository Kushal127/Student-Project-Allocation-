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
        <H1>STUDENT PROJECT ALLOCATION</H1>
    </head>
    <body>

    <h1>Examination Form 2</h1>
     <form action="exam2a.jsp" method="POST">
          <%
           String uid = session.getAttribute("userId").toString();
           System.out.println("user id is : "+uid);
            String sid=session.getAttribute("subid").toString();
           System.out.println("subject id:"+sid);
        %>
        <table border="0" cellspacing="10" cellpadding="10">
            <thead>
                <tr>
                    <th>Regid<input type="text" name="txt" value=<%=uid%>></th>
                    
                    <th>Subid<input type="text" name="text" value=<%=sid%>></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Ques no </td>
                    <td><input type="text" name="txt1" value="1" readonly="readonly" /></td>
                </tr>
                <tr>
                    <td>Desc</td>
                    <td><textarea name="txt2" rows="2" cols="50" readonly="readonly">who is father of computers
                    </textarea></td>
                </tr>
                <tr>
                    <td>a<input type="radio" name="1q" value="a" />charles babbage</td>
                    <td>b<input type="radio" name="1q" value="b" />dennis rich</td>
                    <td>c<input type="radio" name="1q" value="c" />lueis</td>
                    <td>d<input type="radio" name="1q" value="d" />balaguru swami</td>
                   </tr>
                <tr>
                    <td>ques no</td>
                    <td><input type="text" name="txt3" value="2" /></td>
                </tr>
                <tr>
                    <td>Desc</td>
                    <td><textarea name="txt4" rows="2" cols="50">what is etl
                    </textarea></td>
                </tr>
                <tr>
                  <td>a<input type="radio" name="2q" value="a" />transformation extraction loading</td>
                    <td>b<input type="radio" name="2q" value="b" />extraction transformation loading</td>
                    <td>c<input type="radio" name="2q" value="c" />execution transform load</td>
                    <td>d<input type="radio" name="2q" value="d" />execute translator loader</td>
                      
                </tr>
                 
                  <tr>
                    <td>Ques no </td>
                    <td><input type="text" name="txt1" value="3" readonly="readonly" /></td>
                </tr>
                <tr>
                    <td>Desc</td>
                    <td><textarea name="txt2" rows="2" cols="50" readonly="readonly">what is CRC
                    </textarea></td>
                </tr>
                <tr>
                     <td>a<input type="radio" name="3q" value="a" />classes</td>
                    <td>b<input type="radio" name="3q" value="b" /> classes collabration rotate</td>
                    <td>c<input type="radio" name="3q" value="c" />classes rotation collabration</td>
                    <td>d<input type="radio" name="3q" value="d" />class rotate colaberate</td>
                     
                </tr>
                  <tr>
                    <td>Ques no </td>
                    <td><input type="text" name="txt1" value="4" readonly="readonly" /></td>
                </tr>
                <tr>
                    <td>Desc</td>
                    <td><textarea name="txt2" rows="2" cols="50" readonly="readonly">Abbrevation of ASP
                    </textarea></td>
                </tr>
                <tr>
                  <td>a<input type="radio" name="4q" value="a" />action service pack</td>
                    <td>b<input type="radio" name="4q" value="b" />activator server page</td>
                    <td>c<input type="radio" name="4q" value="c" />active service page</td>
                    <td>d<input type="radio" name="4q" value="d" />active server page</td>
                     
                </tr>
                  <tr>
                    <td>Ques no </td>
                    <td><input type="text" name="txt1" value="5" readonly="readonly"></td>
                </tr>
                <tr>
                    <td>Desc</td>
                    <td><textarea name="txt2" rows="2" cols="50" readonly="readonly">what is analysis
                    </textarea></td>
                </tr>
                <tr>
                      <td>a<input type="radio" name="5q" value="a" />decision analysis</td>
                    <td>b<input type="radio" name="5q" value="b" />decision support</td>
                    <td>c<input type="radio" name="5q" value="c" />decision making</td>
                    <td>d<input type="radio" name="5q" value="d" />designing</td>
                     
                </tr>
                  <tr>
                    <td>Ques no </td>
                    <td><input type="text" name="txt1" value="6" readonly="readonly" /></td>
                </tr>
                <tr>
                    <td>Desc</td>
                    <td><textarea name="txt2" rows="2" cols="50" readonly="readonly">developer of c++
                    </textarea></td>
                </tr>
                <tr>
                    <td>a<input type="radio" name="6q" value="a" />bj straustrep</td>
                    <td>b<input type="radio" name="6q" value="b" />dennis rich</td>
                    <td>c<input type="radio" name="6q" value="c" />veera</td>
                    <td>d<input type="radio" name="6q" value="d" />franklin</td>
                     
                </tr>
                  <tr>
                    <td>Ques no </td>
                    <td><input type="text" name="txt1" value="7" readonly="readonly" /></td>
                </tr>
                <tr>
                    <td>Desc</td>
                    <td><textarea name="txt2" rows="2" cols="50" readonly="readonly">what is the programming independent language
                    </textarea></td>
                </tr>
                <tr>
                    <td>a<input type="radio" name="7q" value="a" />c</td>
                    <td>b<input type="radio" name="7q" value="b" />java</td>
                    <td>c<input type="radio" name="7q" value="c" />pascal</td>
                    <td>d<input type="radio" name="7q" value="d" />c++</td>
                     
                </tr>
                 <tr>
                    <td>Ques no </td>
                    <td><input type="text" name="txt1" value="8" readonly="readonly" /></td> 
                </tr>
                <tr>
                    <td>Desc</td>
                    <td><textarea name="txt2" rows="2" cols="50" readonly="readonly">what is the object oriented programing language
                    </textarea></td>
                </tr>
                <tr>
                    <td>a<input type="radio" name="8q" value="a" />c++,java</td>
                    <td>b<input type="radio" name="8q" value="b" />c,c++</td>
                    <td>c<input type="radio" name="8q" value="c" />java,c</td>
                    <td>d<input type="radio" name="8q" value="d" />c,cobol</td>
                     
                </tr> <tr>
                    <td>Ques no </td>
                    <td><input type="text" name="txt1" value="9" readonly="readonly" /></td>
                </tr>
                <tr>
                    <td>Desc</td>
                    <td><textarea name="txt2" rows="2" cols="50" readonly="readonly">dss means</textarea></td>
                </tr>
                <tr>
                      <td>a<input type="radio" name="9q" value="a" />development support system</td>
                    <td>b<input type="radio" name="9q" value="b" />decision space system</td>
                    <td>c<input type="radio" name="9q" value="c" />designe space system</td>
                    <td>d<input type="radio" name="9q" value="d" />decision support system</td>
                     
                </tr> <tr>
                    <td>Ques no </td>
                    <td><input type="text" name="txt1" value="10" readonly="readonly" /></td>
                </tr>
                <tr>
                    <td>Desc</td>
                    <td><textarea name="txt2" rows="2" cols="50" readonly="readonly">how many types of decisions
                    </textarea></td>
                </tr>
                <tr>
                    <td>a<input type="radio" name="10q" value="a" />5</td>
                    <td>b<input type="radio" name="10q" value="b" />4</td>
                    <td>c<input type="radio" name="10q" value="c" />3</td>
                    <td>d<input type="radio" name="10q" value="d" />1</td>
                     
                </tr>
                
            </tbody>
        </table>
        <center>
        <input type="submit" value="submit"></center>
    </form>
    
    
    
    </body>
  
</html>

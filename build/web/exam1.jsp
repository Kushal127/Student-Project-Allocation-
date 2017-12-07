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

    <center><h2> ONLINE EXAMINATION FORM</h2></center>
    <form action="exam1a.jsp" method="POST">
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
                    <td><textarea name="txt2" rows="2" cols="20" readonly="readonly">who is father of computers
                    </textarea></td>
                </tr>
                <tr>
                    <td>a<input type="radio" name="1q" value="a" />franklin</td>
                    <td>b<input type="radio" name="1q" value="b" />godfrey</td>
                    <td>c<input type="radio" name="1q" value="c" />charles babbage</td>
                    <td>d<input type="radio" name="1q" value="d" />dennis rich</td>
                   </tr>
                <tr>
                    <td>ques no</td>
                    <td><input type="text" name="txt3" value="2" /></td>
                </tr>
                <tr>
                    <td>Desc</td>
                    <td><textarea name="txt4" rows="2" cols="50">who developed java
                    </textarea></td>
                </tr>
                <tr>
                <td>a<input type="radio" name="2q" value="a" />james goslin</td>
                    <td>b<input type="radio" name="2q" value="b" />franklin</td>
                    <td>c<input type="radio" name="2q" value="c" />dennisrich</td>
                    <td>d<input type="radio" name="2q" value="d" />charles babbage</td>
                      
                </tr>
                 
                  <tr>
                    <td>Ques no </td>
                    <td><input type="text" name="txt1" value="3" readonly="readonly" /></td>
                </tr>
                <tr>
                    <td>Desc</td>
                    <td><textarea name="txt2" rows="2" cols="50" readonly="readonly">abbrevation of jdk 
                    </textarea></td>
                </tr>
                <tr>
                   <td>a<input type="radio" name="3q" value="a" />java desk kit</td>
                    <td>b<input type="radio" name="3q" value="b" />java development kit</td>
                    <td>c<input type="radio" name="3q" value="c" />java developer kit</td>
                    <td>d<input type="radio" name="3q" value="d" />java divert kit</td>
                     
                </tr>
                  <tr>
                    <td>Ques no </td>
                    <td><input type="text" name="txt1" value="4" readonly="readonly" /></td>
                </tr>
                <tr>
                    <td>Desc</td>
                    <td><textarea name="txt2" rows="2" cols="50" readonly="readonly">extension  of cpp 
                    </textarea></td>
                </tr>
                <tr>
                     <td>a<input type="radio" name="4q" value="a" />.cpp</td>
                    <td>b<input type="radio" name="4q" value="b" />.xyz</td>
                    <td>c<input type="radio" name="4q" value="c" />.c++</td>
                    <td>d<input type="radio" name="4q" value="d" />.c</td>
                     
                </tr>
                  <tr>
                    <td>Ques no </td>
                    <td><input type="text" name="txt1" value="5" readonly="readonly" /></td>
                </tr>
                <tr>
                    <td>Desc</td>
                    <td><textarea name="txt2" rows="2" cols="50" readonly="readonly">developer of c language
                    </textarea></td>
                </tr>
                <tr>
                     <td>a<input type="radio" name="5q" value="a" />subranthi</td>
                    <td>b<input type="radio" name="5q" value="b" />balaguru swami</td>
                    <td>c<input type="radio" name="5q" value="c" />dennisrich</td>
                    <td>d<input type="radio" name="5q" value="d" />vera</td>
                     
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
                     <td>a<input type="radio" name="6q" value="a" />dennis</td>
                    <td>b<input type="radio" name="6q" value="b" />balaguruswami</td>
                    <td>c<input type="radio" name="6q" value="c" />bj stras strup</td>
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
                    <td>a<input type="radio" name="7q" value="a" />java</td>
                    <td>b<input type="radio" name="7q" value="b" />c</td>
                    <td>c<input type="radio" name="7q" value="c" />c++</td>
                    <td>d<input type="radio" name="7q" value="d" />fortran</td>
                     
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
                    <td>a<input type="radio" name="8q" value="a" />c</td>
                    <td>b<input type="radio" name="8q" value="b" />java</td>
                    <td>c<input type="radio" name="8q" value="c" />fortran</td>
                    <td>d<input type="radio" name="8q" value="d" />cobol</td>
                     
                </tr> <tr>
                    <td>Ques no </td>
                    <td><input type="text" name="txt1" value="9" readonly="readonly" /></td>
                </tr>
                <tr>
                    <td>Desc</td>
                    <td><textarea name="txt2" rows="2" cols="50" readonly="readonly">Abrevation of ALP
                    </textarea></td>
                </tr>
                <tr>
                    <td>a<input type="radio" name="9q" value="a" />assembler language program</td>
                    <td>b<input type="radio" name="9q" value="b" />assembly language programming</td>
                    <td>c<input type="radio" name="9q" value="c" />assembly language principles</td>
                    <td>d<input type="radio" name="9q" value="d" />assembed progamming language</td>
                     
                </tr> <tr>
                    <td>Ques no </td>
                    <td><input type="text" name="txt1" value="10" readonly="readonly" /></td>
                </tr>
                <tr>
                    <td>Desc</td>
                    <td><textarea name="txt2" rows="2" cols="50" readonly="readonly">why we call java object orinted language
                    </textarea></td>
                </tr>
                <tr>
                    <td>a<input type="radio" name="10q" value="a" />with out object no program</td>
                    <td>b<input type="radio" name="10q" value="b" />object are not used</td>
                    <td>c<input type="radio" name="10q" value="c" />objects are used</td>
                    <td>d<input type="radio" name="10q" value="d" />without class no program </td>
                     
                </tr>
                
            </tbody>
        </table>
         <center>
            <input type="submit" value="submit">
        </center>
    </form>
    
    <br>
    <br>
        
    </body>
    
   
</html>

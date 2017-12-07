 <%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<html>
    <head>
        <center>
            <h1>
                Login page
            </h1>
        </center>
    </head>
    <body bgcolor="pink">
        <center>
        <form mehod=post action="login.jsp" name="myform">
            <table>
                <tr>
                    <td> <b> REGISTER ID</b></td>
                    <td>
                        <input type=text name="txt1">  
                    </td> 
                </tr>
                
                <tr>
                    <td> <b>
                         PASSWORD
                    </b></td>
                    <td>
                        <input type=password name="txt2">
                    </td>
                </tr>
            </table>
            <br>
            <br>
            <input type="submit" value="submit">
             <br>
             <br>
             <br>
             <hr>
             <a href="registration.jsp"><H2>sign up!</H2></a>
        </form>
    </body>
</html>

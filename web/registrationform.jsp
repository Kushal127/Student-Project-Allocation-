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
        <title>JSP Page</title>
        <script >
            
        </script>
    </head>
    <body>

     
   
   
<%@ page language="java" import="java.sql.*"%>
<%
 String flag=(String)session.getAttribute("authentication");
 //  if(flag!=null)//authenticate beginning
   //{
//Connection cn=null;
//Statement st=null;

try
        {
                  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                  Connection cn=DriverManager.getConnection("jdbc:odbc:team1","anila","gopisetty");
                  Statement st=cn.createStatement();
                  // out.println("connection established");
                   
                int pregid=Integer.parseInt(request.getParameter("txt1"));
                String prname=request.getParameter("txt2");
                StringBuffer sb = new StringBuffer(request.getParameter("lst1")+"-");
                StringBuffer sb1=sb.append(request.getParameter("mlst1")+"-");
                String pdob = sb1.append(request.getParameter("ylst1")).toString();
                System.out.println(" DOB is : "+pdob);
                String pgender=request.getParameter("rad1");
                int pphone=Integer.parseInt(request.getParameter("txt3"));
                String paddress=request.getParameter("txt4");
                String pemail=request.getParameter("txt5");
                String pcourse=request.getParameter("year");
                String ppwd=request.getParameter("pword");
               // out.println("connection established");
                String qry="insert into register values("+pregid+",'"+prname+"','"+pdob+"','"+pgender+"',"+pphone+",'"+paddress+"','"+pemail+"','"+pcourse+"','"+ppwd+"')";
                out.println("connection established");
                if(st.executeUpdate(qry)>0)
                    { 
                     %>
                   <jsp:forward page="mesage1.jsp? p1=green&p2=recordinserted"/>
                   <%  
                   }
                   
                else 
                    {
                      
                    %>
                    <jsp:forward page="message.jsp? p1=red&p2=record not inserted"/>
                  <%  }
                //  st.close();
                  //cn.close();
                  }
                  catch(Exception e)
                  {
                    out.println("exception is : "+e);
                    e.printStackTrace();
                // }
                    }%>
 
  
    
    
    </body>
</html>

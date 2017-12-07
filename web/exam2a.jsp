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
        <title> </title>
    </head>
    <body>
 
    <%
           String uid = session.getAttribute("userId").toString();
           System.out.println("user id is : "+uid);
            String sid=session.getAttribute("subid").toString();
           System.out.println("subject id:"+sid);
        %>
    
        <%
    try
                   {
                   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                   Connection cn=DriverManager.getConnection("jdbc:odbc:team1","anila","gopisetty");
                   Statement st=cn.createStatement();
                   ResultSet rs=st.executeQuery("select * from exam2");
                   String a[]=new String[50];
                   int i,cnt=0;
                   String grade;
                   
                    for(i=1;i<=10;i++)
		{
		
		a[i-1]=(request.getParameter(i+"q"));
		}         
         

i=0;
   while(rs.next())
  {
  
      if(a[i].equals(rs.getString(2)))
  	  
           cnt++;
i++;
  }
   
 if(cnt>=7)
    { 
        grade="A";
        
  } 
 else if((cnt<7)&&(cnt>=4))

    {  grade="B";
      
  }
 else
{
      grade="C";  
      
     
 }  
         //out.println("count is"+cnt);
        // out.println("grade is"+grade);
        // request.setAttribute("count",cnt);
        //  request.setAttribute("grade",grade);
           String qry1= "insert into result values("+uid+","+cnt+","+sid+",'"+grade+"')";
        if(st.executeUpdate(qry1)>0)
        {%>
           
        <jsp:forward page="message.jsp?p1=datastored&p2=view result in gradepage"/>
        
        <%}
        else{%>
            <jsp:forward page="message.jsp?p1=data not stored&p2=check once again"/>
            <%
        }
         
       }
          
         
          catch(Exception e)
          {
              out.println("error at"+e);
          }
    
        %>
         
    </body>
</html>

 <%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

 <%@ page language="java" import="java.sql.*" session="true"%>
 <script type="text/javascript">   
     function show(){
     alert(" success")
     }
 </script>
 <% 
              try{
                  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                  Connection cn=DriverManager.getConnection("jdbc:odbc:team1","anila","gopisetty");
                  Statement st=cn.createStatement();
                  int uid=Integer.parseInt(request.getParameter("txt1"));
                  String pwd=request.getParameter("txt2");
                  ResultSet rs=st.executeQuery("select * from register where regid="+uid+" and password='"+pwd+"'");
                        if(rs.next())
                             {    out.println("Connection established"); 
                                  session.setAttribute("userId",uid);
                              %>
                               
                              <jsp:forward page="linker.jsp"/>
                              <%                        
                              }
                              else
                  {
                                  %>                                 
                             <jsp:forward page="message.jsp?p1=yellow&p2=try again"/>
                             
                              <%
                             
}
                             }
                         
                         catch(Exception e)
                         {
                            out.println("exception is"+e);
                         }
                        %>
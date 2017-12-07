<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" import="java.sql.*"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>

    <h1> </h1>
    <form action="" method="POST">
        <center><table>  
                <tr>TEAM NUMBER
                    <td><select name="tno">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                        <option>6</option>
                        <option>7</option>
                        <option>8</option>
                        <option>9</option>
                        <option>10</option>
                        <option>11</option>
                        <option>12</option>
                        <option>13</option>
                        <option>14</option>
                        <option>15</option>
                        <option>16</option>
                        <option>17</option>
                        <option>18</option>
                        <option>19</option>
                        <option>20</option>
                  </select>   
                </td></tr>
                <br>
                
                <tr>
                <tr>    TEAM MEMBERS
                    <td> <select name="tmem" size="3">
                            <option></option>
                            <option></option>
                            <option></option>
                     </select> 
                 </td></tr>
                
                
                <tr><td><input type="checkbox" name="a" value=" "/>student project alloc</td></tr>
                <tr><td><input type="checkbox" name="a" value=" " />online examination</td></tr>
                <tr><td><input type="checkbox" name="a" value=" " />libraby management</td></tr>
                <tr><td><input type="checkbox" name="a" value=" " />ofice management</td></tr>
                <tr><td><input type="checkbox" name="" value=" aaa" />aaa</td></tr>
                <tr><td><input type="checkbox" name="" value="bbb" />bbb</td></tr>
            </table>            
        </center>    
        
        
    </form>
    
    
   </body>
</html>

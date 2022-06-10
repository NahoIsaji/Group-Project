<%-- 
    Document   : display
    Created on : 7-Dec-2021, 11:47:01 AM
    Author     : N_isaji
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="dbConnect.DBConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%=request.getContextPath()%>/style.css" rel="stylesheet" type="text/css" />
        <title>Order list</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <h2>Order list</h2>
        <form action="EditServlet" method="get">
        <table>
            <tr>
                <th>ID</th> 
                <th>Fish</th> 
                <th>Quantity</th> 
                <th>Drink</th> 
                <th>Quantity</th> 
                <th>Extra</th> 
                <th>Quantity</th> 
                <th>Status</th> 
            </tr>  
<%
    Connection c = null;
    Statement s = null;
    ResultSet rs = null;
            
    try{     
    
    DBConnect con = DBConnect.getInstance();
    c = con.connect();   
    
    s = c.createStatement();
    rs = s.executeQuery("SELECT * FROM orders"); 
    
    while (rs.next()) { 
%>            
            <tr>
                <td><%= rs.getString("id") %></td>
                <td><%= rs.getString("fish") %></td>
                <td><%= rs.getString("fishNum") %></td>
                <td><%= rs.getString("drink") %></td>
                <td><%= rs.getString("drinkNum") %></td>
                <td><%= rs.getString("extra") %></td>
                <td><%= rs.getString("extraNum") %></td>
                <td>
                    <input type="radio" name="radioButton" value="<%=rs.getString("id")%>"></input>
                    <%= rs.getString("status") %>                                       
                </td>
            </tr> 
<%
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { rs.close(); } catch (Exception e) {}
            try { s.close(); } catch (Exception e) {}
            try { c.close(); } catch (Exception e) {}
        }
%>
        </table>
        <select name="state">
            <option value="Checkout">Checkout</option>
            <option value="Paid">Paid</option>
            <option value="Failed">Paid Failed</option>
            <option value="FoodReady">Food Ready</option>
            <option value="Shipped">Shipped</option>
            <option value="Complete">Complete</option>
        </select>
        <button onclick="location.href='/EditServlet'">Update</button>
        </form>
    </body>
</html>

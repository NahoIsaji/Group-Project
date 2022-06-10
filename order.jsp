<%-- 
    Author     : N_isaji
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="loginPages.css">
    </head>
    <body>
         <%@include file="header.jsp" %>
        <div align="center">
        <h2>Fish and Chips Bites</h2>
        <h3>Hello! Make your order</h3>
        <br>
        <form action="InsertServlet" method="post">
            <p>Fish: 
                <select name="fish">
                    <option value="Tilapia">Tilapia</option>
                    <option value="Pink Salmon">Pink Salmon</option>
                    <option value="Bass">Bass</option>
                    <option value="Cod">Cod</option>
                </select>
                <select name="fishNum">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                </select>                
            </p>
            <p>Drinks:
                <select name="drink">
                    <option value="Beer">Beer</option>
                    <option value="Cider">Cider</option>
                    <option value="Nestea">Nestea</option>
                    <option value="Lemonade">Lemonade</option>
                </select> 
                <select name="drinkNum">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                </select>   
            </p>
            <p>Extras:
                <select name="extra">
                    <option value="KetchupSauce">Ketchup sauce</option>
                    <option value="SpiceSauce">Spicy sauce</option>
                    <option value="Mayonnaise">Mayonnaise</option>
                    <option value="Mustard">Mustard</option>
                </select>  
                <select name="extraNum">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                </select>                   
            </p>            
            <br><br>
            <input type="submit" value="Submit">
        </form>
        </div>
    </body>
</html>

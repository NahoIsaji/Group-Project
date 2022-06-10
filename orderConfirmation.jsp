<%-- 
    Author     : N_isaji
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order confirmation</title>
        <link rel="stylesheet" type="text/css" href="yourOrderConfirmation.css" >
    </head>
            <%
            //calculate price
            int fishPrice = 0;
            int drinkPrice = 0;
            int extraPrice = 0;
            int totalPrice;  
            
            String fish = request.getParameter("fish");
            int fishNumCul = Integer.parseInt(request.getParameter("fishNum"));
            String drink = request.getParameter("drink");
            int drinkNumCul = Integer.parseInt(request.getParameter("drinkNum"));
            String extra = request.getParameter("extra");
            int extraNumCul = Integer.parseInt(request.getParameter("extraNum"));
            
            if(fish.equals("Tilapia")){
                fishPrice = 15 * fishNumCul; 
            } else if(fish.equals("Pink Salmon")){
                fishPrice = 20 * fishNumCul;
            } else if(fish.equals("Bass")){
                fishPrice = 17 * fishNumCul;
            } else if(fish.equals("Cod")){
                fishPrice = 22 * fishNumCul;
            }                      
                       
            //drink            
            if(drink.equals("Beer")){
                drinkPrice = 8 * drinkNumCul;
            } else if(drink.equals("Cider")){
                drinkPrice = 3 * drinkNumCul;
            } else if(drink.equals("Nestea")){
                drinkPrice = 4 * drinkNumCul;
            } else if(drink.equals("Lemonade")){
                drinkPrice = 6 * drinkNumCul;
            }
            
            //extra
            extraPrice = 2 * extraNumCul;
      
            //total
            totalPrice = fishPrice + drinkPrice + extraPrice;

            %>
        <P></P>
    <body>
       <%@include file="header.jsp" %>
        <div align="center">
        <h1>Your order</h1><br>
        <table>
            <tr>
                <td>Fish: </td>
                <td><%= request.getParameter("fish") %></td>
                <td> x </td>
                <td><%= request.getParameter("fishNum") %></td>
                <td>$ </td>
                <td><%=fishPrice%></td>
            </tr>
            <tr>
                <td>Drink:</td>
                <td><%= request.getParameter("drink") %></td>
                <td> x </td>
                <td><%= request.getParameter("drinkNum") %></td>
                <td>$ </td>
                <td><%=drinkPrice%></td>                
            </tr>
            <tr>
                <td>Extra:</td>
                <td><%= request.getParameter("extra") %></td>
                <td> x </td>
                <td><%= request.getParameter("extraNum") %></td>
                <td>$ </td>
                <td><%=extraPrice%></td>                
            </tr>
            <tr>
                <td colspan="2">Total</td>
                <td colspan="4">$ <%=totalPrice%></td>
            </tr>
        </table>
    </div>        
    </body>
</html>

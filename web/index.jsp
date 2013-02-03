<%-- 
    Document   : index
    Created on : Feb 2, 2013, 5:05:13 PM
    Author     : Jenni Burgmeier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Restaurant Order</title>
    </head>
    <body>
        <p>Select items ordered below:</p>
        <form id="form" name="form" method="POST" action="FwdControl.do">
            Entree:<br>
            <input type="checkbox" name="steak" value="Steak">12 oz. Tenderloin Steak<br>
            <input type="checkbox" name="chicken" value="Chicken">Chicken Marsala<br>
            <input type="checkbox" name="lobster" value="Lobster">Lobster Tail<br>
            <input type="checkbox" name="shrimp" value="Shrimp">Shrimp Scampi<br><br>
            Side:<br>
            <input type="checkbox" name="salad" value="Salad">Caeser's Salad<br>
            <input type="checkbox" name="soup" value="Soup">Chicken Noodle Soup<br><br>
            Drink:<br>
            <input type="checkbox" name="soda" value="Soda">Pepsi<br>
            <input type="checkbox" name="beer" value="Beer">Corona<br>
            <input type="checkbox" name="water" value="Water">Water<br>
            <input id="submit" name="Submit" type="submit" value="submit">
        </form>
    </body>
</html>

<%-- 
    Document   : helloTime
    Created on : Jan 27, 2016, 9:23:05 AM
    Author     : Scott
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hello Demo</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Hello Demo</h1>
        <form method="POST" action="HelloController">
        <label>Enter Name</label>
        <input type="text" name="username" value=""/>
        <input type="submit" name="submit" value="Say Hello"/>
        </form>
        
    </body>
</html>

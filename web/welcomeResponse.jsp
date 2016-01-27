<%-- 
    Document   : helloResponse
    Created on : Jan 20, 2016, 7:04:20 PM
    Author     : Scott
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Response Page for Hello App.</title>
    </head>
    <body>
        <p>
            <%
                Object responseObj = request.getAttribute("myMsg");
                Object errObj = request.getAttribute("errorMsg");
                
                if(responseObj != null){
                    out.println(responseObj.toString());
                }
                if(errObj != null){
                    out.println(errObj.toString());
                }
                %>
        </p>
        <h5>Server Response</h5>
    </body>
</html>

<%-- 
    Document   : greeter
    Created on : Sep 1, 2015, 8:20:16 PM
    Author     : Ankita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${title}</title>
    </head>
    <body>
        <h1>The current date and time is: ${currentDate}</h1>
        <p>The user name is: ${name}</p>  
        <p>${greetingMsg}</p>  
        
        <p><a href="GreetingController">Click here to refresh page</a></p>
       
    </body>
</html>

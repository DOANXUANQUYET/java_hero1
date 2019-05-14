<%-- 
    Document   : newjsp
    Created on : Mar 14, 2019, 1:47:22 PM
    Author     : doanxuanquyet
--%>

<!--code client ben nay-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <a href="../XulyLogin"> link</a>
        <!--da thay doi duong dan trong web xml-->
        <form action="XulyLogin" method="post">
            Username: <input name="username" />
            Pass: <input name="pass" />
            <input type="submit" name="login" value="Login"/>
        </form>
    </body>
</html>

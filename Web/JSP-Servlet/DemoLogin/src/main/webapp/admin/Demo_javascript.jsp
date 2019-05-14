<%-- 
    Document   : Demo_javascript
    Created on : Mar 14, 2019, 3:23:41 PM
    Author     : doanxuanquyet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Demo javaScript</title>
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

<%-- 
    Document   : newjsp
    Created on : 2019/02/24, 13:30:45
    Author     : doanxuanquyet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            //trong day la code java thuan
            int a = 10;
            System.out.println("a = " + a);
            //tra ve du lieu cho client
            out.print("<br>a = " + a);
            //request la doi tuong tra ve ket qua tu client
            String soA = request.getParameter("soA");
            //check a bang null ,khi chay la dau ien k co du lieu
            if (soA != null) {
                out.print("<br>sever nhan duoc soA = " + soA);
            }
            //lay du lieu trong request ra phai ep kieu    
            Integer aint = (Integer) request.getAttribute("aServlet");
            out.print("<br>day la so a ben servlet = " + aint);
        %>
        <!--action la trang nhan ket qua, ghi duong dan,k ghi gi la mac dinh la get, du lieu hien len tren thanh ip
        <form action=".">-->
        <!--trong input dung thuoc tinh value %tenbien% hoc ${param.soA} [bieu thuc chinh tac (EL)-->
        <form action="DemoServlet">
            <!--gui qua trang demoServlet-->
            <input type="text" name="soA" value="${param.soA}" /><button type="submit"/>gui di</button>
    </form>
            <b>a di qua ben servlet va tro ve : a = ${requestScope.aServlet}</b>
            <br><h4 style="color: red">${requestScope.messError}</h4>
</body>
</html>

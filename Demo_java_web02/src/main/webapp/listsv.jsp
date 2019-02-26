<%-- 
    Document   : listsv.
    Created on : 2019/02/25, 15:54:49
    Author     : doanxuanquyet
--%>

<!--phai khai bao taglib de dung cau lenh JSTL-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            table, th, td {
                border: 1px solid red;
            }
        </style>
    </head>
    <body>
        <c:if test="${requestScope.listsv}==null">
            <!--cau lenh if, neu gia tri null thi chuyen trang-->
            <c:redirect url="/SinhVienServlet" />
        </c:if>
        <table>
            <tr>
                <th>ma</th>
                <th>ten</th>
                <th>ma lop</th>
            </tr>
            <!--cau lenh de chen vao lenh nhu java cho html,[JSTL la nhung the cua jsp giong html]-->
            <c:forEach items="${requestScope.listsv}" var="sv">
                <tr>
                <b>xuong dong</b>

                <td>${sv.ma}</td>
                <td>${sv.ten}</td>
                <td>${sv.malop}</td>
            </tr>
        </c:forEach>
    </table>
    <b>end ----------------------- end</b>
</body>
</html>

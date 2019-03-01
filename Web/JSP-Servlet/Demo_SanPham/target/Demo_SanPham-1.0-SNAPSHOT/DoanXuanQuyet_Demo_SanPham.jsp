<%-- 
    Document   : newjsp
    Created on : 2019/02/26, 13:10:34
    Author     : doanxuanquyet
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bai tap table : San Pham</title>
        <style type="text/css">
            table, th{
                border-bottom: 1px solid black;
                border-top: 1px solid black;
            }
            b{color: red}
        </style>
    </head>
    <body>
        <b style="color: black; background-color: #DEE1E6 ">bai tap java: connect Database<b>
                <c:if test="${requestScope.listsp == null}">
                    <!--cau lenh if, neu gia tri null thi chuyen trang-->
                    <c:redirect url="SanPhamServlet" />
                </c:if>
                <b>${requestScope.spdto.code}</b>
                <b>${requestScope.spdto.name}</b>
                <b>${requestScope.spdto.price}</b>
                <c:if test="${requestScope.spdto == null}">
                    <b>khong tim thay san pham</b>
                </c:if>
                <table>
                    <tr>
                        <th>ma san pham</th>
                        <th>ten</th>
                        <th>gia san pham</th>
                        <th>thay doi</th>
                    </tr>
                    <!--cau lenh de chen vao lenh nhu java cho html,[JSTL la nhung the cua jsp giong html]-->
                    <c:forEach items="${requestScope.listsp}" var="sp">
                        <c:if test="${sp.code%2==0}">
                            <tr style="background-color: #FFF7EC;">
                                <td>${sp.code}</td>
                                <td>${sp.name}</td>
                                <td>${sp.price}</td>
                                <td><a href="#">edit</a></td>
                            </tr>
                        </c:if>
                        <c:if test="${sp.code%2==1}">
                            <tr>
                                <td>${sp.code}</td>
                                <td>${sp.name}</td>
                                <td>${sp.price}</td>
                                <td><a href="#">edit</a></td>
                            </tr>
                        </c:if>

                    </c:forEach>

                    <c:if test="${requestScope.listsp2 == null}">
                        <b>khong tim thay list san pham</b>
                    </c:if>

                    <c:forEach items="${requestScope.listsp2}" var="sp">
                        <c:if test="${sp.code%2==0}">
                            <tr style="background-color: #FFF7EC;">
                                <td>${sp.code}</td>
                                <td>${sp.name}</td>
                                <td>${sp.price}</td>
                                <td><a href="#">edit</a></td>
                            </tr>
                        </c:if>
                        <c:if test="${sp.code%2==1}">
                            <tr>
                                <td>${sp.code}</td>
                                <td>${sp.name}</td>
                                <td>${sp.price}</td>
                                <td><a href="#">edit</a></td>
                            </tr>
                        </c:if>

                    </c:forEach>
                </table>
                </body>
                </html>

<%-- 
    Document   : demo_session
    Created on : 2019/02/27, 7:26:47
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
            //session la mot object nen co the luu nhieu dang du lieu bao gom ca list
            //dung session tao co che gio hang luu thong tin san pham
            //nhung vi vung nho co han nen se k luu toan bo thong tin san pham ma chi luu ID san pham
            //sau do dung ID san pham truy xuat thong tin san pham tren DB

            //moi khi client truy cap vao web se duoc cap session ID de phan biet voi client khac
            //cookies tren trinh duyet co the xem sessionID
            //tao session
            Integer n = (Integer) session.getAttribute("count");
            if (n == null) {
                n = 0;
            }
            n++;
            //gan lai gia tri session da tao khi refresh
            session.setAttribute("count", n);
            
            //khong ai xoa session ma co the remove attribute
            //session.removeAttribute(name);

            //cookies la vung nho cua client
            //tao cookies
            //cookie chi luu dang text
            Cookie demoCookie = new Cookie("demoCookie", "cookies 1");
            //set thoi gian ton tai (24h*60m*60s), het thoi gian tu dong delete
            demoCookie.setMaxAge(24 * 60 * 60);
            //dua cookies ve client
            response.addCookie(demoCookie);

//viet trong servlet lay coolies qua request;
//request.getCookies(); tra va 1 mang cookies

    //vung nho to nhat trong he thong la context, giong voi bien static
    //trong servlet goi context, trong jsp la bien application
    application.setAttribute("demoContext", "day la bien to nhat");
    //lay context trong servlet
   // request.getServletContext().setAttribute(name, object);
   
//context la bien to nhat trong web, DB la to nhat trong toan bo, vi sever chua nhieu web


    //fillter la bo loc nam giua cac trang
    //khi request,response truyen qua cac trang phai di qua fillter, fillter se cung cap path(duong dan)
    //fillter dieu huong dong du lieu giua cac trang
    

    //Ung dung cua fillter la de phan quyen, vi du admin se truy cap duoc..v..v
    //fillter con co the bien doi request
    //co the sap xep thu tu fillter trong xml, mapping truoc thi chay truoc
        %>
        <!--in ra session qua attribute-->
        Counter : ${sessionScope.count} <br>
        Cookies: ${cookie.demoCookie.value}<br>
        context: ${applicationScope.demoContext}<br>
        Name : ${param.name}
    </body>
</html>

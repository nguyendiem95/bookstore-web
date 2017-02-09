<%-- 
    Document   : giosach
    Created on : 05 Nov 2016, 11:34:05 PM
    Author     : ThaiTai
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>BookStore</title>
        <link href="css/tooplate_style.css" rel="stylesheet" type="text/css" />

        <link rel="stylesheet" href="css/nivo-slider.css" type="text/css" media="screen" />
    </head>
    <body>
        <div id="tooplate_body_wrapper">
            <div id="tooplate_wrapper">
                <div id="tooplate_top_bar">
                    <a href="index.html" class="social_btn dangxuat">&nbsp;</a>
                    <a> <h3>${name}</h3></a>
                </div>	

                <div id="tooplate_header">
                    <div id="site_title"><h1><a href="#">Library</a></h1></div>
                    <div id="tooplate_menu">
                        <ul>
                            <li><a href="Control?action=trangchu&name=${name}" class="current">Trang Chủ</a></li>
                            <li><a href="">Danh Mục</a></li>
                            <li><a href="Control?action=create&name=${name}">Giỏ Sách</a></li>
                            <li><a href="">Liên Hệ</a></li>
                        </ul>   	
                    </div> <!-- end of tooplate_menu -->
                </div> <!-- end of forever header -->
            </div></div>
        <div id="tooplate_main1">
            <center>


                <br><br>
                <h3> Chi tiết sách </h3>
                <table border="2px" style="animation: normal" cellpadding="10px">
                    <tr>
                        <td><p>ID</p></td>
                        <td><p>NAME</p></td>
                        <td><p>AUTHOR</p></td>
                        <td><p>PRICE</p></td>
                    </tr>
                    <c:forEach var="book" items="${books}">
                        <tr>
                            <td>${book.getId()}</td>
                            <td>${book.getName()}</td>
                            <td>${book.getAuthor()}</td>
                            <td>${book.getPrice()}</td>
                        </tr>
                    </c:forEach>
                    <tr>
                    <p>
                        <button onclick="goBack()">Go Back</button>
                    </p>
                    </tr>
                </table>
                <script>
                    function goBack() {
                        window.history.back();
                    }
                </script>
                </body>
                </html>

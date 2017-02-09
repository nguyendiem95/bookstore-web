<%-- 
    Document   : TK
    Created on : Nov 6, 2016, 10:11:26 AM
    Author     : MyPC
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Library</title>
        <meta name="keywords" content="" />
        <meta name="description" content="" />

        <link href="css/tooplate_style.css" rel="stylesheet" type="text/css" />

        <link rel="stylesheet" href="css/nivo-slider.css" type="text/css" media="screen" />
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/jquery.nivo.slider.js" type="text/javascript"></script>

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

                <div id="tooplate_main1">
                    <center>
                        <form action="Control?action=search" method="post">
                            <div style="color: #ff0000">${mesage}</div>
                            <table>
                                <tr>
                                    <td>BookName </td>
                                    <td><input type="text" name="bookname" size="25"></td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td><input type="submit" name="Search" value="SEARCH"></td>
                                </tr>
                            </table>
                            <table border="1" width="500">
                                <tr>
                                    <td><p>ID</p></td>
                                    <td><p>NAME</p></td>
                                    <td><p>PRICE</p></td>
                                </tr>

                                <c:forEach var="book" items="${books}">
                                    <tr>
                                        <td>${book.getId()}</td>
                                        <td>${book.getName()}</td>
                                        <td>${book.getPrice ()}</td>
                                        <td>
                                            <p>
                                                <a href="Control?action=addcart&id=${book.getId()}&name=${name}">
                                                    Add To Card</a>
                                            </p>
                                        </td>
                                        <td>
                                            <a href="Control?action=display&id=${book.getId()}&name=${name}">
                                                View Details
                                            </a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </table>
                        </form>
                    </center>
                </div>    
            </div>	
        </div>  
        </div>
    </body>
</html>

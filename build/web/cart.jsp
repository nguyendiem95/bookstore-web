<%-- 
    Document   : cart
    Created on : Nov 6, 2016, 10:11:00 AM
    Author     : MyPC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                    <a> <input style="text" value="${name}" name="name"></a>
                </div>	

                <div id="tooplate_header">
                    <div id="site_title"><h1><a href="#">Library</a></h1></div>
                    <div id="tooplate_menu">
                        <ul>
                            <li><a href="Control?action=trangchu&name=${name}" class="current">Trang Chủ</a></li>
                            <li><a href="">Danh Mục</a></li>
                            <li><a href="">Giỏ Sách</a></li>
                            <li><a href="">Liên Hệ</a></li>
                        </ul>   	
                    </div> <!-- end of tooplate_menu -->
                </div> <!-- end of forever header -->
                <div id="tooplate_main1">
                    <center>
                        <br><br>
                                <h3> Danh sách các cuốn sách đã mượn </h3>
                                <table border="2px" style="animation: normal" cellpadding="10px">
                                    <tr style="background-color:#ffccff">
                                        <th style="width:50%">Id</th>
                                        <th style="width:10%">Name</th>
                                        <th style="width:50%">Quantity</th>
                                        <th style="width:50%">Price</th>
                                        <th style="width:50%">Total</th>
                                        <th style="width:100%"></th>
                                    </tr>
                                    <c:forEach var="item" items="${carts}">
                                        <tr>
                                            <form action="Control?action=update&id=${item.getBook().getId()}&name=${name}" method="post">

                                                <td>${item.getBook().getId()}</td>
                                                <td>${item.getBook().getName()}</td>
                                                <td><input type="text" name="Quantity" value="${item.getQuantity()}"></td>
                                                <td>${item.getBook().getPrice()}</td>
                                                <td>${item.getBook().getPrice()*item.getQuantity()} </td>
                                                <td><button> Edit</button>
                                                </td>
                                            </form>
                                            <td>
                                                <a href="Control?action=remove&id=${item.getBook().getId()}&Quantity=${item.getQuantity()}&name=${name}">
                                                    Delete</i>
                                                </a>
                                            </td>
                                        </tr>
                                    </c:forEach>  
                                </table>

                                </center>
                                <a href="Control?action=continue">Continue</a>
                                </div>
                                </div>
                                </div>
                                </body>
                                </html>
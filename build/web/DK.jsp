<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta charset="utf-8">
        <title>BookStore</title>

        <link href="css/tooplate_style.css" rel="stylesheet" type="text/css" />

        <link rel="stylesheet" href="css/nivo-slider.css" type="text/css" media="screen" />
    </head>
    <div id="tooplate_body_wrapper">
        <div id="tooplate_wrapper">
            <div id="tooplate_header">
                <div id="site_title"><h1><a href="">Library</a></h1></div>
                <div id="tooplate_menu">
                    <ul>
                        <li><a href="index.html" class="current">Trang chủ</a></li>
                        <li><a href="">Danh mục</a></li>
                        <li><a href="">Giỏ sách</a></li>
                        <li><a href="">Liên hệ</a></li>
                    </ul>       
                </div> <!-- end of tooplate_menu -->
            </div> <!-- end of forever header -->

            <div class="login-card">
                <center>
                    <form action="Control?action=register" method="post">
                        <tr>
                            <td><input type="text" name="firstname" placeholder="Firstname"></td>
                            <td>
                                <font color="red">${error_first}</font>
                            </td>
                        </tr>
                        <tr>
                            <td><input type="text" name="lastname" placeholder="Lastname"></td>
                            <td>
                                <font color="red">${error_last}</font>
                            </td>
                        </tr>
                        <tr>
                            <td><input type="text" name="username" placeholder="Username"></td>
                            <td>
                                <font color="red">${error_usernames}</font>
                            </td>
                        </tr>
                        <tr>
                            <td><input type="password" name="password" placeholder="Password"></td>
                            <td>
                                <font color="red">${error_passwords}</font>
                            </td>
                        </tr>
                        <tr>
                            <td><input type="text" name="email" placeholder="Email"></td>
                            <td>
                                <font color="red">${error_email}</font>
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td><input type="submit" name="register" value="REGISTER" class="register-submit"></td>
                        </tr>
                    </form>   
                </center>
            </div> <!-- end of middle -->
        </div>   
    </div>  
</body>
</html>
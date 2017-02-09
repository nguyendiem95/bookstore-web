<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Library</title>
        <meta name="keywords" content="" />
        <meta name="description" content="" />

        <link href="css/tooplate_style.css" rel="stylesheet" type="text/css" />

        <link rel="stylesheet" href="css/nivo-slider.css" type="text/css" media="screen" />


    </head>
    <body>
        <div id="tooplate_body_wrapper">
            <div id="tooplate_wrapper">
                <div id="tooplate_top_bar">

                </div>  

                <div id="tooplate_header">
                    <div id="site_title"><h1><a href="">Library</a></h1></div>
                    <div id="tooplate_menu">
                        <ul>
                            <li><a href="index.html" class="current">Trang Chủ</a></li>
                            <li><a href="">Danh Mục</a></li>
                            <li><a href="">Giỏ Sách</a></li>
                            <li><a href="">Liên Hệ</a></li>
                        </ul>       
                    </div> <!-- end of tooplate_menu -->
                </div> <!-- end of forever header -->

                <div class="login-card">
                    <h1>LOGIN</h1>
                    <form action="Control?action=login" method="post">
                        <tr>
                            <td><input type="text" name="name" placeholder="Username"></td>
                            <td>
                                <font color="red">${error_username}</font>
                            </td>
                        </tr>
                        <tr>
                            <td><input type="password" name="password" placeholder="Passname"></td>
                            <td>
                                <font color="red">${error_password}</font>
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td><input type="submit" value="LOGIN" class="login-submit"></td>
                        </tr>
                    </form>
                </div>
            </div>   
        </div>  
    </body>
</html>
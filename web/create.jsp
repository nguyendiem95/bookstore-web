<%-- 
    Document   : create
    Created on : Nov 6, 2016, 10:10:34 AM
    Author     : MyPC
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>BookStore</title>

        <link href="css/tooplate_style.css" rel="stylesheet" type="text/css" />

        <link rel="stylesheet" href="css/nivo-slider.css" type="text/css" media="screen" />
    </head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <body>
        <div id="tooplate_body_wrapper">
            <div id="tooplate_wrapper">
                <div id="tooplate_top_bar">
                    <a href="/index.html" class="social_btn dangxuat">&nbsp;</a>
                    <a> <input style="text" value="${name}" name="name"></a>
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

                <div id="tooplate_middle">
                    <a href="#"><img src="images/tooplate_lp_01.jpg" /></a>
                </div> <!-- end of middle -->

                <div id="tooplate_main">

                    <div class="col_allw300">
                        <h2>Welcome to NTP Library</h2>
                        <ul class="tooplate_list">
                            BookStore đã, đang và sẽ phấn đấu không ngừng để trở thành nơi lưu truyền tri thức và khơi nguồn cảm hứng thực sự tin cậy, thân thiện của bạn đọc trong và ngoài nước, có uy tín và vị thế xứng đáng trong cộng đồng thư viện Việt Nam.

                        </ul>
                        <a class="more" href="#">More</a>
                    </div>

                    <div class="col_allw300">
                        <h2><center>Service</center> </h2>
                        <ul class="tooplate_list">
                            BookStore với các phòng đọc sách hiện đại, tiên tiến, số lượng đầu sách phong phú, đa dạng. Bên cạnh đó còn có các dịch vụ đặt mượn sách online, giúp bạn lựa chọn trước cuốn sách mình mong muốn.

                        </ul>
                        <a class="more" href="#">More</a>
                    </div>

                    <div class="col_allw300 col_last">
                        <h2>BookStore</h2>
                        <div class="fp_lp_box">

                            <img src="images/tooplate_lp_02.jpg" alt="Image 01" />
                        </div>

                    </div>
                </div>  
            </div>   
        </div>
    </body>
</html>
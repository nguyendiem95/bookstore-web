/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DBUtil.DB;
import DBUtil.DBInterface;
import Model.Book;
import Model.Cart;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MyPC
 */
public class Control extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Control</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Control at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        request.setAttribute("action", action);
        switch (action) {
            case "create":
                HttpSession session = request.getSession();
                DBInterface db = new DB();
                String name = request.getParameter("name");
                ArrayList<Cart> carts = db.selectCart(name);
                session.setAttribute("carts", carts);
                session.setAttribute("name", name);
                String url = "/cart.jsp";
                RequestDispatcher dispatcher = request.getRequestDispatcher(url);
                dispatcher.forward(request, response);
                break;
            case "addcart":
                String id = request.getParameter("id");
                Book book = new Book();
                db = new DB();
                name = request.getParameter("name");
//                ArrayList<Book> books = new ArrayList<>();
                if(db.checkCart(id,name)){
                    String mesage ="Sản phẩn có trong giỏ hàng, bạn có thể cập nhập số lượng";
                    request.setAttribute("mesage", mesage);
                    url = "/TK.jsp";
                }else {
                Book b = db.getBook(id);
                User u = new User(name, "", "", "", "");
                Cart c = new Cart("1", b, u);
                db.addCart(c);
                response.sendRedirect("Control?action=create&name="+name);
                break;
                }
                dispatcher = request.getRequestDispatcher(url);
                dispatcher.forward(request, response);
                break;
            case "display":
                id = request.getParameter("id");
                 name =request.getParameter("name");
                book = new Book();
                db = new DB();
                book = db.getBook(id);
                ArrayList<Book> books = new ArrayList<>();
                books.add(book);
                request.setAttribute("name", name);
                request.setAttribute("books", books);
                url = "/display.jsp";
                dispatcher = request.getRequestDispatcher(url);
                dispatcher.forward(request, response);
                break;
            case "continue":
                session = request.getSession();
                name = request.getParameter("name");
                carts = (ArrayList<Cart>)session.getAttribute("carts");
                session.setAttribute("carts", carts);
                request.setAttribute("name", name);
                url = "/TK.jsp";
                dispatcher = request.getRequestDispatcher(url);
                dispatcher.forward(request, response);
                break;
            case "remove":
                db = new DB();
                String Quantity = request.getParameter("Quantity");
                name =request.getParameter("name");
                id = request.getParameter("id");
                 Book b = db.getBook(id);
                 User u = new User(name, "", "", "", "");
                Cart c = new Cart(Quantity, b, u);
                db.deleteCart(c);
                response.sendRedirect("Control?action=create&name="+name);
                break;
            case "trangchu":
                name = request.getParameter("name");
                request.setAttribute("name", name);
                url = "/create.jsp";
                dispatcher = request.getRequestDispatcher(url);
                dispatcher.forward(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "login":
                String name = request.getParameter("name");
                String password = request.getParameter("password");

                String error_username = "";
                String error_password = "";

                if (name.length() == 0) {
                    error_username = "Fill out username";
                }
                if (password.length() == 0) {
                    error_password = "Fill out password";
                }
                if (!name.equals("") && !password.equals("")) {
                    User user = new User();
                    user.setUsername(name);
                    user.setPassword(password);
                    DBInterface db = new DB();
                    if (db.checkUser(user)) {
                        String url = "/create.jsp";
                        request.setAttribute("name", name);
                        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
                        dispatcher.forward(request, response);
                    }
                }
                request.setAttribute("error_username", error_username);
                request.setAttribute("error_password", error_password);
                
                String url = "/DN.jsp";
                RequestDispatcher dispatcher = request.getRequestDispatcher(url);
                dispatcher.forward(request, response);
                break;
            case "register":
                String firstname = request.getParameter("firstname");
                String lastname = request.getParameter("lastname");
                String usernames = request.getParameter("username");
                String passwords = request.getParameter("password");
                String email = request.getParameter("email");

                String error_first = "";
                String error_last = "";
                String error_email = "";
                String error_usernames = "";
                String error_passwords = "";

                if (firstname.length() == 0) {
                    error_first = "Fill out your first name";
                }
                if (lastname.length() == 0) {
                    error_last = "Fill out your last name";
                }
                if (usernames.length() == 0) {
                    error_usernames = "Fill out your username";
                }
                if (passwords.length() == 0) {
                    error_passwords = "Fill out your password";
                }
                if (email.length() == 0) {
                    error_email = "Fill out your email";
                }
                if (usernames.length() != 0 || passwords.length() != 0 || firstname.length() != 0 || lastname.length() != 0 || email.length() != 0) {
                    User user = new User(usernames, passwords, firstname, lastname, email);
                    DB db = new DB();
                    if (db.isExist(user)) {
                        error_usernames = "This username is exist ! Try again ";
                    } else {
                        db.addAccount(user);
                        url = "/DN.jsp";
                        dispatcher = request.getRequestDispatcher(url);
                        dispatcher.forward(request, response);
                    }
                }
                request.setAttribute("error_usernames", error_usernames);
                request.setAttribute("error_passwords", error_passwords);
                request.setAttribute("error_first", error_first);
                request.setAttribute("error_last", error_last);
                request.setAttribute("error_email", error_email);

                url = "/DK.jsp";
                dispatcher = request.getRequestDispatcher(url);
                dispatcher.forward(request, response);
                break;
            case "search":
                HttpSession session = request.getSession();
                String bookname = request.getParameter("bookname");
                DB db = new DB();
                ArrayList<Book> books = db.searchBook(bookname);
                session.setAttribute("books", books);
                url = "/TK.jsp";
                dispatcher = request.getRequestDispatcher(url);
                dispatcher.forward(request, response);
                break;
            case "update" :
                db = new DB();
                String Quantity = request.getParameter("Quantity");
                name =request.getParameter("name");
                String id = request.getParameter("id");
                Book b = db.getBook(id);
                User u = new User(name, "", "", "", "");
                Cart c = new Cart(Quantity, b, u);
                db.updateCart(c);
                response.sendRedirect("Control?action=create&name="+name);
                break;
        }
            
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

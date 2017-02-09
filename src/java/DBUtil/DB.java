/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBUtil;

import Model.Book;
import Model.Cart;
import Model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class DB implements DBInterface{

    private Connection con;

    public void getConnection() {
        String urlclass = "jdbc:mysql://localhost:3306/pttk";
        String user = "root";
        String pass = "root";
        try {
            this.con = DriverManager.getConnection(urlclass, user, pass);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public boolean isExist(User user) {
        getConnection();
        String sql = "SELECT * FROM User"
                + " WHERE username=" + "'" + user.getUsername() + "'";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean checkUser(User user) {
        getConnection();
        String sql = "SELECT * FROM User"
                + " WHERE username=" + "'" + user.getUsername() + "'" + "AND password =" + "'" + user.getPassword() + "'";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<Book> searchBook(String str) {
        getConnection();
        String sql = "SELECT * FROM Book"
                + " WHERE name LIKE " + "'%" + str + "%'";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            ArrayList<Book> books = new ArrayList<>();
            Book book;

            while (rs.next()) {
                book = new Book();
                book.setId(rs.getString("id"));
                book.setName(rs.getString("name"));
                book.setAuthor(rs.getString("author"));
                book.setPrice(rs.getString("price"));
                books.add(book);
            }
            return books;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Book getBook(String id) {
        getConnection();
        String sql = "SELECT * FROM Book"
                + " WHERE id = " + "'" + id + "'";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            Book b = null;

            while (rs.next()) {
                b = new Book();
                b.setId(rs.getString("id"));
                b.setName(rs.getString("name"));
                b.setAuthor(rs.getString("author"));
                b.setPrice(rs.getString("price"));
            }
            return b;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void addAccount(User user) {
        getConnection();
        String sql = "INSERT INTO User VALUES(?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getFirstname());
            ps.setString(2, user.getLastname());
            ps.setString(3, user.getUsername());
            ps.setString(4, user.getPassword());
            ps.setString(5, user.getEmail());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList selectCart (String username){
        getConnection();
        PreparedStatement ps ;
        ResultSet rs ;
        ArrayList<Cart> products = new ArrayList<>();
        String sql = "SELECT * FROM cart"
                + " WHERE username = '"+username +"'";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            Cart product;
            while (rs.next()) {
                product = new Cart();
                Book b = new Book();
                b.setId(rs.getString("id"));
                b.setName(rs.getString("name"));
                b.setPrice(rs.getString("price"));
                b.setAuthor(rs.getString("author"));
                product.setQuantity(rs.getString("quantity"));
                product.setBook(b);
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }
    
    public void addCart(Cart cart) {
        getConnection();
        String sql = "INSERT INTO cart(id,name,price,author,quantity,username) VALUES(?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cart.getBook().getId());
            ps.setString(2, cart.getBook().getName());
            ps.setString(3, cart.getBook().getPrice());
            ps.setString(4, cart.getBook().getAuthor());
            ps.setString(5, cart.getQuantity());
            ps.setString(6, cart.getUser().getUsername());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean checkCart(String id, String name) {
        getConnection();
        String sql = "SELECT * FROM Cart"
                + " WHERE id=" + "'" + id + "'" +"AND username=" +"'"+name+"'";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public int deleteCart(Cart c){
        getConnection();
        String query= "DELETE FROM Cart "+"WHERE id=? AND username=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, c.getBook().getId());
            ps.setString(2, c.getUser().getUsername());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int updateCart(Cart c){
        getConnection();
        String query= "UPDATE Cart SET quantity=? "+"WHERE id=? AND username=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, c.getQuantity());
            ps.setString(2, c.getBook().getId());
            ps.setString(3, c.getUser().getUsername());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBUtil;

import Model.Book;
import Model.Cart;
import Model.User;
import java.util.ArrayList;

/**
 *
 * @author MyPC
 */
public interface DBInterface {
    public void getConnection();
    public boolean isExist(User user);
    public boolean checkUser(User user);
    public ArrayList<Book> searchBook(String str);
    public Book getBook(String id);
    public void addAccount(User user);
    public ArrayList selectCart (String username);
    public void addCart(Cart cart);
    public boolean checkCart(String id, String name);
    public int deleteCart(Cart c);
    public int updateCart(Cart c);
}

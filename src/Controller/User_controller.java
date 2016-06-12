/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Controller.HibernateUtil;
import Model.User;
import Model.Medium;
import java.math.BigDecimal;
import Controller.JSONclass;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
import java.util.logging.Level;
import java.util.logging.Logger;
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class User_controller {
   private static SessionFactory factory;
   private static JSONclass json = new JSONclass();
   
   public Integer addUser(String nameUser, String password, String email){
      Session session = HibernateUtil.getSessionFactory().openSession();
      Transaction tx = null;
      Integer userID = null;
      try{
         tx = session.beginTransaction();
         User user = new User(nameUser, password, email);
         userID = (Integer) session.save(user); 
         tx.commit();
//          try {
//              json.AddItemJSON();
//          } catch (IOException ex) {
//              Logger.getLogger(Item_controller.class.getName()).log(Level.SEVERE, null, ex);
//          }
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return userID;
   }
   
   public int addNumbers(int numberOne, int numberTwo)
   {
       int result = 0;
       result = numberOne + numberTwo;
       return result;
   }
   
   public double subtractNumbers(double numberOne, double numberTwo)
   {
       double result = 0;
       result = numberOne - numberTwo;
       return result;
   }
  
   public List listUsers( ){
      Session session = HibernateUtil.getSessionFactory().openSession();
      Transaction tx = null;
      List<User> users = new ArrayList<User>();
      try{
         tx = session.beginTransaction();
         users = session.createQuery("FROM User").list(); 
         for (Iterator iterator = 
                    users.iterator(); iterator.hasNext();){
            User user = (User) iterator.next(); 
            System.out.println("Username: " + user.getNameUser()); 
            System.out.println("Email: " + user.getEmail());  
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return users;
   }
   
//   public List<Item> getItems()
//    {
//        Item item = new Item();
//        List<Item> list = item.items();
//        return list;
//    }
   
   public boolean updateUser(Integer userId, String nameUser, String password, String email){
      Session session = HibernateUtil.getSessionFactory().openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         User user = 
                    (User)session.get(User.class, userId); 
         user.setNameUser(nameUser);
         user.setEmail(email);
         user.setPassword(password);
		 session.update(user); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return true;
   }
   
   public boolean deleteItem(Integer userId){
      Session session = HibernateUtil.getSessionFactory().openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         User user = 
                   (User)session.get(User.class, userId); 
         session.delete(user); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return true;
   }
}

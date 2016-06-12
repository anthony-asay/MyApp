/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Controller.HibernateUtil;
import Model.MediaLog;
import Model.Medium;
import java.math.BigDecimal;
import Controller.JSONclass;
import Model.User;
import java.io.IOException;
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

public class MediaLog_controller {
   private static SessionFactory factory;
   private static JSONclass json = new JSONclass();
   
   public Boolean addLog(User user, Medium medium, String item, Double rating, Double timeSpent, Date dateFinished){
      Session session = HibernateUtil.getSessionFactory().openSession();
      Transaction tx = null;
      Integer logID = null;
      try{
         tx = session.beginTransaction();
         MediaLog mediaLog = new MediaLog(user, medium, item, rating, timeSpent, dateFinished);
         logID = (Integer) session.save(mediaLog); 
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
      return true;
   }
   
   public void listLog( ){
      Session session = HibernateUtil.getSessionFactory().openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         List logs = session.createQuery("FROM MediaLog").list(); 
         for (Iterator iterator = 
                    logs.iterator(); iterator.hasNext();){
            MediaLog mediaLog = (MediaLog) iterator.next(); 
            System.out.println("Medium: " + mediaLog.getMedium().getTypeMedium());
            System.out.println("Title: " + mediaLog.getItem()); 
            System.out.println("Rating: " + mediaLog.getRating());
            System.out.println("Time: " + mediaLog.getTimeSpent());
            System.out.println("Date Finished: " + mediaLog.getDateFinished()); 
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
   
//   public List<Item> getItems()
//    {
//        Item item = new Item();
//        List<Item> list = item.items();
//        return list;
//    }
   
   public Boolean updateLog(int logId, User user, Medium medium, String item, Double rating, Double timeSpent, Date dateFinished){
      Session session = HibernateUtil.getSessionFactory().openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         MediaLog mediaLog = 
                    (MediaLog)session.get(MediaLog.class, logId); 
         mediaLog.setUser(user);
         mediaLog.setMedium(medium);
         mediaLog.setItem(item);
         mediaLog.setRating(rating);
         mediaLog.setTimeSpent(timeSpent);
         mediaLog.setDateFinished(dateFinished);
		 session.update(mediaLog); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return true;
   }
   
   public Boolean deleteLog(Integer logId){
      Session session = HibernateUtil.getSessionFactory().openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         MediaLog mediaLog = 
                   (MediaLog)session.get(MediaLog.class, logId); 
         session.delete(mediaLog); 
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

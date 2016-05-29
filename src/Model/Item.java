package Model;
// Generated May 27, 2016 5:26:42 PM by Hibernate Tools 4.3.1


import Controller.HibernateUtil;
import java.math.BigDecimal;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Item generated by hbm2java
 */
public class Item  implements java.io.Serializable {


     private Integer id;
     private Medium medium;
     private Integer author;
     private Date dateReleased;
     private String title;
     private Double rating;
     private String synopsis;

    public Item() {
    }
    
    public Session acquireSession() {
        // All DB opening, connection etc. removed,
        // since the problem is in compilation, not at runtime.
        return null;
    }

    @SuppressWarnings("unchecked") /* <----- */

    public List<Item> items() {
        String query = "from Item";
        List<Item> list = executeHQLQuery(query);
        return list;
    }
    
    public List<Item> itemsByMedium(Medium medium) {
        String query = "from Item where id_medium="+medium.getId();
        List<Item> list = executeHQLQuery(query);
        return list;
    }
     
    private List executeHQLQuery(String hql) 
    {
        try 
        {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List resultList = q.list();
            session.getTransaction().commit();
            return resultList;
        } 
        catch (HibernateException he) 
        {
            he.printStackTrace();
        }
        return null;
    }
    
    public Item(Medium medium, Date dateReleased, String title, Double rating, String synopsis) {
        this.medium = medium;
        this.dateReleased = dateReleased;
        this.title = title;
        this.rating = rating;
        this.synopsis = synopsis;
    }
	
    public Item(Medium medium, Date dateReleased, String title, Double rating) {
        this.medium = medium;
        this.dateReleased = dateReleased;
        this.title = title;
        this.rating = rating;
    }
    public Item(Medium medium, Integer author, Date dateReleased, String title, Double rating, String synopsis) {
       this.medium = medium;
       this.author = author;
       this.dateReleased = dateReleased;
       this.title = title;
       this.rating = rating;
       this.synopsis = synopsis;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Medium getMedium() {
        return this.medium;
    }
    
    public void setMedium(Medium medium) {
        this.medium = medium;
    }
    public Integer getAuthor() {
        return this.author;
    }
    
    public void setAuthor(Integer author) {
        this.author = author;
    }
    public Date getDateReleased() {
        return this.dateReleased;
    }
    
    public void setDateReleased(Date dateReleased) {
        this.dateReleased = dateReleased;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public Double getRating() {
        return this.rating;
    }
    
    public void setRating(Double rating) {
        this.rating = rating;
    }
    public String getSynopsis() {
        return this.synopsis;
    }
    
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }




}


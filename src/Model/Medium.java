package Model;
// Generated May 27, 2016 5:26:42 PM by Hibernate Tools 4.3.1


import Controller.HibernateUtil;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Medium generated by hbm2java
 */
public class Medium  implements java.io.Serializable {


     private Integer id;
     private String typeMedium;
     private Set items = new HashSet(0);

    public Medium() {
    }
    
     public Session acquireSession() {
        // All DB opening, connection etc. removed,
        // since the problem is in compilation, not at runtime.
        return null;
    }

    @SuppressWarnings("unchecked") /* <----- */

    public List<Medium> mediums() {
        String query = "select medium.typeMedium from Medium medium";
        List<Medium> list = executeHQLQuery(query);
        return  list;
    }
    
    public Medium mediumByName(String mediumName)
    {
        String query = "from Medium medium where medium.typeMedium = '" + mediumName + "'";
        List<Medium> list = executeHQLQuery(query);
        Medium medium = list.get(0);
        return  medium;
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

    public Medium(String typeMedium, Set items) {
       this.typeMedium = typeMedium;
       this.items = items;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTypeMedium() {
        return this.typeMedium;
    }
    
    public void setTypeMedium(String typeMedium) {
        this.typeMedium = typeMedium;
    }
    public Set getItems() {
        return this.items;
    }
    
    public void setItems(Set items) {
        this.items = items;
    }




}



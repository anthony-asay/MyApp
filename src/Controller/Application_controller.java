/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import View.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Anthony
 */
public class Application_controller {
    
    private User user = new User();
    public void getMainFrame()
    {
        new Home().setVisible(true);
    }
    
    public void getAddItemView(JFrame view)
    {
        view.dispose();
        new AddItemView().setVisible(true);
    }
    
    public void getItemsView(JFrame view)
    {
        view.dispose();
        new ItemsView().setVisible(true);
    }
    
    public void getMediaLogView(User user, JFrame view)
    {
        this.user = user;
        view.dispose();
        new ItemsView().setVisible(true);
    }
    
    public User getUser() {
        return this.user;
    }
    
    public void getRegisterView(JFrame view)
    {
        view.dispose();
        new RegisterView().setVisible(true);
    }
      
//    public void getAddItemView()
//    {
//        new AddItemView().setVisible(true);
//    }
    
}

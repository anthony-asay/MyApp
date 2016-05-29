/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Medium;
import java.util.List;

/**
 *
 * @author Anthony
 */
public class Medium_controller {
    
    public List<Medium> getMediums()
    {
        Medium medium = new Medium();
        List<Medium> list = medium.mediums();
        return list;
    }
    
    public Medium getMediumByName(String name)
    {
        Medium medium = new Medium();
        medium = medium.mediumByName(name);
        return medium;
    }
}

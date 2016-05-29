/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Item;
import Model.Medium;
import java.util.Date;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author Anthony
 */
public class Item_controllerTest extends TestCase {
    
    public Item_controllerTest(String testName) {
        super(testName);
    }

    /**
     * Test of addItem method, of class Item_controller.
     */
    public void testAddItem() {
        System.out.println("addItem");
        Medium medium = null;
        Date dateReleased = null;
        String title = "";
        Double rating = null;
        String synopsis = "";
        Item_controller instance = new Item_controller();
        Integer expResult = null;
        Integer result = instance.addItem(medium, dateReleased, title, rating, synopsis);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of listItems method, of class Item_controller.
     */
    public void testListItems() {
        System.out.println("listItems");
        Item_controller instance = new Item_controller();
        instance.listItems();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class Item_controller.
     */
    public void testGetItems() {
        System.out.println("getItems");
        Item_controller instance = new Item_controller();
        List<Item> expResult = null;
        List<Item> result = instance.getItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateItem method, of class Item_controller.
     */
    public void testUpdateItem() {
        System.out.println("updateItem");
        Integer itemId = null;
        Medium medium = null;
        Date dateReleased = null;
        String title = "";
        Double rating = null;
        String synopsis = "";
        Item_controller instance = new Item_controller();
        instance.updateItem(itemId, medium, dateReleased, title, rating, synopsis);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteItem method, of class Item_controller.
     */
    public void testDeleteItem() {
        System.out.println("deleteItem");
        Integer itemId = null;
        Item_controller instance = new Item_controller();
        instance.deleteItem(itemId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author Anthony
 */
public class User_controllerTest extends TestCase {
    
    public User_controllerTest(String testName) {
        super(testName);
    }

    /**
     * Test of addUser method, of class User_controller.
     */
    public void testAddUser() {
        System.out.println("addUser");
        String nameUser = "";
        String password = "";
        String email = "";
        User_controller instance = new User_controller();
        Integer expResult = null;
        Integer result = instance.addUser(nameUser, password, email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNumbers method, of class User_controller.
     */
    public void testAddNumbers() {
        System.out.println("addNumbers");
        int numberOne = 5;
        int numberTwo = 5;
        User_controller instance = new User_controller();
        int expResult = 10;
        int result = instance.addNumbers(numberOne, numberTwo);
        assertEquals(expResult, result);
    }

    /**
     * Test of subtractNumbers method, of class User_controller.
     */
    public void testSubtractNumbers() {
        System.out.println("subtractNumbers");
        double numberOne = 10;
        double numberTwo = 5;
        User_controller instance = new User_controller();
        double expResult = 5;
        double result = instance.subtractNumbers(numberOne, numberTwo);
        assertEquals(expResult, result);
    }

    /**
     * Test of listUsers method, of class User_controller.
     */

    /**
     * Test of updateUser method, of class User_controller.
     */
    public void testUpdateUser() {
        System.out.println("updateUser");
        Integer userId = null;
        String nameUser = "";
        String password = "";
        String email = "";
        User_controller instance = new User_controller();
        boolean expResult = false;
        boolean result = instance.updateUser(userId, nameUser, password, email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteItem method, of class User_controller.
     */
//    public void testDeleteItem() {
//        System.out.println("deleteItem");
//        Integer userId = null;
//        User_controller instance = new User_controller();
//        boolean expResult = false;
//        //boolean result = instance.deleteItem(userId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MediaLog;
import Model.Medium;
import Model.User;
import java.util.Date;
import junit.framework.TestCase;

/**
 *
 * @author Anthony
 */
public class MediaLog_controllerTest extends TestCase {
    
    public MediaLog_controllerTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of addLog method, of class MediaLog_controller.
     */
    public void testAddLog() {
        MediaLog medialog = new MediaLog();
        System.out.println("addLog");
        User user = null;
        Medium medium = null;
        String item = "";
        Double rating = null;
        Double timeSpent = null;
        Date dateFinished = null;
        MediaLog_controller instance = new MediaLog_controller();
        Boolean expResult = null;
        Boolean result = instance.addLog(user, medium, item, rating, timeSpent, dateFinished);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listLog method, of class MediaLog_controller.
     */
    public void testListLog() {
        System.out.println("listLog");
        MediaLog_controller instance = new MediaLog_controller();
        instance.listLog();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLog method, of class MediaLog_controller.
     */
    public void testUpdateLog() {
        System.out.println("updateLog");
        int logId = 0;
        User user = null;
        Medium medium = null;
        String item = "";
        Double rating = null;
        Double timeSpent = null;
        Date dateFinished = null;
        MediaLog_controller instance = new MediaLog_controller();
        Boolean expResult = null;
        Boolean result = instance.updateLog(logId, user, medium, item, rating, timeSpent, dateFinished);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteLog method, of class MediaLog_controller.
     */
    public void testDeleteLog() {
        System.out.println("deleteLog");
        Integer logId = null;
        MediaLog_controller instance = new MediaLog_controller();
        Boolean expResult = null;
        Boolean result = instance.deleteLog(logId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import junit.framework.TestCase;

/**
 *
 * @author Anthony
 */
public class OtherThreadTest extends TestCase {
    
    public OtherThreadTest(String testName) {
        super(testName);
    }

    /**
     * Test of run method, of class OtherThread.
     */
    public void testRun() {
        System.out.println("run");
        OtherThread instance = new OtherThread();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

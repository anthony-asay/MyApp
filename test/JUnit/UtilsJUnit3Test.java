/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

import java.util.concurrent.TimeoutException;
import junit.framework.TestCase;

/**
 *
 * @author Anthony
 */
public class UtilsJUnit3Test extends TestCase {
    
    public UtilsJUnit3Test(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("* UtilsJUnit3Test: setUp() method");
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("* UtilsJUnit3Test: tearDown() method");
    }

    /**
     * Test of concatWords method, of class Utils.
     */
    public void testConcatWords() {
        System.out.println("concatWords");
        String[] words = null;
        String expResult = "";
        String result = Utils.concatWords(words);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    public void testHelloWorld() {
        System.out.println("* UtilsJUnit3Test: test method 1 - testHelloWorld()");
        assertEquals("Hello, world!", Utils.concatWords("Hello", ", ", "world", "!"));
    }

    public void testWithTimeout() throws InterruptedException, TimeoutException {
        System.out.println("* UtilsJUnit3Test: test method 2 - testWithTimeout()");
        final int factorialOf = 1 + (int) (30000 * Math.random());
        System.out.println("computing " + factorialOf + '!');

        Thread testThread = new Thread() {
                public void run() {
                    System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
                }
            };
            testThread.start();
            Thread.sleep(1000);
            testThread.interrupt();

            if (testThread.isInterrupted()) {
                throw new TimeoutException("the test took too long to complete");
            }
        }
    
    public void DISABLED_testTemporarilyDisabled() throws Exception 
    {
        System.out.println("* UtilsJUnit3Test: test method 4 - checkExpectedException()");
        assertEquals("Malm\u00f6", Utils.normalizeWord("Malmo\u0308"));
    }
    
    public void testExpectedException() 
    {
        System.out.println("* UtilsJUnit3Test: test method 3 - testExpectedException()");
        try 
        {
            final int factorialOf = -5;
            System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
            fail("IllegalArgumentException was expected");
        } 
        catch (IllegalArgumentException ex) 
        {
            
        }
    }
    
    
}

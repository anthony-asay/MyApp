/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Anthony
 */
class OtherThread implements Runnable{
    
    Thread myThread;
    OtherThread()
    {
        myThread = new Thread(this, "MyThread");;
        myThread.start();
        myThread.setPriority(6);
    }
    
    public void run()
    {
        
    }
}

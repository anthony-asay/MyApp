/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class ser {
    
    public static void main(String args[]) throws IOException
    {
        int number;
        int temp;
        ServerSocket s1 = new ServerSocket(1342);
        Socket ss = s1.accept();
        Scanner sc = new Scanner(ss.getInputStream());
        number = sc.nextInt();
        
        temp = number * 2;
        PrintStream p = new PrintStream(ss.getOutputStream());
        p.println(temp);
    }
}

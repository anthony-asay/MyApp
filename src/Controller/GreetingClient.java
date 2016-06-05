/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class GreetingClient
{
   public static void main(String args[]) throws IOException
   {
      int number; 
      Scanner sc = new Scanner(System.in);
      Socket s = new Socket("127.0.0.1", 1342);
      Scanner sc1 = new Scanner(s.getInputStream());
      System.out.println("Enter any number");
      number = sc.nextInt();
      PrintStream p = new PrintStream(s.getOutputStream());
      p.println(number);
      
      
      String serverName = args[0];
      int port = Integer.parseInt(args[1]);
      try
      {
         System.out.println("Connecting to " + serverName +
		 " on port " + port);
         Socket client = new Socket(serverName, port);
         System.out.println("Just connected to " 
		 + client.getRemoteSocketAddress());
         OutputStream outToServer = client.getOutputStream();
         DataOutputStream out = new DataOutputStream(outToServer);
         out.writeUTF("Hello from "
                      + client.getLocalSocketAddress());
         InputStream inFromServer = client.getInputStream();
         DataInputStream in =
                        new DataInputStream(inFromServer);
         System.out.println("Server says " + in.readUTF());
         client.close();
      }catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}
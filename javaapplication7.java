/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author 861644
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        String fileName = "C:\\Users\\861644\\Documents\\NetBeansProjects\\JavaApplication7\\src\\javaapplication7\\ledger.dat";
        try {
          Scanner fh = new Scanner(new File(fileName));
          while (fh.hasNext()) { 
            String i = fh.nextLine();
            System.out.println(i);
          } 
          fh.close();
        } catch (Exception e) {
          System.out.println(e.getMessage());
        }
  }
}

       
        
    }
    
}

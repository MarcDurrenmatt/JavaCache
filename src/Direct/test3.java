/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Direct;

import Direct.cache;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pedago
 */
public class test3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       cache c = new cache(2);
       System.out.println(c.Simulation());
   
       cache c2 = new cache(3);
       System.out.println(c2.Simulation());
       
       cache c3 = new cache(4);
       System.out.println(c3.Simulation());
       
       cache c4 = new cache(5);
       System.out.println(c4.Simulation());
       
       cache c5 = new cache(6);
       System.out.println(c5.Simulation());
       
       cache c6 = new cache(7);
       System.out.println(c6.Simulation());
    }
}
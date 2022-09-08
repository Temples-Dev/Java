/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginne1;


import javax.swing.*; // * means „all‟ GUI Graphical user interface package


/**
 *
 * @author Welcome Guest!
 */
public class Beginne1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String temp; // Temporary storage for input.
 temp = JOptionPane.showInputDialog(null, "First number");
 int a = Integer.parseInt(temp); // String to int
 temp = JOptionPane.showInputDialog(null, "Second number");
 int b = Integer.parseInt(temp);
 temp = JOptionPane.showInputDialog(null, "Third number");
 int c = Integer.parseInt(temp);
 JOptionPane.showMessageDialog(null, "Average is " + 
(a+b+c)/3);
        
        
    }
    
}

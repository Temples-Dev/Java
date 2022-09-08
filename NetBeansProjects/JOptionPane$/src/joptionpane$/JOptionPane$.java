/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpane$;
import javax.swing.*;
/**
 *
 * @author Welcome Guest!
 */
public class JOptionPane$ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String input;
        input=JOptionPane.showInputDialog(null, "Enter number");
        int a=Integer.parseInt(input);
        JOptionPane.showMessageDialog(null,"The number you entered is: "+a);
       
       int input1=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter pass for SEX" ));
        JOptionPane.showMessageDialog(null, "Hello is Java Again, Welcome to the Swingx Package");
        
        input=JOptionPane.showInputDialog(null, "Enter a digit");
        int input2=Integer.parseInt(input);
        JOptionPane.showConfirmDialog(null,"Are you sure that is it?");
        JOptionPane.showMessageDialog(null,"Your digit has been accepted");
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eugenesdev;

import javax.swing.JOptionPane;

/**
 *
 * @author Welcome Guest!
 */
public class EugenesDev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String bs = JOptionPane.showInputDialog(null,"Enter Basic Salary");
       String tr = JOptionPane.showInputDialog(null,"Enter Tax relief");

       Main obj = new Main(Double.parseDouble(bs), Double.parseDouble(tr));

        JOptionPane.showMessageDialog(null, "take-away salary "+ obj.calculateSalary() +" \n deductions "+ obj.deductions()+ "\n tax is: "+ obj.deductions());

    }
    
}

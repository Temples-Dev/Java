/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import javax.swing.JOptionPane;

/**
 *
 * @author Welcome Guest!
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quiz me=new Quiz();
        
        // TODO code application logic here
        String course=JOptionPane.showInputDialog(null,"Enter course:");
        String marks=JOptionPane.showInputDialog(null,"Enter mark:");
        MarkRep markrep=new MarkRep(Double.parseDouble(marks),course);
        JOptionPane.showMessageDialog(null,"The remark of the student is "+markrep.markremarks()+"\n"+
                "The course of the student is:"+markrep.getCourse()+"\n"+
                        "the mark of the student:"+markrep.getMarks());
        
    }
    
}

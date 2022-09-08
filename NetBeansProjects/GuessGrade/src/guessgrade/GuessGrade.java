/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessgrade;

import javax.swing.JOptionPane;

/**
 *
 * @author Welcome Guest!
 */
public class GuessGrade {

    static GuessGrade me = new GuessGrade();

    static MarkRep remark = new MarkRep();

    public void input() {
        String course = JOptionPane.showInputDialog(null, "Enter course");
        double Marks = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter marks"));
        remark.setCourse(course);
        remark.setMarks(Marks);
    }

    public void getInput() {
        System.out.println("Your course is " + remark.getCourse());
        System.out.println("Your marks is " + remark.getMarks());
    }

    public void remark() {
        System.out.print("your Grade is " + remark.markremarks()); //remark.markremarks();

    }

    public void showDialog() {
        JOptionPane.showMessageDialog(null, "Student Details\n" + "Your course is " + remark.getCourse() + "\n" + "Your marks is " + remark.getMarks() + "\n"
                + "your Grade is " + remark.markremarks()
        );
    }

    public void allData() {
//        input();
//        getInput();
//        remark();
        showDialog();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        me.allData();

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package submitjoptionlessons;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import javax.swing.*;

/**
 *
 * @author Welcome Guest!
 */
public class SubmitJOptionLessons {

    static DecimalFormat format = new DecimalFormat("0.00");
    static JTextArea myArea = new JTextArea(10, 40);
    static SubmitJOptionLessons me = new SubmitJOptionLessons();
    /**
     * @param args the command line arguments
     */
    static String studentName;
    static int studentId;
    static double prelimGrade;
    static double midtermGrade;
    static double finalGrade;
    static double studentGrade;

    public void input() {
        studentName = JOptionPane.showInputDialog(null, "Enter Student Name:");

        studentId = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Student ID:"));

        prelimGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Prelim Grade:"));

        midtermGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Midterm Grade:"));

        finalGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Final Grade:"));
    }

    public void process() {
        studentGrade = (prelimGrade + midtermGrade + finalGrade) / 3;
        JOptionPane.showMessageDialog(null, "Your Raw student Grade is  " + studentGrade, "Process", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Your student Grade is  " + format.format(studentGrade), "Process", JOptionPane.INFORMATION_MESSAGE);
        //      JOptionPane.showMessageDialog(null,"Your student Grade is 2 "+Math.round(studentGrade));
    }

    public void ouput() {
        JOptionPane.showMessageDialog(null,
                "Student Name:" + studentName
                + "\n Student ID:" + studentId
                + "\n Prelim Grade: " + prelimGrade
                + "\n Midterm Grade:" + midtermGrade
                + "\n  Final Grade:" + finalGrade
                + "\n student Grade" + format.format(studentGrade),
                "Output ", JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void DialogMsg() {
        // Displaying Dialog name and symbol
        JOptionPane.showMessageDialog(null,
                "Student Name:" + studentName
                + "\n Student ID:" + studentId
                + "\n Prelim Grade: " + prelimGrade
                + "\n Midterm Grade:" + midtermGrade
                + "\n  Final Grade:" + finalGrade
                + "\n student Grade" + format.format(studentGrade),
                //            "Student Details",JOptionPane.PLAIN_MESSAGE
                //               "Student Details",JOptionPane.ERROR_MESSAGE
                //            "Student Details",JOptionPane.WARNING_MESSAGE
                //            "Student Details",JOptionPane.QUESTION_MESSAGE
                "DialogMsg", JOptionPane.INFORMATION_MESSAGE // deFault symbol
        );
    }

    public void TextArea1() {
        //introducing a text area
        myArea.setText("Student Name:" + studentName
                + "\n Student ID:" + studentId
                + "\n Prelim Grade: " + prelimGrade
                + "\n Midterm Grade:" + midtermGrade
                + "\n  Final Grade:" + finalGrade
                + "\n student Grade" + format.format(studentGrade));
        JOptionPane.showMessageDialog(null, myArea, "TextArea1", JOptionPane.INFORMATION_MESSAGE);
    }

    public void TextArea2() {
        // Text area colored with font and bgcolor
        JScrollPane myScroll = new JScrollPane(myArea);
        myArea.setText("\t\tMy Students Valid Details" + "\n\n\t\tTheir Final results\n\n"
                + "\tStduentName\tStudentID\tPrelim\tMidterm\tFinalGrade\tStudentGrade\n"
                + "\t" + studentName + "\t" + studentId + "\t" + prelimGrade + "\t" + midtermGrade + "\t"
                + finalGrade + "\t" + format.format(studentGrade));

        myArea.setFont(new Font("Sans Serif", Font.BOLD, 18));
        myArea.setBackground(Color.blue);
        myArea.setForeground(Color.yellow);
        JOptionPane.showMessageDialog(null, myScroll, "TextArea2", JOptionPane.WARNING_MESSAGE);

    }

    public void Student() {
        input();
//        process();
//        ouput();
//        DialogMsg();
//        TextArea1();
//        TextArea2();
    }

    public static void main(String[] args) {

        me.Student();
    }

}

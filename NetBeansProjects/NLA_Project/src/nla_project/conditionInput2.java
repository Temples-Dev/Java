/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nla_project;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Welcome Guest!
 */
public class conditionInput2 extends conditionInput {

    static int[] result = new int[5];

    public conditionInput2(int monday_special, int draw_result) {
        super(monday_special, draw_result);
    }

    public String ussd() {
        return "*959#";
    }

    public String generateResults() {

        int[] results = new int[5];
        Random rand = new Random();

        int i;
        for (i = 0; i <= results.length; i++) {
            results[0] = rand.nextInt(91);
            results[1] = rand.nextInt(91);
            results[2] = rand.nextInt(91);
            results[3] = rand.nextInt(91);
            results[4] = rand.nextInt(91);
        }
        result = results;
        return Arrays.toString(results);
    }

    public void case1() {
        int dir1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number 1-90"));
        if (dir1 > 90) {
            JOptionPane.showMessageDialog(null, "Please Enter between 1-90");
        }
        JOptionPane.showMessageDialog(null, "You have selected " + dir1);
        int amt = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the amount you wished to stake(1-200)"));
        if (amt > 200) {
            JOptionPane.showMessageDialog(null, "Please Enter between 1-200");
        }
        if (dir1 == result[0]) {
            JOptionPane.showMessageDialog(null, "You've won"+dir1);
        } else {
//            JOptionPane.showMessageDialog(null, "Better luck next stake");
            JOptionPane.showMessageDialog(null, "The Draw Results\n" + generateResults()+"\nBetter luck next stake");
        }
    }

    public void case2() {
        int dir1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number 1-90"));
        int dir2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter  number 1-90"));
        if (dir1 > 90) {
            JOptionPane.showMessageDialog(null, "Please Enter between 1-90");
        }
        if (dir2 > 90) {
            JOptionPane.showMessageDialog(null, "Please Enter between 1-90");
        }
        JOptionPane.showMessageDialog(null, "You have selected " + dir1 + "-" + dir2);
        int amt = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the amount you wished to stake(1-200)"));
        if (amt > 200) {
            JOptionPane.showMessageDialog(null, "Please Enter between 1-200");
        }
        for (int a : result) {
            if (dir1 == a && dir2 == a) {
                JOptionPane.showMessageDialog(null, "You've won " + dir1 + "-" + dir2);
            } else {
//                JOptionPane.showMessageDialog(null, "Better luck next stake");
                JOptionPane.showMessageDialog(null, "The Draw Results\n" + generateResults()+"\nBetter luck next stake");

            }
            break;
        }

    }
    public void case3(){
        JOptionPane.showMessageDialog(null,"Service not availabe");
        
    }
     public void case4(){
         JOptionPane.showMessageDialog(null,"Service not availabe");
    }
 public void case5(){
         JOptionPane.showMessageDialog(null,"Service not availabe");
    }


    public void confirmInput() {
        if (getMonday_special() == 1) {
            String decide = JOptionPane.showInputDialog(null,
                    "1.Direct-1\n2.Two Sure\n3.Drect-3\n4.Direct-4\n5.Direct-5", "5/90", JOptionPane.QUESTION_MESSAGE);
            int receive = Integer.parseInt(decide);
            switch (receive) {
                case 1:
                    case1();
                    break;
                case 2:
                    case2();

                    break;
                case 3:
                    case3();
                    break;
                case 4:
                     case4();
                    break;
                case 5:
                    case5();
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Ivalid Input"); 
                    break;
            }
        } else if (getDraw_result() == 2) {
            conditionInput me = new conditionInput2(0, 0);
            JOptionPane.showMessageDialog(null, "The Draw Results\n" + generateResults());
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Input");
        }
    }

}

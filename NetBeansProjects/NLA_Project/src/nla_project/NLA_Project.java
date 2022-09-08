/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nla_project;

import javax.swing.JOptionPane;

/**
 *
 * @author Welcome Guest!
 */
public class NLA_Project {
static  int[] k= {1,3,4,6};
    static NLA_Project popUp = new NLA_Project();
    static conditionInput2 cond2 = new conditionInput2(0, 0);

    public void code() {
        String ussd = JOptionPane.showInputDialog(null, "Enter NLA USSD");
        cond2.setEnter_code(ussd);
    }

    public void validateCode() {
        // Ternary operator
        if (cond2.getEnter_code() == null ? cond2.ussd() == null : cond2.getEnter_code().equals(cond2.ussd())) {
            String decision = JOptionPane.showInputDialog(null, "Choose from the Menu\n 1.Monday Special\n 2.Draw results" + "\n\nEnter Choice");
            int accept = Integer.parseInt(decision);
            cond2.setMonday_special(accept);
            cond2.setDraw_result(accept);
            cond2.confirmInput();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid USSD", "", JOptionPane.WARNING_MESSAGE);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        popUp.code();
        popUp.validateCode();


//    for (int a: k){
//            System.out.println(a);
//}




    }
   










}
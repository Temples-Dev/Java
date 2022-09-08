/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package submit_me;

import javax.swing.*;

/**
 *
 * @author Welcome Guest!
 */
public class Submit_me {

    static Submit_me m = new Submit_me();
    static Salary1 me = new Salary1();

    public void Setter() {
       int a= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Salary","Salary Dialog",JOptionPane.INFORMATION_MESSAGE));
        me.setBasic_salary(a);
        int b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Tax_relief","Tax Relief Dialog",JOptionPane.INFORMATION_MESSAGE)) ;
        me.setTax_relief(b);
    }

    public void getter() {
        System.out.println("Your salary is " + me.getBasic_salary());
        System.out.println("Your tax relief is " + me.getTax_relief());
    }

    public void output() {
        Setter();
        getter();
    }

    public static void main(String[] args) {
        // TODO code application logic here
m.output();
        System.out.println("CACULATE IS "+me.calc_salary());
    }

}

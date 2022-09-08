/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign4;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Assign4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
       double Salary;
       System.out.println("Please enter the amount of Salary:");
       Salary=input.nextDouble();
       
        int Year;
       System.out.println("Please enter years working experience:");
       Year=input.nextInt();
       
       if (Year>5){
           double bonus;
            bonus = 0.05;
           double netBonus;
           netBonus= Salary*bonus;
           System.out.println("You have been given a bonus of 5% on your salary");
           System.out.println("Your net bonus amount is:" + netBonus);
           int k;
           k= (int)(Salary+netBonus);
           System.out.println("Your bonus Salary is "+k);
       } else{
           System.out.println("You're not qualified for NetBonus");
       }
       
      
      
        
       
    }
    
}

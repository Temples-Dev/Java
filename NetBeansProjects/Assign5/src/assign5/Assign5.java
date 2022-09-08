/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign5;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Assign5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
       
        int mark;
        System.out.println("Please enter your grade:");
        mark=input.nextInt();
        String x;
        x= "Your grade is ";
        if(mark>80){
            System.out.println(x+"A");
        } else if (mark>60){
            System.out.println(x+"B");
        } else if (mark>50){
            System.out.println(x+"C");
        } else if (mark>45){
            System.out.println(x+"D");
        } else if(mark>25){
            System.out.println(x+"E");
        } else {
            System.out.println(x+"F");
        }
        
    }
    
}

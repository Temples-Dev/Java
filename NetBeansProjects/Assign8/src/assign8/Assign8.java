/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign8;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Assign8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int x,y;
        
        System.out.println(" Enter Number of classes held");
        x=input.nextInt();
        System.out.println("Enter Number of classes attended");
        y=input.nextInt();
        
        int PCAttended;
        PCAttended= (y*100)/x;
        System.out.println("Percentage of class attended is "+PCAttended  +" percent" );
        if ((y<=x)&&(PCAttended>75)){
            System.out.println("You are allowed to sit in exams");
        } else if ((PCAttended>100)&&(y>x)){
            System.out.println("Class attended  cannot be more than class held");
        }else {
            System.out.println("You are not allowed to sit in exams");
        }
        
        
    }
    
}

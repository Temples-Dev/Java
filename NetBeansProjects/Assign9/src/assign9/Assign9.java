/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign9;

import java.util.Scanner;


/**
 *
 * @author Welcome Guest!
 */
public class Assign9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args ) {
        // TODO code application logic here
         Scanner input=new Scanner(System.in);
        int x,y;
        String Answer;
        
        System.out.println(" Enter Number of classes held");
        x=input.nextInt();
        System.out.println("Enter Number of classes attended");
        y=input.nextInt();
        
        // Percentage 75
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
        
        if (PCAttended<=75){
              //medical Q
        System.out.println("Do you have a medical cause? Y/N");
        Answer=input.next();
        String v="Y";
        if (v.equals(Answer)){
            System.out.println("You are allowed to sit in exams");
        } else if(!v.equals(Answer)){
            System.out.println("You are not allowed to sit in exams");
        } /*else{
            
        }
        } else{
        
    }*/
        
    } 
    
}
    
}

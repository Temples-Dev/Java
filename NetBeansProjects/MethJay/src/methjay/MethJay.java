/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methjay;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class MethJay {
    //public int getAbsoluteValue;
    public static int getAbsoluteValue(int givenNumber){
        if (givenNumber<0){
            int a=(-1)*givenNumber;
           return a;
        }else{
        return givenNumber;
    }
    }
    /**
     * @param args the command line arguments
     */
    
    public static boolean bool(){
//        int classAttended=0;
//        int classHeld=0;
        
         Scanner input= new Scanner(System.in);
        System.out.println("Enter Class Class Held");
      int  classHeld=input.nextInt();
        System.out.println("Enter class attended");
      int classAttended=input.nextInt();
        int percent=(classAttended*100)/classHeld;
       
        if(percent>75){
            return true;
        }else{
            return false;
            
        }
       
}
    public static void main(String[] args) {
        // TODO code application logic here
       
      
        System.out.println("Your qualification is\n"+bool());
      
        //System.out.println("Your Absolute value is\n"+ getAbsoluteValue(0));
    }
    
    
    
}

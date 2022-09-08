/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign11;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Assign11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an Alphabet: ");
        char c;
        c=input.next().charAt(0);
       if((c!='a')&&(c!='z')){
           if ((c>='a' && c<='z')){
            System.out.println("it is lowercase");
    } else if ((c>='A' && c<='Z')) {
     System.out.println("it is uppercase");
       } else{
               System.out.println("Please enter alphabet");
    }
        
} /*else{
        
    }*/
    
    }
}
    


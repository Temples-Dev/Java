/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop16;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Loop16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
        int x;
        System.out.println("Enter positive number");
        x=input.nextInt();
   int sub=-1;
   
         int i;
        float sum;
        sum=0;
        for(i=1;i<=x;i++){
            sub *=-1;
            sum+=sub*1.0/i;
        }
        System.out.println("log 2: "+sum);
        
        
        
        
        
        
        
        
        
        
    }
    
}

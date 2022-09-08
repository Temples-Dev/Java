/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop19;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Loop19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input=new Scanner (System.in);
         
          int x;
        System.out.println("Enter X");
        x=input.nextInt();
        int n;
        System.out.println("Enter N");
        n=input.nextInt();
         int i;
        float sum;
        sum=0;
           int sub=-1;
        for(i=1;i<=n;i++){
            i+=2;
            double z=0;
              z= z+Math.pow(x, i);
           int fact=1;
           fact*=i;
              sub *=-1;
            sum+=sub*z/fact;
        
        
        }
            System.out.println("sum is "+sum);
    }
    
}

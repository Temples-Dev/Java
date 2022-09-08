/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop15;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Loop15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int x;
        System.out.println("Enter number");
        x=input.nextInt();
        int i;
        float sum;
        sum=0;
        for(i=1;i<=x;i++){
            sum+=1.0/i;
        }
        System.out.println("Sum is "+ sum);
    }
    
}

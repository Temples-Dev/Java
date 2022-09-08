/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trial;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Trial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double dis,amount, markedprice,s;
        Scanner sc= new Scanner(System.in);
        markedprice=sc.nextDouble();
        System.out.println("enter discount perentage");
        dis=sc.nextDouble();
        System.out.println("enter discount");
        dis=sc.nextDouble();
        s=100-dis;
        amount=(s*markedprice)/100;
        System.out.println("amount after discount"+ amount);
        
    }
    
}

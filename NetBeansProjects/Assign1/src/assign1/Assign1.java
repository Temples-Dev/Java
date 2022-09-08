/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign1;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Assign1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int breadth;
        int length;
        System.out.println("Please enter breadth:");
        breadth = input.nextInt();
        System.out.println("Please enter length:" );
        length = input.nextInt();
 
        if (length==breadth){
            System.out.println("Yes, it is a square");
        } else {
            System.out.println("No,it is not a sqaure");
        }
    }
    
}

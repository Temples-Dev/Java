/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign3;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Assign3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number of quantity:");
        int Quantity;
        Quantity= input.nextInt();
        
        int cost;
        cost= Quantity* 100;
        System.out.println("Your item cost is :"+ cost);
        
        int discountPercent;
        discountPercent=100-10;
        if (cost>1000){
            System.out.println("Your discount is 10%");
            int discount;
            discount= (cost*discountPercent)/100;
            System.out.println("Your cost after discount is:"+ discount);   
        } else{
            System.out.println("Sorry!, purchase more to qualify for discount, Thank you");
        }
        
                
                    
        }
    }
    

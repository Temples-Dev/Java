/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytrying;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class ArrayTrying {
    static Scanner input= new Scanner(System.in);
    
    
    public static void String(){
       
        String myName;
         System.out.println("Enter Your Name:");
        myName=input.next();
        String reverse="";
        
        for(int i=myName.length()-1;i>=0;i--){
            reverse+=myName.charAt(i);
        }
        System.out.println("Your reversed name is:");
         System.out.println(reverse);
    } 
    
    public static void Array1(){
        int[] arrName={2,3,10,20};
       int[] cpyarrName=new int[arrName.length+3];
      
       System.out.println("Array list is:");
       for(int i=0;i<arrName.length;i++){
         
        System.out.println(arrName[i]+"\t");
         
        }
    }

    
    public static void Array2(){
      int[] arrName;
        System.out.println("Enter number");
       int arrName1=input.nextInt();
      // arrName=new int[arrName1.length];
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
       
        String();
        
    }
    
}

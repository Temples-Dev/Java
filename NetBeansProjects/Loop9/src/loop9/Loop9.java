/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop9;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Loop9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first numbr");
        int x;
        x=input.nextInt();
        System.out.println("Enter second  numbr");
        int y;
        y=input.nextInt();
        int hcf;
        hcf=0;
        for(int z=1;z<=x && z<=y;z++){
            if(x%z==0 && y%z==0 ){
                hcf=z;
            }
        }
        System.out.println("HCF is \n"+hcf);
      }
    
}

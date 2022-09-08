/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop13;

/**
 *
 * @author Welcome Guest!
 */
public class Loop13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int count=1;
        int rem;
        int sum;
        
        while(count<=500){
            num=count;
            sum=0;
            
            while(num!=0){
                rem=num%10;
                sum=sum+(rem*rem*rem);
                num=num/10;
            }
            if(count==sum){
                System.out.println(count+" is an Armsteong number\n");
                
            }
            count ++;
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Welcome Guest!
 */
class Bird{
    public void sing(){
        System.out.println("tweet tweet tweet");
    }
}
class Robin extends Bird{
    //methods with the same that is overriding
     
     @Override
     public void sing(){
        System.out.println("twaaaaaaaaassss");
    }
}
class Pelican extends Bird{
    
     public void sing(String song){
        System.out.println("tweet nanan kuiii");
    }
}
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Pelican b=new Pelican();
        b.sing("a ");
    }
    
}

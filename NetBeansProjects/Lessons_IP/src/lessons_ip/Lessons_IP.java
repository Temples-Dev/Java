/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessons_ip;

/**
 *
 * @author Welcome Guest!
 */
public class Lessons_IP {

    public void Dad() {
        Dad w = new Dad("", 0);
        w.hometown = "ho";
        w.mariageStatus = "married";
        w.profession = "lecturer";
        w.setName("Gengz");
        w.setAge(45);
        System.out.println("Dads details");
        System.out.println("Fucking " + w.getName() + " is here!");
        System.out.println("Fucking " + w.getAge());
        System.out.println("Fucking " + w.hometown);
        System.out.println("Fucking " + w.mariageStatus);
        System.out.println("Fucking " + w.profession);
    }

    public void Son() {
        Son m = new Son("Kofi", 27);
        System.out.println("Son details");
        System.out.println("Name " + m.getName());
        System.out.println("Age " + m.getAge());
        //        m.setName("Amest");
        //        m.setAge(5);
    }
public void Daughter(){
    Daughter d= new Daughter(45);
    d.setName("Ama");
    System.out.println("myName is "+ d.getName());
    d.setAge(22);
    System.out.println("myAge is "+d.getAge());
    d.hometown="Hohoe";
    
    
}
public void Family(){
    Dad(); 
    System.out.println("\n");
    Son();
    System.out.println("\n");
    Daughter();
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lessons_IP call=new Lessons_IP();
        call.Family();
  
    

    }

}

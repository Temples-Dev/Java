/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author Welcome Guest!
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s= new Student();
        s.setName("Temple");
        s.setAge(18);
          System.out.println(s.getName());
          System.out.println(s.getAge());
        
//         s.name="Temple";
//          s.age=18;
//        System.out.println( s.name);
//        System.out.println( s.age);
        
    }
    
}

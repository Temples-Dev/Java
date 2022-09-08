/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kissi_lessons;

/**
 *
 * @author Welcome Guest!
 */
public class Person {
    String name,gender,complexion;
    int age;
    double height;
    public void Person(String name,int age,String sex,double height,String complexion){
        this.name=name;
        this.age=age;
        gender=sex;
        this.height=height;
        this.complexion=complexion;
        
        
    }
    public void details(){
            System.out.println("Your name is "+name);
            System.out.println("Your age is "+age +" years");
            System.out.println("Your are a "+ gender);
            System.out.println("Your complexion is "+ complexion);
            System.out.println("Your height is "+ height);
        }
}

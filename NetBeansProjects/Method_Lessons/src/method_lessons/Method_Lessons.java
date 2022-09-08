/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method_lessons;

/**
 *
 * @author Welcome Guest!
 */
public class Method_Lessons extends Parent2 {  // Inheritance was displayed here // extends is used add features of parrent tomchild class

    
    
    static Method_Lessons me = new Method_Lessons();
   // int a;
    Method_Lessons(int a){
        super(a,0);
    }
    
     Method_Lessons(){
        super(0,0);
    }
  //  int a;

//    public Method_Lessons(int c) {  // A special method with the name as the class is a constructer
//        this.a = c; 
//    }
                                            
    public void display(int a) {
        super.display();

        System.out.println("\t");

        System.out.println("The value of " + a);  // A method with same name but idffernt number of argument is Method is over loading 
        // No argument method is a method without  argument
        System.out.println("Global A is here Bro " + super.a);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // me.display(20);
        me.display();
me.display(10);
    }

}

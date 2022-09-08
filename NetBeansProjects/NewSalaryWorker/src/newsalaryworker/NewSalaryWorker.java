/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newsalaryworker;

/**
 *
 * @author Welcome Guest!
 */
public class NewSalaryWorker {
static Son s=new Son(0,0);
public void taxAll(){
     s.setBasic_salary(475);
    s.Taxable_income();
    System.out.println("Paid to ssnit "+s.SnitTake());
    System.out.println("your cumlative tax is "+s.Tax()); ;
//    System.out.println("For tax1 "+s.tax1());
//    System.out.println("For tax1 "+s.tax2());
//    System.out.println("For tax1 "+s.tax3());
//    System.out.println("For tax1 "+s.tax4());
//    System.out.println("For tax1 "+s.tax5());
    
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewSalaryWorker ss=new NewSalaryWorker();
        ss.taxAll();
    }
    
}

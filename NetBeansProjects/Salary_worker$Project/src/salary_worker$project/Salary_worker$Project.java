/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary_worker$project;

/**
 *
 * @author Welcome Guest!
 */
public class Salary_worker$Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Child salary=new Child(0,0);
        salary.setBasic_salary(475);
        salary.setTax_relief(0);
        System.out.println("Taxable income is "+salary.Taxable_income());
        System.out.println("Payment to SSNIT "+salary.SnitTake());
        System.out.println("Your tax due is "+salary.Deductions());
    }
    
}

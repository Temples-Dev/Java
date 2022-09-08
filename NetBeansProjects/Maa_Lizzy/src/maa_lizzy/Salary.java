/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maa_lizzy;

/**
 *
 * @author Welcome Guest!
 */
public class Salary {
    int Basic_salary;
    int Tax_relief;

    public  Salary(int Basic_salary, int Tax_relief) {
        this.Basic_salary = Basic_salary;
        this.Tax_relief = Tax_relief;
    }
     public double ssnit(){
        double a=13.5*Basic_salary;
        return a;
    }
      public double ded(){
        double b=100*ssnit();
        return b;
    }
       public double calc(){
        double c=Basic_salary-ded();
        return c;
    }
    
}

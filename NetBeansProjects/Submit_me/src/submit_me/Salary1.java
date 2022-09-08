/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package submit_me;

/**
 *
 * @author Welcome Guest!
 */
public class Salary1 {

    private int Basic_salary;
    private int Tax_relief;

    public void setBasic_salary(int Basic_salary) {
        this.Basic_salary = Basic_salary;
    }

    public void setTax_relief(int Tax_relief) {
        this.Tax_relief = Tax_relief;
    }

    public int getBasic_salary() {
        return Basic_salary;
    }

    public int getTax_relief() {
        return Tax_relief;
    }

    public double ssnit() {
        double a = (13.5 * Basic_salary)/100;
        
        return a;
    }

    public double ded() {
        double b = 100 * ssnit();
        return b;
    }

    public double calc_salary() {
        double c = Basic_salary - ded();
        return c;
    }

}

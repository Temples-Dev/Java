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
public class Dad {

    private double Basic_salary;
    private double Tax_relief;

    public Dad(double Basic_salary, double Tax_relief) {
        this.Basic_salary = Basic_salary;
        this.Tax_relief = Tax_relief;
    }

    public double getBasic_salary() {
        return Basic_salary;
    }

    public void setBasic_salary(double Basic_salary) {
        this.Basic_salary = Basic_salary;
    }

    public double getTax_relief() {
        return Tax_relief;
    }

    public void setTax_relief(double Tax_relief) {
        this.Tax_relief = Tax_relief;
    }
    

}

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
public class Child extends Parent {

    static double a, b, c, d, e;

    public Child(double Basic_salary, double Tax_relief) {
        super(Basic_salary, Tax_relief);
    }

    public double Taxable_income() {
        return getBasic_salary() - getTax_relief();
    }

    public double SnitTake() {
        return (getBasic_salary() * 13.5) / 100;
    }

    public double Deductions() {
        double taxToPay = 0;

        if (Taxable_income() <= 216) { //0-216  VALIDATED
            double taxRate = 0.0;
            a = Taxable_income() * taxRate;
            taxToPay = a;
        } else if (Taxable_income() > 216) {  //217-324  VALIDATED
            double  calc=Taxable_income()-216;
            double taxRate = 0.05;
            b = calc * taxRate;
            taxToPay = b+a;
        } else if (Taxable_income() >324) {  //325-
            
            double  calc=Taxable_income()-324;
            double taxRate = 0.1;
            c = calc * taxRate;
            taxToPay = c;
        } else if (Taxable_income() > 475) {//476-3240
            double  calc=Taxable_income()-475;
            double taxRate = 0.175 ;
            d = calc * taxRate+c;
            taxToPay = d;
        } else if (Taxable_income() > 3240) {//>3240
            double  calc=Taxable_income()-3240;
            double taxRate = 25 / 100;
            e = calc * taxRate+d;
            taxToPay = e;
        }

        return taxToPay;
    }
}

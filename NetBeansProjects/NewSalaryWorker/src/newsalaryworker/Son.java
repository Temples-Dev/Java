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
public class Son extends Dad {

    static double a, b, c, d, e;

    public Son(double Basic_salary, double Tax_relief) {
        super(Basic_salary, Tax_relief);
    }

    public double Taxable_income() {
        return getBasic_salary() - getTax_relief();
    }

    public double SnitTake() {
        return (getBasic_salary() * 13.5) / 100;
    }

    public double Tax() {
       if(Taxable_income()<=216){//1
           double taxRate=0;
           a=Taxable_income()-0;
           return a*taxRate;
       }else if(Taxable_income()<=324){//2
           double taxRate=0.05;
           b= Taxable_income()-216;
           return b*taxRate;
       }else if (Taxable_income()<=475){//3
           double taxRate=0.1;
            c= Taxable_income()-324;
            return c*taxRate;
        }else if (Taxable_income()<=3240){//4
            double taxRate=0.175;
            d= Taxable_income()-475;
            return d*taxRate;
        }else if (Taxable_income()>3240){//5
            double taxRate=0.25;
            e= Taxable_income()-34240;
            return e*taxRate;
        }
        return 0;
    }

}

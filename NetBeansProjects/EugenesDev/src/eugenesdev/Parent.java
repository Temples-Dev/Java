/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eugenesdev;

/**
 *
 * @author Welcome Guest!
 */
public class Parent {
    
     private  static double basicSalary,taxRelief;

    Parent(double basicSalary,double taxRelief){
        Parent.basicSalary = basicSalary;
        Parent.taxRelief = taxRelief;
    }

//encapsulate fields

    public static double getBasicSalary() {
        return basicSalary;
    }

    public static void setBasicSalary(double basicSalary) {
        Parent.basicSalary = basicSalary;
    }

    public static double getTaxRelief() {
        return taxRelief;
    }

    public static void setTaxRelief(double taxRelief) {
        Parent.taxRelief = taxRelief;
    }

    public double taxableIncome (){
        return getBasicSalary()-getTaxRelief();
    }

    public double ssnit(){
        return 0.135*getBasicSalary();
    }


    public double deductions(){
        double tax = 0;
//        if(taxableIncome() <= 216){
//            tax = 0;
//        } else if (taxableIncome() <= 324) {
//            tax = 0.05*108;
//        } else if (taxableIncome() <= 475) {
//            tax = (0.05*108)+(0.1*151);
//        } else if (taxableIncome()  <= 3240) {
//            tax = (0.05*108)+(0.1*151)+(0.175*2765);
//        }else if(taxableIncome() > 3240){
//            tax = (0.05*108)+(0.1*151)+(0.175*2765)+(0.25*3240);
//        }

        if(taxableIncome() <=216){
            tax = 0;
        } else if (taxableIncome() <= 324) {
            tax = 0.05*(taxableIncome()-216);
        } else if (taxableIncome() <= 475) {
            tax = 0.1*(taxableIncome()-324)+0.05*(taxableIncome()-216);
        } else if (taxableIncome() <= 3240) {
            tax = 0.175*(taxableIncome() - 457)+0.1*(taxableIncome()-324)+0.05*(taxableIncome()-216);
        } else if (taxableIncome() > 3240) {
            tax  = 0.25*(taxableIncome()-3240)+0.175*(taxableIncome() - 457)+0.1*(taxableIncome()-324)+0.05*(taxableIncome()-216);
        }
        return tax;
    }
    
}

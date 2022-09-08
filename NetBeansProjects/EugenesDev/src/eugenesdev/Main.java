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
public class Main extends Parent{

    public Main(double basicSalary, double taxRelief) {
        super(basicSalary, taxRelief);
    }
     public double calculateSalary(){
        return getBasicSalary()-deductions();
    }
}

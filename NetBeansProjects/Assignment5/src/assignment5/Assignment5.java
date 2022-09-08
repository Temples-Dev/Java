/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("Input a month number: ");
        int mn;
        mn=input.nextInt();
        System.out.println("Input a year: ");
        int year;
        year=input.nextInt();
        
        int DaysInMonth = 0; 
        String monthName = "Unknown";
        
                switch (mn) {
            case 1:
                monthName = "January";
                DaysInMonth = 31;
                break;
            case 2:
                monthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    DaysInMonth = 29;
                } else {
                    DaysInMonth = 28;
                }
                break;
            case 3:
                monthName = "March";
                DaysInMonth = 31;
                break;
            case 4:
                monthName = "April";
                DaysInMonth = 30;
                break;
            case 5:
                monthName = "May";
                DaysInMonth = 31;
                break;
            case 6:
                monthName = "June";
                DaysInMonth = 30;
                break;
            case 7:
                monthName = "July";
                DaysInMonth = 31;
                break;
            case 8:
                monthName = "August";
                DaysInMonth = 31;
                break;
            case 9:
                monthName = "September";
                DaysInMonth = 30;
                break;
            case 10:
                monthName = "October";
                DaysInMonth = 31;
                break;
            case 11:
                monthName = "November";
                DaysInMonth = 30;
                break;
            case 12:
                monthName = "December";
                DaysInMonth = 31;
        }
        System.out.println (monthName + " " + year + " has " + DaysInMonth + " days");
        
    }


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    


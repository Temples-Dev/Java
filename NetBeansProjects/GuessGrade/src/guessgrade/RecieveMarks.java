/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessgrade;

/**
 *
 * @author Welcome Guest!
 */
public class RecieveMarks {
   private double Marks;
   private String course;

    public RecieveMarks(double Marks, String course) {
        this.Marks = Marks;
        this.course = course;
    }

    public double getMarks() {
        return Marks;
    }

    public void setMarks(double Marks) {
        this.Marks = Marks;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

  
 
}

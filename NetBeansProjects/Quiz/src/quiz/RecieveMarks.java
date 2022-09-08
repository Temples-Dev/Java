/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Welcome Guest!
 */
public class RecieveMarks {
    private double marks;
    private String course;

    public RecieveMarks(double marks, String course) {
        this.marks = marks;
        this.course = course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public String getCourse() {
        return course;
    }
    
    
}

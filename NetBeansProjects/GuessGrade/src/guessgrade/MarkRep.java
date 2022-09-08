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
public class MarkRep extends RecieveMarks {

    public MarkRep(double Marks, String course) {
        super(Marks, course);
    }
 public MarkRep() {
        super(0, null);
    }
   

    public String  markremarks() {

        if (getMarks()>80) {
           return "A";
        } else if (getMarks()> 60) {
            return "B";
        } else if (getMarks() >50) {
              return "C";
        } else if (getMarks() > 45) {
            return "D";
        } else if (getMarks() > 25) {
            return "E";
        } else  {
             return "F";
        }
       
    }
}

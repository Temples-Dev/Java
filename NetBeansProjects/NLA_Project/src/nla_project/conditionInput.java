/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nla_project;

/**
 *
 * @author Welcome Guest!
 */
public class conditionInput {
    private int monday_special;
    private int draw_result;
    private String enter_code;

    public conditionInput(int monday_special, int draw_result) {
        this.monday_special = monday_special;
        this.draw_result = draw_result;
    }


    public int getMonday_special() {
        return monday_special;
    }

    public void setMonday_special(int monday_special) {
        this.monday_special = monday_special;
    }

    public int getDraw_result() {
        return draw_result;
    }

    public void setDraw_result(int draw_result) {
        this.draw_result = draw_result;
    }

    public String getEnter_code() {
        return enter_code;
    }

    public void setEnter_code(String enter_code) {
        this.enter_code = enter_code;
    }
    
    
    
}

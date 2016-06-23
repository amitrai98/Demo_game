package android.com.demo_game;

import android.widget.Button;

/**
 * Created by amitrai on 23/6/16.
 */
public class Bin_Button {

    private Button btn_one_one ;
    private Button btn_one_two ;
    private Button btn_one_three ;

    private Button btn_two_one ;
    private Button btn_two_two ;
    private Button btn_two_three ;

    private Button btn_three_one ;
    private Button btn_three_two ;
    private Button btn_three_three ;
    
    public Bin_Button(
             Button btn_one_one ,
             Button btn_one_two ,
             Button btn_one_three ,

             Button btn_two_one ,
             Button btn_two_two ,
             Button btn_two_three ,

             Button btn_three_one ,
             Button btn_three_two ,
             Button btn_three_three
    ){
        this.btn_one_one = btn_one_one;
        this.btn_one_two = btn_one_two;
        this.btn_one_three = btn_one_three;

        this.btn_two_one = btn_two_one;
        this.btn_two_two = btn_two_two;
        this.btn_two_three = btn_two_three;

        this.btn_three_one = btn_three_one;
        this.btn_three_two = btn_three_two;
        this.btn_three_three = btn_three_three;

    }

    public Button getBtn_one_one() {
        return btn_one_one;
    }

    public void setBtn_one_one(Button btn_one_one) {
        this.btn_one_one = btn_one_one;
    }

    public Button getBtn_one_two() {
        return btn_one_two;
    }

    public void setBtn_one_two(Button btn_one_two) {
        this.btn_one_two = btn_one_two;
    }

    public Button getBtn_one_three() {
        return btn_one_three;
    }

    public void setBtn_one_three(Button btn_one_three) {
        this.btn_one_three = btn_one_three;
    }

    public Button getBtn_two_one() {
        return btn_two_one;
    }

    public void setBtn_two_one(Button btn_two_one) {
        this.btn_two_one = btn_two_one;
    }

    public Button getBtn_two_two() {
        return btn_two_two;
    }

    public void setBtn_two_two(Button btn_two_two) {
        this.btn_two_two = btn_two_two;
    }

    public Button getBtn_two_three() {
        return btn_two_three;
    }

    public void setBtn_two_three(Button btn_two_three) {
        this.btn_two_three = btn_two_three;
    }

    public Button getBtn_three_one() {
        return btn_three_one;
    }

    public void setBtn_three_one(Button btn_three_one) {
        this.btn_three_one = btn_three_one;
    }

    public Button getBtn_three_two() {
        return btn_three_two;
    }

    public void setBtn_three_two(Button btn_three_two) {
        this.btn_three_two = btn_three_two;
    }

    public Button getBtn_three_three() {
        return btn_three_three;
    }

    public void setBtn_three_three(Button btn_three_three) {
        this.btn_three_three = btn_three_three;
    }
}

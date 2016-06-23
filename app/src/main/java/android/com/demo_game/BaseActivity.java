package android.com.demo_game;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

public class BaseActivity extends AppCompatActivity {

    private Button btn_one_one ;
    private Button btn_one_two ;
    private Button btn_one_three ;
    private Button btn_two_one ;
    private Button btn_two_two ;
    private Button btn_two_three ;
    private Button btn_three_one ;
    private Button btn_three_two ;
    private Button btn_three_three ;

    private ColorAlgo colorAlgo = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        init();
    }

    /**
     * initalize view elements.
     */
    private void init(){

        btn_one_one = (Button) findViewById(R.id.btn_one_one);
        btn_one_two = (Button) findViewById(R.id.btn_one_two);
        btn_one_three = (Button) findViewById(R.id.btn_one_three) ;
        btn_two_one = (Button) findViewById(R.id.btn_two_one);
        btn_two_two = (Button) findViewById(R.id.btn_two_two) ;
        btn_two_three = (Button) findViewById(R.id.btn_two_three);
        btn_three_one= (Button) findViewById(R.id.btn_three_one);
        btn_three_two = (Button) findViewById(R.id.btn_three_two);
        btn_three_three = (Button) findViewById(R.id.btn_three_three);

        Bin_Button bin_button = new Bin_Button(btn_one_one, btn_one_two, btn_one_three,
                btn_two_one, btn_two_two, btn_two_three,
                btn_three_one, btn_three_two, btn_three_three);


        colorAlgo = new ColorAlgo();
        colorAlgo.startColorRandering(bin_button);
    }


    @Override
    protected void onPause() {
        super.onPause();

        if(colorAlgo != null)
            colorAlgo.stopColorChanging();
    }
}

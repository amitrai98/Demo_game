package android.com.demo_game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }


    /**
     * init view elements
     */
    private void init(){
        startActivity(new Intent(this, BaseActivity.class));
    }
}

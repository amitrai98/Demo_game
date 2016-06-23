package android.com.demo_game;

import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by amitrai on 23/6/16.
 */
public class ColorAlgo {

    private String TAG = getClass().getSimpleName();
    private TimerTask doAsynchronousTask = null;


    /**
     * initiates color randering of the cubes
     */
    public void startColorRandering(Bin_Button bin_button){
        bin_button.getBtn_one_one().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(doAsynchronousTask != null)
                    stopColorChanging();
                else
                    startColorChanging();
            }
        });
        Log.e(TAG, ""+Utility.getRandomColor());
    }

    public void startColorChanging() {
        final Handler handler = new Handler();
        Timer timer = new Timer();
        doAsynchronousTask = new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    public void run() {
                        try {
                            Log.e(TAG, ""+Utility.getRandomColor());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        };
        timer.schedule(doAsynchronousTask, 0, 1000); //execute in every 50000 ms
    }

    /**
     *
     */
    public void stopColorChanging(){
        try{
            doAsynchronousTask.cancel();
            doAsynchronousTask = null;
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    private void refreshButtons(Bin_Button bin_button, Activity act){
        for (int i = 0; i<9 ; i++){
            bin_button.getBtn_one_one()
        }
    }
}

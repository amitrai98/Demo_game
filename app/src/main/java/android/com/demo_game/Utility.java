package android.com.demo_game;

/**
 * Created by amitrai on 23/6/16.
 */
public class Utility {

    public static int getRandomColor(){

        int r = (int) (Math.random() * (Constants.MAX_COLOR_LIMIT - Constants.MIN_COLOR_LIMIT)) + Constants.MIN_COLOR_LIMIT;

        return r;
    }
}

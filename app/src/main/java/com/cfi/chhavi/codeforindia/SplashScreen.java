package com.cfi.chhavi.codeforindia;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;


//        import android.app.Activity;
//        import android.content.Intent;
//        import android.os.Bundle;
//        import android.view.MotionEvent;
//        import android.view.View;
//        import android.view.animation.ScaleAnimation;
//        import android.widget.TextView;

/**
 * Created by jigyasa on 22/8/15.
 */
public class SplashScreen extends Activity {

    private Thread mSplashThread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ScaleAnimation scaleAnim1 = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f);
        scaleAnim1.setDuration(800);
        scaleAnim1.setStartOffset(500);
        scaleAnim1.setFillAfter(true);
       // ImageView justSpecial = (ImageView)findViewById(R.id.just_special_text);
       // justSpecial.setVisibility(View.VISIBLE);
       // justSpecial.setAnimation(scaleAnim1);
//        Party.main();

        final SplashScreen sPlashScreen = this;

        // The thread to wait for splash screen events
        mSplashThread =  new Thread(){
            @SuppressWarnings("deprecation")
            @Override
            public void run(){
                try {
                    synchronized(this){
                        // Wait given period of time or exit on touch
                        wait(2500);
                    }
                }
                catch(InterruptedException ex){
                }

                finish();

                // Run next activity
                Intent intent = new Intent();
                intent.setClass(sPlashScreen, MainActivity.class);
                startActivity(intent);
                //    stop();
            }
        };

        mSplashThread.start();
    }

    @Override
    public boolean onTouchEvent(MotionEvent evt)
    {
        if(evt.getAction() == MotionEvent.ACTION_DOWN)
        {
            synchronized(mSplashThread){
                mSplashThread.notifyAll();
            }
        }
        return true;
    }
}

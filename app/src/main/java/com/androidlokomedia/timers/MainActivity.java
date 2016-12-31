package com.androidlokomedia.timers;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    boolean running = true;
    int second= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.i("second left", "onTick: "+String.valueOf(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                //coundown finished (after 10 second)
                Log.i("Finish", "onFinish: coundown timer finishs");
            }
        }.start();

//        final Handler handler = new Handler();
//        final Runnable run = new Runnable() {
//            @Override
//            public void run() {
//                if (running) {
//                    second++;
//                }
//                Log.i("running", "run: "+second);
//                handler.postDelayed(this, 1000);
//            }
//        };
//        handler.post(run);

//        final Handler handler = new Handler();
//        handler.post(new Runnable() {
//            @Override
//            public void run() {
//                Log.i("Run", "run: ");
//                handler.postDelayed(this, 1000);
//            }
//        });
    }
}

package com.example.c25k;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Chronometer;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class thirdActivity extends AppCompatActivity {

    private Chronometer chronometer;
    private boolean running;
    private long timeOffset;
    private TextView lap;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTheme(R.style.Theme_C25K);

        setContentView(R.layout.activity_third);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.third);

        lap = findViewById(R.id.textView);
        chronometer = findViewById(R.id.chronometer);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.Main:
                        chronometer.stop();
                        running = false;
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        finish();
                        return true;
                    case R.id.second:
                        chronometer.stop();
                        running = false;
                        startActivity(new Intent(getApplicationContext(), secondActivity.class));
                        overridePendingTransition(0,0);
                        finish();
                        return true;
                    case R.id.third:
                        return true;

                }
                return false;
            }
        });

        final Handler ha=new Handler();
        ha.postDelayed(new Runnable() {

            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void run() {
                if(running){
                    Long tracker = (SystemClock.elapsedRealtime() - chronometer.getBase())/1000;
                    Log.d("time",tracker.toString());

                    if (tracker==0){
                        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                            v.vibrate(VibrationEffect.createOneShot(1000, VibrationEffect.DEFAULT_AMPLITUDE));
                        } else {
                            //deprecated in API 26
                            v.vibrate(1000);
                        }
                        lap.setText("Lap: 1 \n Run 180 seconds");
                        MediaPlayer mediaPlayer = MediaPlayer.create(thirdActivity.this, R.raw.lap1);
                        mediaPlayer.start();

                    }else if (tracker==180){
                        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                            v.vibrate(VibrationEffect.createOneShot(1000, VibrationEffect.DEFAULT_AMPLITUDE));
                        } else {
                            //deprecated in API 26
                            v.vibrate(1000);
                        }
                        lap.setText("Lap: 1 \n Walk 90 seconds");
                        MediaPlayer mediaPlayer = MediaPlayer.create(thirdActivity.this, R.raw.walk);
                        mediaPlayer.start();
                    }else if (tracker==270){
                        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                            v.vibrate(VibrationEffect.createOneShot(1000, VibrationEffect.DEFAULT_AMPLITUDE));
                        } else {
                            //deprecated in API 26
                            v.vibrate(1000);
                        }
                        lap.setText("Lap: 2 \n Run 300 seconds");
                        MediaPlayer mediaPlayer = MediaPlayer.create(thirdActivity.this, R.raw.sonic2);
                        mediaPlayer.start();

                    }else if (tracker==570){
                        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                            v.vibrate(VibrationEffect.createOneShot(1000, VibrationEffect.DEFAULT_AMPLITUDE));
                        } else {
                            //deprecated in API 26
                            v.vibrate(1000);
                        }
                        lap.setText("Lap: 2 \n Walk 150 seconds");
                        MediaPlayer mediaPlayer = MediaPlayer.create(thirdActivity.this, R.raw.walk);
                        mediaPlayer.start();
                    }else if (tracker==720){
                        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                            v.vibrate(VibrationEffect.createOneShot(1000, VibrationEffect.DEFAULT_AMPLITUDE));
                        } else {
                            //deprecated in API 26
                            v.vibrate(1000);
                        }
                        lap.setText("Lap: 3 \n Run 180 seconds");
                        MediaPlayer mediaPlayer = MediaPlayer.create(thirdActivity.this, R.raw.smith3);
                        mediaPlayer.start();

                    }else if (tracker==900){
                        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                            v.vibrate(VibrationEffect.createOneShot(1000, VibrationEffect.DEFAULT_AMPLITUDE));
                        } else {
                            //deprecated in API 26
                            v.vibrate(1000);
                        }
                        lap.setText("Lap: 3 \n Walk 90 seconds");
                        MediaPlayer mediaPlayer = MediaPlayer.create(thirdActivity.this, R.raw.walk);
                        mediaPlayer.start();
                    }else if (tracker==990){
                        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                            v.vibrate(VibrationEffect.createOneShot(1000, VibrationEffect.DEFAULT_AMPLITUDE));
                        } else {
                            //deprecated in API 26
                            v.vibrate(1000);
                        }
                        lap.setText("Lap: 4 \n Run 300 seconds");
                        MediaPlayer mediaPlayer = MediaPlayer.create(thirdActivity.this, R.raw.week4);
                        mediaPlayer.start();

                    }else if (tracker==1290){
                        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                            v.vibrate(VibrationEffect.createOneShot(1000, VibrationEffect.DEFAULT_AMPLITUDE));
                        } else {
                            //deprecated in API 26
                            v.vibrate(1000);
                        }
                        lap.setText("Lap: 4 \n Walk ");
                        MediaPlayer mediaPlayer = MediaPlayer.create(thirdActivity.this, R.raw.walk);
                        mediaPlayer.start();
                    }


                }

                ha.postDelayed(this, 1000);
            }
        }, 1000);
    }
    public void start(View v){
        if(!running){
            chronometer.setBase(SystemClock.elapsedRealtime() - timeOffset);
            chronometer.start();
            running = true;

        }
    }

    public void pause(View v){
        if(running){
            chronometer.stop();
            timeOffset = SystemClock.elapsedRealtime() - chronometer.getBase();
            running = false;
        }
    }

    public void reset(View v){
        chronometer.stop();
        chronometer.setBase(SystemClock.elapsedRealtime());
        timeOffset = 0;
        lap.setText("Lap: 0");
        running = false;
    }
}
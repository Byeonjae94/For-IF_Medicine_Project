package com.example.user.medicine;


import android.support.v7.app.AppCompatActivity;
import android.os.Handler;
import android.view.View;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // 1. Splash 구현하기
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                finish();
            }
        },1000);


    }
}

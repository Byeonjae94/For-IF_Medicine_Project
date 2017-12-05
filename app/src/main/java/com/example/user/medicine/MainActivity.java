package com.example.user.medicine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(this,SplashActivity.class));
    }

    public void Transition(View v) {
        Intent a = new Intent(this, LoginActivity.class);
        startActivity(a);
    }

    public void Transition1(View v) {
        Intent a = new Intent(this, Button_oneActivity.class);
        startActivity(a);
        finish();
    }

    public void Transition2(View v) {
        Intent a = new Intent(this, Button_twoActivity.class);
        startActivity(a);
        finish();
    }

    public void Transition3(View v) {
        Intent a = new Intent(this, Button_threeActivity.class);
        startActivity(a);
        finish();
    }

    public void Transition4(View v) {
        Intent a = new Intent(this, Button_FourActivity.class);
        startActivity(a);
        finish();
    }
}

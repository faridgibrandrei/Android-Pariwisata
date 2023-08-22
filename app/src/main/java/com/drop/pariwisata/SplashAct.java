package com.drop.pariwisata;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(() -> {
            Intent goToGetStarted = new Intent(SplashAct.this, GetStartedAct.class);
            startActivity(goToGetStarted);
            finish();
        }, 1500);
    }
}
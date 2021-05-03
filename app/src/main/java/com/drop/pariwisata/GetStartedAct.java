package com.drop.pariwisata;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GetStartedAct extends AppCompatActivity {

    Button btnSignIn, btnNewAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        btnSignIn = findViewById(R.id.btn_sign_in);
        btnNewAccount = findViewById(R.id.btn_new_account);

        btnSignIn.setOnClickListener(v -> {
            Intent goToSignIn = new Intent(GetStartedAct.this, SignInAct.class);
            startActivity(goToSignIn);
        });
    }
}
package com.drop.pariwisata;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignInAct extends AppCompatActivity {

    private TextView btnNewAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        btnNewAccount = findViewById(R.id.btn_new_account);
        btnNewAccount.setOnClickListener(view -> {
            Intent goToRegisterOne = new Intent(SignInAct.this, RegisterOneAct.class);
            startActivity(goToRegisterOne);
        });
    }
}
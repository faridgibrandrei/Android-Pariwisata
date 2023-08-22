package com.drop.pariwisata;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignInAct extends AppCompatActivity {

    private TextView btnNewAccount;
    private EditText etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        declaration();

        btnNewAccount.setOnClickListener(view -> {
            Intent goToRegisterOne = new Intent(SignInAct.this, RegisterOneAct.class);
            startActivity(goToRegisterOne);
        });
    }

    private void declaration() {
        btnNewAccount = findViewById(R.id.btn_new_account);
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
    }
}
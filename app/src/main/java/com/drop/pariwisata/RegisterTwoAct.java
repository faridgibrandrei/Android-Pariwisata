package com.drop.pariwisata;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterTwoAct extends AppCompatActivity {

    private Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_two);

        btn_register = findViewById(R.id.btn_register);

        btn_register.setOnClickListener(view -> {
            Intent goToSuccess = new Intent(RegisterTwoAct.this, SuccessRegisterAct.class);
            startActivity(goToSuccess);
        });

    }
}
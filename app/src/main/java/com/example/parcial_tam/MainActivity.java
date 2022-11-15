package com.example.parcial_tam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText User;
        Button Registrar,login;
        login = findViewById(R.id.btn_login);
        Registrar =findViewById(R.id.btn_register);
        User = findViewById(R.id.User);
        Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (User.getText().toString() == "Admin") {
                    Intent intent = new Intent(MainActivity.this, HomeAdmin.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(MainActivity.this, HomeUsers.class);
                    startActivity(intent);
                }
            }
        });
    }
}
package com.example.parcial_tam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class UsersAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_admin);

        ImageButton Exit,Filter;
        Button Volver;

        Exit =findViewById(R.id.btnSalir5);
        Filter = findViewById(R.id.btnFilter);
        Volver = findViewById(R.id.btn_volver2);

        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UsersAdmin.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UsersAdmin.this, FilterAdmin.class);
                startActivity(intent);
            }
        });
        Volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UsersAdmin.this, HomeAdmin.class);
                startActivity(intent);
            }
        });

    }
}
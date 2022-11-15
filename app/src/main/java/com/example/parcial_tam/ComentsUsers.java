package com.example.parcial_tam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ComentsUsers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coments_users);

        Button AddComent;
        ImageButton Salir;
        Salir = findViewById(R.id.btnSalir3);
        AddComent =findViewById(R.id.btn_addComent);

        Salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ComentsUsers.this, MainActivity.class);
                startActivity(intent);
            }
        });

        AddComent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ComentsUsers.this, AddComent.class);
                startActivity(intent);
            }
        });
    }
}
package com.example.sonidod;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Botones extends AppCompatActivity {

    ImageButton btnnombre, btnbuen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones);

        btnnombre = findViewById(R.id.btnnombre);
        btnbuen = findViewById(R.id.btnbuen);

        btnnombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Botones.this, R.raw.nombre);
                mp.start();
            }
        });
        btnbuen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Botones.this, R.raw.servicio);
                mp.start();
            }
        });
    }
}
package com.brave.browse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class IFBU extends AppCompatActivity {

    Button fdf, hhg, kiuttg;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ifbu);
        fdf = findViewById(R.id.button);
        hhg = findViewById(R.id.button2);
        kiuttg = findViewById(R.id.button3);

        fdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),GAMIF.class));
                finishAffinity();
            }
        });

        hhg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(),GAMTIF.class));
            }
        });

        kiuttg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });
    }
}

package com.faenvaudiovisual.calculadoras;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencia al ImageView donde se mostrará el GIF animado
        ImageView imageView = findViewById(R.id.imageView);

        // Cargar el GIF animado usando Glide
        Glide.with(this)
                .asGif()
                .load(R.drawable.fondo_app)
                .into(imageView);

        // Referencias a los botones y configuración de los listeners
        Button btnCelsiusToFahrenheit = findViewById(R.id.btnCelsiusToFahrenheit);
        Button btnMetersToFeet = findViewById(R.id.btnMetersToFeet);
        Button btnCalculateIMC = findViewById(R.id.btnCalculateIMC);

        btnCelsiusToFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CelsiusToFahrenheitActivity.class));
            }
        });

        btnMetersToFeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MetersToFeetActivity.class));
            }
        });

        btnCalculateIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, IMCActivity.class));
            }
        });
    }
}

package com.faenvaudiovisual.calculadoras;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CelsiusToFahrenheitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celsius_to_fahrenheit);

        final EditText etCelsius = findViewById(R.id.etCelsius);
        final TextView tvResult = findViewById(R.id.tvResult);
        Button btnConvert = findViewById(R.id.btnConvert);
        Button btnBack = findViewById(R.id.btnBack);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double celsius = Double.parseDouble(etCelsius.getText().toString());
                    double fahrenheit = (celsius * 9/5) + 32;
                    tvResult.setText(String.format("%.2f°C = %.2f°F", celsius, fahrenheit));
                } catch (NumberFormatException e) {
                    tvResult.setText("Por favor, ingrese un número válido");
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
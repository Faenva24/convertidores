package com.faenvaudiovisual.calculadoras;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MetersToFeetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meters_to_feet);

        final EditText etMeters = findViewById(R.id.etMeters);
        final TextView tvResult = findViewById(R.id.tvResult);
        Button btnConvert = findViewById(R.id.btnConvert);
        Button btnBack = findViewById(R.id.btnBack);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double meters = Double.parseDouble(etMeters.getText().toString());
                    double feet = meters * 3.28084;
                    tvResult.setText(String.format("%.2f m = %.2f ft", meters, feet));
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
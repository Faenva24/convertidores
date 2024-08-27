package com.faenvaudiovisual.calculadoras;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class IMCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        final EditText etWeight = findViewById(R.id.etWeight);
        final EditText etHeight = findViewById(R.id.etHeight);
        final TextView tvResult = findViewById(R.id.tvResult);
        Button btnCalculate = findViewById(R.id.btnCalculate);
        Button btnBack = findViewById(R.id.btnBack);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double weight = Double.parseDouble(etWeight.getText().toString());
                    double height = Double.parseDouble(etHeight.getText().toString());
                    double imc = weight / (height * height);
                    String resultMessage;

                    if (imc < 18.5) {
                        resultMessage = "Bajo peso";
                    } else if (imc >= 18.5 && imc < 24.9) {
                        resultMessage = "Peso normal";
                    } else if (imc >= 25 && imc < 29.9) {
                        resultMessage = "Sobrepeso";
                    } else {
                        resultMessage = "Obesidad";
                    }

                    tvResult.setText(String.format("Tu IMC es: %.2f\n%s", imc, resultMessage));
                } catch (NumberFormatException e) {
                    tvResult.setText("Por favor, ingrese números válidos");
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

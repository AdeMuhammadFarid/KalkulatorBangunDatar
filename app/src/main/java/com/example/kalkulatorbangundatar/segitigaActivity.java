package com.example.kalkulatorbangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class segitigaActivity extends AppCompatActivity {

    private EditText inputAlas, inputTinggi, inputSisiMiring;
    private TextView resultSegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        inputAlas = findViewById(R.id.input_alas);
        inputTinggi = findViewById(R.id.input_tinggi);
        inputSisiMiring = findViewById(R.id.input_sisi_miring);
        resultSegitiga = findViewById(R.id.result_segitiga);
        Button buttonHitungLuas = findViewById(R.id.button_hitung_luas_segitiga);
        Button buttonHitungKeliling = findViewById(R.id.button_hitung_keliling_segitiga);

        buttonHitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double alas = Double.parseDouble(inputAlas.getText().toString());
                double tinggi = Double.parseDouble(inputTinggi.getText().toString());
                double luas = 0.5 * alas * tinggi;
                resultSegitiga.setText("Luas: " + luas);
            }
        });

        buttonHitungKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double alas = Double.parseDouble(inputAlas.getText().toString());
                double sisiMiring = Double.parseDouble(inputSisiMiring.getText().toString());
                double tinggi = Double.parseDouble(inputTinggi.getText().toString());
                double keliling = alas + tinggi + sisiMiring;
                resultSegitiga.setText("Keliling: " + keliling);
            }
        });
    }
}

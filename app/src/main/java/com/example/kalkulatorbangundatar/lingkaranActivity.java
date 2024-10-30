// LingkaranActivity.java
package com.example.kalkulatorbangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class lingkaranActivity extends AppCompatActivity {

    private EditText inputJariJari;
    private TextView resultLingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        inputJariJari = findViewById(R.id.input_jari_jari);
        resultLingkaran = findViewById(R.id.result_lingkaran);
        Button buttonHitungLuas = findViewById(R.id.button_hitung_luas_lingkaran);
        Button buttonHitungKeliling = findViewById(R.id.button_hitung_keliling_lingkaran);

        buttonHitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double jariJari = Double.parseDouble(inputJariJari.getText().toString());
                double luas = Math.PI * jariJari * jariJari;
                resultLingkaran.setText("Luas: " + luas);
            }
        });

        buttonHitungKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double jariJari = Double.parseDouble(inputJariJari.getText().toString());
                double keliling = 2 * Math.PI * jariJari;
                resultLingkaran.setText("Keliling: " + keliling);
            }
        });
    }
}

package com.example.kalkulatorbangundatar;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button btnSegitiga, btnPersegi, btnLingkaran, btnPersegiPanjang;
    private GradientDrawable v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnSegitiga = findViewById(R.id.button_triangle);
        btnLingkaran = findViewById(R.id.button_circle);
        btnPersegi = findViewById(R.id.button_square);
        btnPersegiPanjang = findViewById(R.id.button_rectangle);

        View mainView = findViewById(R.id.main);

        ViewCompat.setOnApplyWindowInsetsListener(mainView, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return WindowInsetsCompat.CONSUMED;
        });

        // Menambahkan listener untuk setiap tombol
        btnSegitiga.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, segitigaActivity.class);
            startActivity(intent);
        });

        btnLingkaran.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, lingkaranActivity.class);
            startActivity(intent);
        });

        btnPersegi.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, persegiActivity.class);
            startActivity(intent);
        });

        btnPersegiPanjang.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, persegipanjangActivity.class);
            startActivity(intent);
        });
    }
}

package com.example.volumecalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SpherePage extends AppCompatActivity {
    TextView result;
    EditText editTxt;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sphere_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        result = findViewById(R.id.result);
        editTxt = findViewById(R.id.editTextText);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(v -> {
            int radius = Integer.parseInt(editTxt.getText().toString());
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            result.setText(String.valueOf(volume));
        });

    }
}
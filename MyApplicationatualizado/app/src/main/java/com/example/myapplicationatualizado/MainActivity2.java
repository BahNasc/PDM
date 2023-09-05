package com.example.myapplicationatualizado;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    int i;
    Button button;
    TextView tvContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = findViewById(R.id.buttonSomar);
        tvContador = findViewById(R.id.textNum);
    }

    public void contagem(View v) {
        tvContador.setText(Integer.toString(i++));
    }
}
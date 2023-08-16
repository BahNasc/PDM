package com.example.sorteioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Integer valorMin, valorMax;
    Button btnSortear;
    EditText edNumMin, edNumMax;
    TextView tvNumSorteado;
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSortear = findViewById(R.id.btnSortear);
        tvNumSorteado = findViewById(R.id.txtValorSorteado);
        edNumMin = findViewById(R.id.txtNumMin);
        edNumMax = findViewById(R.id.txtNumMax);
    }

    public void sorteiaNumero(View v) {
        valorMin = Integer.parseInt(edNumMin.getText().toString());
        valorMax = Integer.parseInt(edNumMax.getText().toString());

        int numAleatorio = rand.nextInt((valorMax - valorMin) + 1) + valorMin;
        tvNumSorteado.setText(String.valueOf(numAleatorio));
    }
}
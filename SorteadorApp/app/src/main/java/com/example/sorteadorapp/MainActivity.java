package com.example.sorteadorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle; //classes que precisaram ser importadas
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity { //essa é a classe principal (activity)

    Button btnSorteio;         //declarei as variáveis
    Integer valMin, valMax;
    EditText editNumMin, editNumMax;
    TextView tvNumSorteio;
    Random rand = new Random();     //instância da classe random pra gerar
                                   //números aleatóros
    @Override
    protected void onCreate(Bundle savedInstanceState) {  //para começar a rodar o aplicativo
        super.onCreate(savedInstanceState);              //para ser inicializado
        setContentView(R.layout.activity_main);         //setando o layout (activitymain)
        btnSorteio = findViewById(R.id.btnSorteador);
        tvNumSorteio = findViewById(R.id.txtValorSorteado);     //(puxa kkk) os valores do
        editNumMin = findViewById(R.id.textMenorNum);          // layout associando-os com a variável
        editNumMax = findViewById(R.id.textMaiorNum);
    }

    public void sorteiaNumero(View v) { //Método quando clicar o button
        valMin = Integer.parseInt(editNumMin.getText().toString());  //pega os valores do layout
        valMax = Integer.parseInt(editNumMax.getText().toString()); // e transformar (parseInt) em inteiro

        int qualquerNum = rand.nextInt((valMax - valMin) + 1) + valMin; //declara uma variavel que rodará um
        tvNumSorteio.setText(String.valueOf(qualquerNum));                   // um número aleatório através do rand
    }                                                                       // seta a variével qualquerNum no layout (aparece lá)
}
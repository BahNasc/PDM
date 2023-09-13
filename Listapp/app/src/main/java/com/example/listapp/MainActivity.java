package com.example.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<ItemChurrasco> listaItensChurrasco = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        listaItensChurrasco.add(new ItemChurrasco(1, "Carne", R.drawable.carne));
        listaItensChurrasco.add(new ItemChurrasco(2, "Linguiça", R.drawable.linguica));
        listaItensChurrasco.add(new ItemChurrasco(3, "Refrigerante", R.drawable.refri));
        listaItensChurrasco.add(new ItemChurrasco(4, "Pão de Alho", R.drawable.paodealho));
        listaItensChurrasco.add(new ItemChurrasco(5, "Carvão", R.drawable.carvao));

        ItemChurrasscoAdapter adapter = new ItemChurrasscoAdapter(this, R.layout.item_churrasco, listaItensChurrasco);
        listView.setAdapter(adapter);
    }
}
package com.example.databaseteste2;

import static com.example.databaseteste2.R.id.listView;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    EditText editText;
    SQLiteDatabase sqlLiteDatabase;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        editText=findViewById(R.id.edText);
        sqlLiteDatabase=openOrCreateDatabase("notas", MODE_PRIVATE, null);
        sqlLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS notas (id INTEGER PRIARY KEY AUTOINCREMENT, txt varchar)");
    }
    public void inserirNot(){

    }
}
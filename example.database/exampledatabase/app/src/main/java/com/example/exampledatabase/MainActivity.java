package com.example.exampledatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase sqLitedb;
    ListView listView;

    @SuppressLint("Range")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        sqLitedb = openOrCreateDatabase("meubd", MODE_PRIVATE, null);
        sqLitedb.execSQL("CREATE TABLE IF NOT EXISTS usr (id INTEGER PRIMARY KEY AUTOINCREMENT," + " none VARCHAR);");

        ContentValues cv = new ContentValues();
        cv.put("none", "João");
        sqLitedb.insert("usr",null,cv);

        Cursor cursor = sqLitedb.rawQuery("SELECT * from usr", null);
        cursor.moveToFirst();

        ArrayList listaUsuario = new ArrayList<>();

        while( !cursor.isAfterLast()){
            listaUsuario.add(cursor.getString(cursor.getColumnIndex("none")));
            Log.d("tabelausr", cursor.getString(cursor.getColumnIndex("id"))+cursor.getString(cursor.getColumnIndex("none")));
            cursor.moveToNext();
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, android.R.id.text1, listaUsuario);
        listView.setAdapter(arrayAdapter);
    }
}
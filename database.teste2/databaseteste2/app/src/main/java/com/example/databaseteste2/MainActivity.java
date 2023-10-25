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

        ContentValues cv = new ContentValues();
        cv.put("nome", "Bah");
        sqlitedb.insert("usr", null, cv);

        Cursor cursor = sqlitedb.rawQuery("SELECT * FROM usr", null);
        cursor.moveToFirst();

        ArrayList<String> listaUsuario = new ArrayList<>();

        while(!cursor.isAfterLast()) {
            listaUsuario.add(cursor.getString(cursor.getColumnIndex("nome")));
            Log.d("tableusr", cursor.getString(cursor.getColumnIndex("id"))
                    + cursor.getString(cursor.getColumnIndex("nome")));
            cursor.moveToNext();
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                listaUsuario
        );
        listaUsuarios.setAdapter(arrayAdapter);
    }
}



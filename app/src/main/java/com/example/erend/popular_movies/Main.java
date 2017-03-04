package com.example.erend.popular_movies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main extends AppCompatActivity {
    private String[] datos = new String[]{
            "anarillo", "rojo verde", "azul"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adaptador= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        ListView lista = (ListView)findViewById(R.id.listaDatos);
        lista.setAdapter(adaptador);
    }
}

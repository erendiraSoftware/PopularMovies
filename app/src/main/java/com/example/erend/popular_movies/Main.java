package com.example.erend.popular_movies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.erend.adapters.CarAdapter;
import com.example.erend.models.Carro;

import java.util.ArrayList;

public class Main extends AppCompatActivity {
    private ArrayList<Carro>carros=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        carros.add(new Carro(R.drawable.carros1, "Titulo1", "Descripcion1"));
        carros.add(new Carro(R.drawable.carros2,"Titulo2", "Descripcion2"));
        carros.add(new Carro(R.drawable.carros3,"Titulo3", "Descripcion3"));
        carros.add(new Carro(R.drawable.carros4,"Titulo4", "Descripcion4"));
        carros.add(new Carro(R.drawable.carros5,"Titulo5", "Descripcion5"));

        CarAdapter adapter=new CarAdapter(this,carros);
        RecyclerView lista= (RecyclerView) findViewById(R.id.listaDatos);
        lista.setLayoutManager(new GridLayoutManager(this,2));
        lista.setHasFixedSize(true);
        lista.setAdapter(adapter);
    }
}

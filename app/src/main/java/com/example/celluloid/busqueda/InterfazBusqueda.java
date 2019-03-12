package com.example.celluloid.busqueda;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.celluloid.R;
import com.example.celluloid.pelicula.DescripcionPelicula;

import java.util.ArrayList;
import java.util.List;

import dominioTrakt.Busqueda;
import trakt.Buscar;

public class InterfazBusqueda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);

        ListView listView = findViewById(R.id.resultadosListView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Busqueda item = (Busqueda) parent.getItemAtPosition(position);
                Intent intent = new Intent(InterfazBusqueda.this, DescripcionPelicula.class);
                startActivity(intent);

            }
        });

    }

    public void buscarPelicula(View view) {
        TextView textView = findViewById(R.id.barraBusqueda);
        ListView listView = findViewById(R.id.resultadosListView);
        listView.setAdapter(new Adaptador(Buscar.buscar(textView.getText().toString()), this));
    }
}

package com.example.celluloid.busqueda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.celluloid.R;

import java.util.ArrayList;
import java.util.List;

import trakt.Buscar;

public class InterfazBusqueda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);

        List<InterfazBusqueda> lis = new ArrayList<>();
        lis.add(new InterfazBusqueda());
        lis.add(new InterfazBusqueda());
        lis.add(new InterfazBusqueda());
        lis.add(new InterfazBusqueda());
        lis.add(new InterfazBusqueda());
        lis.add(new InterfazBusqueda());
        lis.add(new InterfazBusqueda());
        lis.add(new InterfazBusqueda());

    }

    public void buscarPelicula(View view) {
        TextView textView = findViewById(R.id.barraBusqueda);
        ListView listView = findViewById(R.id.resultadosListView);
        listView.setAdapter(new Adaptador(Buscar.buscar(textView.getText().toString()), this));
    }
}

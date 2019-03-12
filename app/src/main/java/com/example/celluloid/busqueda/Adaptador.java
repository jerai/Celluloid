package com.example.celluloid.busqueda;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.celluloid.R;

import java.util.List;

import dominioTrakt.Busqueda;

public class Adaptador extends BaseAdapter {

    private static LayoutInflater inflater = null;
    private List<Busqueda> listaResultados;
    private Context contexto;

    public Adaptador(List<Busqueda> listaResultados, Context contexto_) {
        this.listaResultados = listaResultados;
        this.contexto = contexto_;

        inflater = (LayoutInflater)contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View vista = inflater.inflate(R.layout.elemento_resultado, null);

        TextView textView = (TextView) vista.findViewById(R.id.nombreResultado);
        textView.setText(listaResultados.get(position).getMovie().getTitle());

        ImageView imageView = vista.findViewById(R.id.imagenResultado);




        return vista;
    }

    @Override
    public int getCount() {
        return listaResultados.size();
    }

    @Override
    public Object getItem(int position) {
        return listaResultados.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}

package com.example.rosalia.castrorosalia.Categoria;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.example.rosalia.castrorosalia.R;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jona on 22/11/2016.
 */
public class ListaCategoria extends AppCompatActivity implements MyOnItemClick {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.opcion1){
            Log.d("Menu","Opcion1");
            //cerrar la sesion y envialo a la pantalla principal

            return true;
        }
        else
        if (id == R.id.opcion2){
            Log.d("Menu","Opcion2");
            //mostrar la lista filtrada por favoritos.
            return true;
        }
        else
        if (id == R.id.opcion3){
            Log.d("Menu","Opcion3");
            return true;
        }
        else
        if (id == R.id.opcion4){
            Log.d("Menu","Opcion4");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_categorias);

        List<ModeloCategoria> modeloCategorias = new ArrayList<ModeloCategoria>();

        modeloCategorias.add(new ModeloCategoria("Categoria 1", "Esta es una breve descrpcion de la categoria"));
        modeloCategorias.add(new ModeloCategoria("Categoria 2", "Esta es una breve descrpcion de la categoria"));
        modeloCategorias.add(new ModeloCategoria("Categoria 3", "Esta es una breve descrpcion de la categoria"));
        modeloCategorias.add(new ModeloCategoria("Categoria 4", "Esta es una breve descrpcion de la categoria"));
        modeloCategorias.add(new ModeloCategoria("Categoria 5", "Esta es una breve descrpcion de la categoria"));
        modeloCategorias.add(new ModeloCategoria("Categoria 6", "Esta es una breve descrpcion de la categoria"));
        modeloCategorias.add(new ModeloCategoria("Categoria 7", "Esta es una breve descrpcion de la categoria"));
        modeloCategorias.add(new ModeloCategoria("Categoria 8", "Esta es una breve descrpcion de la categoria"));
        modeloCategorias.add(new ModeloCategoria("Categoria 9", "Esta es una breve descrpcion de la categoria"));
        modeloCategorias.add(new ModeloCategoria("Categoria 10", "Esta es una breve descrpcion de la categoria"));

        RecyclerView list = (RecyclerView)findViewById(R.id.list_item);

        MyAdapter adapter = new MyAdapter(modeloCategorias, this);
        list.setAdapter(adapter);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        list.setLayoutManager(manager);
        adapter.notifyDataSetChanged();
        FloatingActionButton fb=(FloatingActionButton)findViewById(R.id.fabAgregar);
        //escuchar el click del boton agregar y abrir la pantalla de crear categoria.


    }

    @Override
    public void onItemClick(int position) {
        //String dato1;
        //String dato2;

        //Intent  intent = new Intent(this,Categoria.class);
        //intent.putExtra(dato1,1);
        //intent.putExtra(dato2,2);
        //startActivity(intent);


    }

}

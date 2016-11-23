package com.example.rosalia.castrorosalia.Principal;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rosalia.castrorosalia.Categoria.ModeloCategoria;
import com.example.rosalia.castrorosalia.R;

import java.util.ArrayList;
import java.util.List;

public class PantallaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        SharedPreferences preferences =getSharedPreferences("recordarme", Context.MODE_PRIVATE);

        List<ModeloPrincipal> myLista = new ArrayList<ModeloPrincipal>();
        myLista.add(new ModeloPrincipal("rosa@gmail.com", "1234"));
        myLista.add(new ModeloPrincipal("user1@gmail.com", "hola"));
        myLista.add(new ModeloPrincipal("castro@gmail.com", "laboratorio"));


        ModeloPrincipal modeloPrincipal = new ModeloPrincipal();
        ControladorPrincipal controladorPrincipal = new ControladorPrincipal(modeloPrincipal,this,preferences,myLista);
        VistaPrincipal vistaPrincipal = new VistaPrincipal(modeloPrincipal,this,controladorPrincipal);
        controladorPrincipal.setMiVista(vistaPrincipal);



    }
}

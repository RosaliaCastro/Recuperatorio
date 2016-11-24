package com.example.rosalia.castrorosalia.Registrar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.rosalia.castrorosalia.R;

/**
 * Created by Jona on 22/11/2016.
 */
public class PantallaRegistrar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_registrar);

        ModeloRegistrar modeloRegistrar = new  ModeloRegistrar();
        ControladorRegistrar controladorRegistrar= new ControladorRegistrar(modeloRegistrar,this);
        VistaRegistrar vistaRegistrar = new VistaRegistrar(modeloRegistrar,this,controladorRegistrar);
        controladorRegistrar.setMiVista(vistaRegistrar);
    }
}

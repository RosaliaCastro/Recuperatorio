package com.example.rosalia.castrorosalia.Categoria;

import android.view.View;

import com.example.rosalia.castrorosalia.R;

/**
 * Created by Jona on 22/11/2016.
 */
public class ControladorCategoria implements View.OnClickListener {
    private ModeloCategoria miMod;
    private VistaCategoria miVista;

    public ControladorCategoria(ModeloCategoria mod){
        miMod=mod;
    }
    public void setMiVista(VistaCategoria vista){miVista =vista;}

    @Override
    public void onClick(View view) {
        if (view.getId()== R.id.btnTomarFoto){


        }else if(view.getId()==R.id.btnCrear){

        }
    }
}

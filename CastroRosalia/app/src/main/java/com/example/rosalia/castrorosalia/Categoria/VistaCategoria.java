package com.example.rosalia.castrorosalia.Categoria;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

import com.example.rosalia.castrorosalia.R;

/**
 * Created by Jona on 22/11/2016.
 */
public class VistaCategoria {
    private ModeloCategoria modeloCategoria;
    private EditText nombreCategoria;
    private EditText descricionCategoria;
    private Button crear;
    private Button tomarFoto;

    public VistaCategoria(ModeloCategoria mod, Activity activity, ControladorCategoria contCategoria){
        modeloCategoria = mod;

        nombreCategoria= (EditText)activity.findViewById(R.id.textNomCategoria);
        descricionCategoria=(EditText)activity.findViewById(R.id.textDesCategoria);
        tomarFoto=(Button) activity.findViewById(R.id.btnTomarFoto);
        crear = (Button)activity.findViewById(R.id.btnCrear);

        crear.setOnClickListener(contCategoria);
        tomarFoto.setOnClickListener(contCategoria);
    }
    public String traerNomCategoria() {
        String nombre = nombreCategoria.getText().toString();
        return nombre;
    }

    public String traerDesCategoria() {
        String descripcion = descricionCategoria.getText().toString();
        return descripcion;
    }

}

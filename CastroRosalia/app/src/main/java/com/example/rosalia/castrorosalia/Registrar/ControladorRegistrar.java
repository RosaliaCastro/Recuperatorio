package com.example.rosalia.castrorosalia.Registrar;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

import com.example.rosalia.castrorosalia.Categoria.ListaCategoria;
import com.example.rosalia.castrorosalia.Principal.PantallaPrincipal;
import com.example.rosalia.castrorosalia.R;

/**
 * Created by Jona on 22/11/2016.
 */
public class ControladorRegistrar implements View.OnClickListener {

    ModeloRegistrar miModelo;
    Activity miActivity;
    VistaRegistrar miVista;

    String nombre;
    String apellido;
    String usuario;
    String email;
    String clave;

    public ControladorRegistrar(ModeloRegistrar mod, Activity actividad){
        miModelo = mod;
        miActivity= actividad;
    }
    private void startActivity(Intent intent){
        miActivity.startActivity(intent);
    }
    public void setMiVista(VistaRegistrar vistaRegistrar){this.miVista = vistaRegistrar;}

    @Override
    public void onClick(View view) {
        if (view.getId()== R.id.btnRegistrarseR){

            nombre= miVista.TraerNombre();
            apellido=miVista.TraerApellido();
            usuario=miVista.TraerUsuario();
            email=miVista.TraerEmail();
            clave=miVista.TraerClave();
            Registrar(nombre, apellido, usuario,email,clave);
            Intent pantCat = new Intent(miActivity, ListaCategoria.class);
            startActivity(pantCat);
        }else if(view.getId()== R.id.btnCancelarR){

            Intent volverPrincipal = new Intent(miActivity,PantallaPrincipal.class);
            startActivity(volverPrincipal);
        }

    }
    public void Registrar(String myNombre, String myApellido, String myUsuario, String myEmail, String myClave){
        String name = myNombre;
        String lastName = myApellido;
        String user =myUsuario;
        String email=myEmail;
        String password = myClave;
        ModeloRegistrar miMod = new ModeloRegistrar(myNombre, myApellido,myUsuario,myEmail,myClave);

    }
}


package com.example.rosalia.castrorosalia.Principal;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.example.rosalia.castrorosalia.Lista.ListaCategoria;
import com.example.rosalia.castrorosalia.MiDialogo;
import com.example.rosalia.castrorosalia.R;
import com.example.rosalia.castrorosalia.Registrar.PantallaRegistrar;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Jona on 22/11/2016.
 */
public class ControladorPrincipal implements View.OnClickListener {

    private ModeloPrincipal miModelo;
    private VistaPrincipal miVista;
    private Activity miActivity;
    String email;
    String clave;
    private MiDialogo miDialogo;
    SharedPreferences miPreferences;
    private List<ModeloPrincipal> ListaUser;

    public ControladorPrincipal(ModeloPrincipal modelo, Activity actividad, SharedPreferences preferences, List<ModeloPrincipal> list, MiDialogo myDialogo) {
        miModelo = modelo;
        miActivity = actividad;
        miPreferences = preferences;
        ListaUser=list;
        miDialogo=myDialogo;
    }

    public ControladorPrincipal(VistaPrincipal vista) {
        miVista = vista;
    }

    public void setMiVista(VistaPrincipal miVista) {
        this.miVista = miVista;
    }

    private void startActivity(Intent intent) {
        miActivity.startActivity(intent);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btnRegistrarme) {
            Intent intent1 = new Intent(miActivity, PantallaRegistrar.class);
            startActivity(intent1);
            miVista.Limpiar();
        } else if (view.getId() == R.id.btnIngresar && view.getId() == R.id.checkboxRecordar) {

                clave = miVista.traerClave();//obtengo usuario y contraseña. Luego valido que exista.
                email = miVista.traerEmail();

                if (ConsultarUsuario(email, clave)) {
                    SharedPreferences.Editor editor = miPreferences.edit();//lo guardo, sharedPreferences para recordarlo.
                    editor.putString("password", clave);
                    editor.putString("email", email);
                    editor.commit();

                    Intent intent2 = new Intent(miActivity, ListaCategoria.class);//lo paso a la pantalla siguente.
                    startActivity(intent2);
                } else {
                    miDialogo.show(miActivity.getFragmentManager(),"dialogo");
                    miVista.Limpiar();
                }
            } else if (view.getId() == R.id.btnIngresar) {
                    clave = miVista.traerClave();
                    email = miVista.traerEmail();
                    if(ConsultarUsuario(email,clave)){
                        miVista.Limpiar();
                        Intent intent3 = new Intent(miActivity,ListaCategoria.class);
                        startActivity(intent3);
                    }else{
                        miDialogo.show(miActivity.getFragmentManager(),"dialogo");
                        miVista.Limpiar();
                    }
                }
    }

    public boolean ConsultarUsuario(String email, String clave) {
        Boolean respuesta=false;
        for(ModeloPrincipal mod:ListaUser){
            if (mod.getMiEmail().equals(email)&& (mod.getMiClave().equals(clave))){
                respuesta=true;
            }
        }
        return respuesta;
    }
}


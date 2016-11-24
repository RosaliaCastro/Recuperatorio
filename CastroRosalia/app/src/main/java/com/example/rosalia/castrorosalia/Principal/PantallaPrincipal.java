package com.example.rosalia.castrorosalia.Principal;

import android.app.DialogFragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.rosalia.castrorosalia.Lista.ListaCategoria;
import com.example.rosalia.castrorosalia.MiDialogo;
import com.example.rosalia.castrorosalia.R;

import java.util.ArrayList;
import java.util.List;

public class PantallaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        SharedPreferences preferences =getSharedPreferences("recordarme", Context.MODE_PRIVATE);
        if (this.ValidadPreferencia(preferences) ==true){
            EditText mail= (EditText)findViewById(R.id.editTextEmail);
            EditText clave=(EditText)findViewById(R.id.editTextClave);
            mail.setText(preferences.getString("email",""));
            clave.setText(preferences.getString("password",""));
            this.Ingresar();
        }

        List<ModeloPrincipal> myLista = new ArrayList<ModeloPrincipal>();
        myLista.add(new ModeloPrincipal("rosa@gmail.com", "1234"));
        myLista.add(new ModeloPrincipal("user1@gmail.com", "hola"));
        myLista.add(new ModeloPrincipal("castro@gmail.com", "laboratorio"));

        MiDialogo dialogo= new MiDialogo();

        ModeloPrincipal modeloPrincipal = new ModeloPrincipal();
        ControladorPrincipal controladorPrincipal = new ControladorPrincipal(modeloPrincipal,this,preferences,myLista, dialogo);
        VistaPrincipal vistaPrincipal = new VistaPrincipal(modeloPrincipal,this,controladorPrincipal);
        controladorPrincipal.setMiVista(vistaPrincipal);

    }

    public boolean ValidadPreferencia(SharedPreferences preferences){
        Boolean res=true;

        String dat1= preferences.getString("email","null");
        String dat2 = preferences.getString("password","null");
        if(dat1 != null && dat2 != null){
            res=false;
        }
        return res;
    }
    public void Ingresar(){
        Intent pantalla = new Intent(this, ListaCategoria.class);
        startActivity(pantalla);
    }
    //public void CargarNuevo(){
        //List<ModeloPrincipal> list = new ArrayList<ModeloPrincipal>();
        //Intent dat = getIntent();
        //Bundle extra = dat.getExtras();
        //String datos1=extra.getString("dat1");
        //String datos2=extra.getString("dat2");
        //list.add(new ModeloPrincipal(datos1, datos2));
        //ControladorPrincipal controladorPrincipal= new ControladorPrincipal(list);
    //}
}

package com.example.rosalia.castrorosalia.Principal;

/**
 * Created by Jona on 22/11/2016.
 */
public class ModeloPrincipal {

    public ModeloPrincipal(String email, String clave){
        miClave=clave;
        miEmail=email;
    }
    public ModeloPrincipal(){}

    private String miClave;
    private String miEmail;

    public String getMiClave() {
        return miClave;
    }

    public void setMiClave(String miClave) {
        this.miClave = miClave;
    }


    public String getMiEmail() {
        return miEmail;
    }

    public void setMiEmail(String miEmail) {
        this.miEmail = miEmail;
    }
}

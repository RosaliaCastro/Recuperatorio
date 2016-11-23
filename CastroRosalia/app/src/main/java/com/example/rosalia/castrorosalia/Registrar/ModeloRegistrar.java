package com.example.rosalia.castrorosalia.Registrar;

/**
 * Created by Jona on 22/11/2016.
 */
public class ModeloRegistrar {

    public ModeloRegistrar(String nom, String ape, String user,String e_mail, String password){
        nombre=nom;
        apellido=ape;
        usuario=user;
        email=e_mail;
        clave=password;
    }
    public ModeloRegistrar(){}


    private String nombre;
    private String apellido;
    private String usuario;
    private String email;
    private String clave;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getEmail(){return email;}

    public String getClave() {
        return clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setEmail(String email){this.email=email;}

    public void setClave(String clave) {
        this.clave = clave;
    }
}

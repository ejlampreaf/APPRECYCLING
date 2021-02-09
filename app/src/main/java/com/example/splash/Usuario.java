package com.example.splash;

public class Usuario {

    int id;

    String Correo, Contrasena, Nombre, Apellido;

    public Usuario() {

    }

    public Usuario(String correo, String contrasena, String nombre, String apellido) {
        Correo = correo;
        Contrasena = contrasena;
        Nombre = nombre;
        Apellido = apellido;
    }

    public boolean isNull(){
        if (Nombre.equals("")&&Apellido.equals("")&&Correo.equals("")&&Contrasena.equals("")){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", Correo='" + Correo + '\'' +
                ", Contrasena='" + Contrasena + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }
}

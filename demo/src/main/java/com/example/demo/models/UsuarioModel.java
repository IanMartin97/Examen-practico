package com.example.demo.models;

public class UsuarioModel {
    
private Integer Cliente_ID;
private String Nombre_Usuario;
private String contrasena;
private String Nombre;
private String Apellido;
private String Correo;
private Integer Edad;
private Decimalnumber Estatura;
private Decimalnumber peso;
private DecilmalNumber IMC;
private DecilmalNumber GEB;
private DecilmalNumber ETA;
private date fecha_creacion;
private date fecha_actualizacion;


public Integer getCliente_ID(){
    return Cliente_ID;
}

public void setNombre_Usuario(String Nombre_Usuario){
    this.nombre_usuario = nombre_usuario;
}

public String getNombre_Usuario(){
    return Nombre_Usuario;
}

public String getContrasena() {
    return contrasena;
}

public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
}


public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}


public String getApellido() {
    return apellido;
}

public void setApellido(String Apellido) {
    this.nombre = apellido;
}

public String getCorreo() {
    return correo;
}

public void setCorreo(String Correo) {
    this.correo = correo;
}

public Integre getEdad() {
    return edad;
}

public void setEdad(String Edad) {
    this.nombre = edad;
}



}

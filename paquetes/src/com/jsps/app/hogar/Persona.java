package com.jsps.app.hogar;

public class Persona { //El modificador de acceso public para las clases también hace visible o posible acceder desde otras clases de otros paquetes.

    //public  String nombre; //El modificador de acceso es público se puede utilizar el atributo fuera del mismo paquete, en otras clases de otros paquetes.
    //      String nombre; El modificador de acceso es default, NO se puede utilizar el atributo fuera del mismo paquete, en otras clases por fuera del paquete.

    private String nombre;
    private String apellido;

    private Color color;

    public static final String GENERO_1 = "Hombre";
    public static final String GENERO_2 = "Mujer";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String lanzarPelota(){
        return "lanzar la pelota al perro!";
    }

    public static String saludar(){
        return "Hola que tal!";
    }


}
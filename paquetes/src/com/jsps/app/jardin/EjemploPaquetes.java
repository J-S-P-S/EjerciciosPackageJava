package com.jsps.app.jardin;

//import com.jsps.app.hogar.Persona;    Se importa una clase específica del paquete
import com.jsps.app.hogar.*;            //Se importan todas las clases del paquete, solo se cargan en memoria cuando se declaran o crean objetos que hacen referencia a un método/atributo de la clase.
import static com.jsps.app.hogar.Persona.*; //Se importan todos los miembros de tipo estáticos del paquete.
import static com.jsps.app.hogar.Color.*;   //Se importan todos las constantes del enum

public class EjemploPaquetes {

    public static void main(String[] args) {

        //com.jsps.app.hogar.Persona persona = new com.jsps.app.hogar.Persona(); //Nombre completamente calificado, se  utiliza sin el import pero es la estructura menos utilizada.
        Persona persona = new Persona(); //Se realiza con el import, después de los package.
        persona.setNombre("js");
        persona.setApellido("ps");
        persona.setColor(RUBIO);
        System.out.println(persona.getNombre() + persona.getApellido());

        Perro perro = new Perro(); //No se importa, ya que, pertenece al mismo contexto, al mismo paquete.
        // El atributo, nombre tiene modificador de acceso default.
        // Pero como la clase Perro pertenece al mismo paquete que la clase EjemploPaquetes
        // Entonces el paquete com.jsps.app tiene las clases EjemploPaquetes y Perro.
        // Entre las 2 clases, se pueden compartir atributos y métodos que tengan modificador de acceso default y protected.
        perro.nombre = "Tobby";
        perro.raza = "Bulldog";
        // Pero si tienen modificador de acceso public se pueden acceder desde otras clases que están en otro paquete.
        // Es importante resaltada que protected también influye en la herencia de las clases padre.
        // Como buena práctica es mejor utilizar public o default desde que no se piense en implementar herencia en el proyecto.

        String jugando = perro.jugar(persona);
        System.out.println(jugando);

        String saludo = saludar();
        System.out.println(saludo);

        String genero = GENERO_1;
        System.out.println(genero);

    }
}
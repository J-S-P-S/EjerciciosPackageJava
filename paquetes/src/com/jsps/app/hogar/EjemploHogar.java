package com.jsps.app.hogar;

import com.jsps.app.jardin.Perro;
import static com.jsps.app.hogar.Persona.saludar; //Se utiliza cuando se implementa la opción 2

public class EjemploHogar {

    public static void main(String[] args) {
        Persona p = new Persona();
        Perro dog = new Perro();

        //String saludo = Persona.saludar(); //Opción 1, NO es necesario realizar el import static.
        String saludo = saludar();          // Opción 2


    }
}
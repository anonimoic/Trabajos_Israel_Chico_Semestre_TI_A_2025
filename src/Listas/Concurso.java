package Listas;

import java.util.ArrayList;
import java.util.List;

public class Concurso {
    public static void main(String[] args) {
        List<Persona> ListaPersonas = new ArrayList<>();
        Persona persona1= new Persona("Ana","F",20);
        Persona persona2= new Persona("Andres","F",25);
        Persona persona3= new Persona("Luis","M",18);
        ListaPersonas.add(persona1);
        ListaPersonas.add(persona2);
        ListaPersonas.add(persona3);
        //for (Persona persona : ListaPersonas) {
          //  System.out.println(persona.getNombre()); 


        //}
        for (Persona persona : ListaPersonas) {
            if (persona.getEdad()>21) {
                System.out.println(persona.getNombre());
            }
        }
    }

}

package Clases;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private Scanner tec;
    
    //
    public void Inicializar(){
        tec = new Scanner(System.in);
        System.out.print(" Ingrese el nombre: ");
        nombre = tec.next();
        System.out.print(" Ingrese la edad: ");
        edad = tec.nextInt();
    }

    public void imprimirdatos(){
        System.out.println("-----------Datos Impresos-----------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void imprimirSiEsMayorEdad(){
        if (edad>18) {
            System.out.println("Es mayor de edad");
        }
    }
    public static  void main(String[] args) {
        Persona persona_1 = new Persona();
        persona_1.Inicializar();
        persona_1.imprimirdatos();
        persona_1.imprimirSiEsMayorEdad();

        Persona persona_2 = new Persona();
        persona_2.Inicializar();
        persona_2.imprimirdatos();
        persona_2.imprimirSiEsMayorEdad();
    }
}

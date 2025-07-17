package Clases;
/* 
 * Ingresar los lados del triangulo
 * Imprimir los lados del triangulo
 * Imprimir lado mayor
 * Imprimir si es equilatero
 * Imprimir si el triangulo es correcto
*/

import java.util.Scanner;

public class Triangulo {
    private int l1,l2,l3;
    private Scanner tec;

    public void IngresarDatos(){
        tec = new Scanner(System.in);
        System.out.println("--Ingresar los Lados del Triangulo--");
        System.out.print("Ingrese el lado 1 del triangulo: ");
        l1 = tec.nextInt();
        System.out.print("Ingrese el lado 2 del triangulo: ");
        l2 = tec.nextInt();
        System.out.print("Ingrese el lado 3 del triangulo: ");
        l3 = tec.nextInt();
    }

    public void ImprimirDatos(){
        System.out.println("-- Imprimir los Lados del Triangulo --");
        System.out.println("Lado 1: " +l1);
        System.out.println("Lado 2: " +l2);
        System.out.println("Lado 3: " +l3);
    }

    public void ImprimirLadoMayor(){
        System.out.println("-- Imprimir el Lado Mayor del Triangulo --");
        if (l1>l2 && l1>l3) {
            System.out.print("El lado mayor es el lado 1: " +l1);    
        } else {if(l2>l3){
            System.out.println("El lado mayo es el lado 2: " +l2);  
        } else {System.out.println("El lado mayo es el lado 3: " +l3);  }
    }
    }

    public void ImprimirSiEsEquilatero(){
        System.out.println("-- Imprimir Si El Triangulo Es Equilatero --");
        if (l1 == l2 && l2 == l3) {
            System.out.println("El triangulo si es equilatero");
        } else {System.out.println("El triangulo NO es equilatero");}

    }

    public void ImprimirSiesCorrecto(){
        System.out.println("-- Imprimir Si El Triangulo Es Correcto --");
        if (l1+l2>l3 && l1+l3>l2 && l2+l3>l1) {
            System.out.println("El Triangulo es correcto");
        } else {System.out.println("El triangulo no es correcto");}
    }

    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo();
        triangulo1.IngresarDatos();
        triangulo1.ImprimirDatos();
        triangulo1.ImprimirLadoMayor();
        triangulo1.ImprimirSiEsEquilatero();
        triangulo1.ImprimirSiesCorrecto();
    }

}

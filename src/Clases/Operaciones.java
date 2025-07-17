package Clases;

import java.util.Scanner;

/*
 * ingresar 2 numeros
 * Suma , Resta , Multiplicacion , Division , Residuo
 */
public class Operaciones {
    private int v1;
    private int v2;
    private Scanner tec;

    public void IngresarLosDatos(){
        tec = new Scanner(System.in);
        System.out.println("-- Ingresar los datos --");
        System.out.print("Ingrese el valor 1: " );
        v1 = tec.nextInt();
        System.out.print("Ingrese el valor 2: " );
        v2 = tec.nextInt();
    }

    public void Potencia(){
        double resultado;
        resultado=Math.pow(v1, v2);
        System.out.println("Potencia: " +resultado);
    }
    public static void main(String[] args) {
        Operaciones oper1 = new Operaciones();
        oper1.IngresarLosDatos();
        oper1.Potencia();
    }
}

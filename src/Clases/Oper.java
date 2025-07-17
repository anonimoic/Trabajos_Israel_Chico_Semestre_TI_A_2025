package Clases;

import java.util.Scanner;

/*
 * ingresar 2 numeros
 * Suma , Resta , Multiplicacion , Division , Residuo
 */
public class Oper {
    public static void IngresarNumero(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int valor1=teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
         int valor2=teclado.nextInt();
         sumanumeros(valor1, valor2);
         restanumeros(valor1, valor2);
         multiplicacion(valor1, valor2);
         division(valor1, valor2);
         residuo(valor1, valor2);
    }
    public static void sumanumeros(double v1,double v2){
        double suma=0;
        suma=v1+v2;
        System.out.println("La suma de los dos numeros es: "+suma);
    }
    public static void restanumeros(double v1,double v2){
    double resta=0;
    resta=v1-v2;
    System.out.println("La resta de los numeros es: " +resta);
    } 
    public static void multiplicacion(double v1,double v2) {
      double multiplicacion=0;
    multiplicacion=v1*v2;
    System.out.println("La multiplicacion de los dos numeros es: "+multiplicacion);   
    }
    public static void division (double v1,double v2){
        double division=0;
        division=v1/v2;
        System.out.println("La division de los numeros es: " +division);
    }
    public static void residuo (double v1,double v2){
        double residuo=0;
        residuo=v1%v2;
        System.out.println("El residuo de los numeros es: "+residuo);
    }
    public static void main(String[] args) {
        IngresarNumero();

    }
}



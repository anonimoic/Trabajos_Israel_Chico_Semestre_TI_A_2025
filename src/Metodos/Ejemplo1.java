package Metodos;

import java.util.Scanner;

/*
 * Rengo inicial - Final
 * Imprimir los datos 
 * Cuantos numeros existen 
 * Sumatoria de los numeros 
 * Promedio de los valores
 */

public class Ejemplo1 {
    private int r_inicial , r_final;
    private Scanner tec;
    public void Ejecutar(){
        Scanner tec = new Scanner(System.in);
        double sumatoria,contador,promedio,celsius;
        System.out.println("Ingresar el rango inicial");
        r_inicial = tec.nextInt();
        System.out.println("Ingresar el rango final");
        r_final = tec.nextInt();
        System.out.println("-- Imprimir y Sumar los numeros --");
        sumatoria = SumaNumeros(r_inicial, r_final);
        System.out.println(" -- Imprimir cuantos numeros existen en ese rango --");
        contador= Contador(r_inicial, r_final);
        System.out.println("Existen " +String.format("%.0f", contador) +" numeros desde " +r_inicial +" hasta " +r_final );
        System.out.println(" -- Imprimir el promedio -- ");
        promedio = Promedio(sumatoria, contador);
        System.out.println("El promedio de los numeros es: " +promedio);
        System.out.println("Convertir de Celsius a Fahrenheit" );

    }

    public int SumaNumeros(int in , int fn){
        int suma=0;
        int cont=0;
        for (int i = in; i <= fn; i++) {
            System.out.print(" "+i +" - ");
            suma=suma+i;
            cont=cont+1;
        }
        System.out.println("");
        System.out.println("La suma es: " +suma);
        return suma;
    }
     public int Contador(int in , int fn){
        int suma=0;
        int cont=0;
        for (int i = in; i <= fn; i++) {
            suma=suma+i;
            cont=cont+1;
        }
        return cont;
    }

    public double Promedio(double s,double c){
        double p;
        p= s/c;
        return p;
    }

    public void CelsiusaFahrenheitSecuencia(){
        Ejercicio convertir = new Ejercicio();
        for (int i = r_inicial; i <= r_final; i++) {
            System.out.println(convertir.CelsiusaFahrenheit(i));
        }
    }
    public static void main(String[] args) {
        Ejemplo1 eje = new Ejemplo1();
        eje.Ejecutar();
        Ejemplo1 celsius = new Ejemplo1();
        eje.CelsiusaFahrenheitSecuencia();

    }

}

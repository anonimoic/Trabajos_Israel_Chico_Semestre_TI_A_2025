package Metodos;

import java.util.Scanner;

/*
 * Ingresar 3 valores
 * Imprimir los datos
 * Desplegar Cual es el Mayor
 */

public class MayorMenorv2 {
    private static int v1,v2,v3;
    public void CargarValores(){
        Scanner tec = new Scanner(System.in);
        
        System.out.println(" -- Lectura de Valores -- ");
        System.out.print("Ingrese el primer valor: ");
        v1 = tec.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        v2 = tec.nextInt();
        System.out.print("Ingrese el tercer valor: ");
        v3 = tec.nextInt();

    }

    public int CalcularMayor(int va1,int va2,int va3){
        int mayor=0;
        if (va1>va2 && va1>va3) {
            mayor=va1;
        } else {
            if (va2>va3) {
                mayor=va2;
            }else{
                mayor = va3;
            }
        }
        return mayor;
    }

    public int CalcularMenor(int va1,int va2,int va3){
        int menor=0;
         if (va1<va2 && va1<va3) {
            menor=va1;
        } else {
            if (va2<va3) {
                menor=va2;
            }else{
                menor = va3;
            }
        }
        return menor;
    }
    public static void main(String[] args) {
        MayorMenor mayorMenor= new MayorMenor();
        mayorMenor.CargarValores();
        int NumeroMayor,NumeroMenor;
        //Imprimir Valores
        //System.out.println("Valor 1: " +v1);
       // System.out.println("Valor 2: " +v2);
       // System.out.println("Valor 3: " +v3);

        //Invocar a los metodos de mayor y menor
        NumeroMayor= mayorMenor.CalcularMayor(v1, v2,v3);
        System.out.println("Numero mayor: " +NumeroMayor);
        NumeroMenor= mayorMenor.CalcularMenor(v1, v2, v3);
        System.out.println("Numero menor: " +NumeroMenor);
    }
}

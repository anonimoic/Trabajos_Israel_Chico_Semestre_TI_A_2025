package Clases;

import java.util.Scanner;

/*
 * Ingresar Coordenada X , Y
 * Imprimir en que cuadrante se encuentra
 */

public class Punto {
    private int x , y;
    private Scanner tec;

    public void IngresarCoordenadas(){
        tec = new Scanner(System.in);
        System.out.println("-- Ingresar Coordenadas --");
        System.out.println("Ingresa la coordenada en X");
        x = tec.nextInt();
        System.out.println("Ingresa la coordenada en Y");
        y = tec.nextInt();
    }

    public void ImprimirElCuadrante(){
        System.out.println("-- Imprimir El Cuadrante --");
        if (x==0 && y==0) {
            System.out.println("Se encuentra en el punto de origen");
        }
        if (x>0 && y>0) {
            System.out.println("Cuadrante 1");
        } else {if (x>0 && y<0) {
                System.out.println("Cuadrante 4");
            }else {
            if (x<0 && y>0) {
                System.out.println("Cuadrante 2");
            } else {if (x<0 && y<0) {
                System.out.println("Cuadrante 3");}}}
        }
    }

    public static void main(String[] args) {
        Punto punto1 = new Punto();
        punto1.IngresarCoordenadas();
        punto1.ImprimirElCuadrante();
    }
}

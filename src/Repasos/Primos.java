package Repasos;

import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int sumaprimos=0;
        System.out.println("Ingresar el rango inicial");
        int r_inicial = tec.nextInt();
        System.out.println("Ingresar el rango final");
        int r_final = tec.nextInt();
        for (int i = r_inicial; i <= r_final; i++) {
            //System.out.println(i);
            boolean primo = true;
            for (int j = 2; j < i ; j++) {
                if (i%j==0) {
                    primo=false;
                    break;
                }
            } 
            if (primo) {
                System.out.println("El numero " +i +" ES PRIMO");
                sumaprimos=sumaprimos+i;
            }
        }
        System.out.println("La suma de los primos es: " +sumaprimos);
    }

}

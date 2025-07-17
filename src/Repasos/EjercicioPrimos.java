package Repasos;

import java.util.Scanner;

public class EjercicioPrimos {
    public static boolean esPrimo (int numero){
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingresar el rango inicial");
        int r_inicial = tec.nextInt();
        System.out.println("Ingresar el rango final");
        int r_final = tec.nextInt();
        int contadorPrimos = 0;
        for (int i = r_inicial; i <= r_final; i++) {
            if (esPrimo(i)) {
                contadorPrimos=contadorPrimos+1;
            }
        }
        int[] primos = new int[contadorPrimos];
        int indice = 0;
        for (int i = r_inicial; i <= r_final; i++) {
            if (esPrimo(i)) {
                primos[indice] = i;
                indice++;
            }
        }
        //for (int i = 0; i < primos.length; i++) {
            //System.out.println(primos[i]);
        //}
        System.out.println(primos[4]);
        
    }

}

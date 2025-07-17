package Repaso;

import java.util.Random;

/*
 * Array 5 posiciones 
 * Valores aleatorios [1-10]
 * Calcular el promedio 
 * Multiplicar todos los numeros dentro del vector 
 */
public class Melanie {

    public static void main(String[] args) {
        double[] vector = new double[5];
        llenarvector(vector);
        imprimirvector(vector);
        promedio(vector);
        multiplicacion(vector);
        mayor(vector);
        menor(vector);

    }

    public static void llenarvector(double _vector[]) {
        System.out.println("Ingreso de datos ");
        Random rd = new Random();
        for (int i = 0; i < _vector.length; i++) {
            _vector[i]= rd.nextInt(1,20);
            _vector[i] = rd.nextInt(1, 10);
        }
    }

    public static void imprimirvector(double _vector[]) {
        for (int i = 0; i < _vector.length; i++) {
            System.out.println(_vector[i]);

        }

    }

    public static void promedio(double _vector[]) {
        double contador = 0, suma = 0, promedio;
        for (int i = 0; i < _vector.length; i++) {
            contador += 1;
            suma += _vector[i];

        }

    }

    public static void multiplicacion(double _vector[]) {
        double multiplicacion = 1;
        for (int i = 0; i < _vector.length; i++) {
            multiplicacion *= _vector[i];
        }
        System.out.println(multiplicacion);
    }

    public static void mayor(double _vector[]) {
        System.out.println("numero mayor");
        double mayor = _vector[0];
        for (int i = 0; i < _vector.length; i++) {

            if (_vector[i] > mayor) {
                mayor = _vector[i];

            }

        }
        System.out.println(mayor);

    }
    public static void menor (double _vector[]){
        double menor = _vector[0];
        for (int i = 0; i < _vector.length; i++) {
            if (_vector[i] < menor) {
                menor=_vector[i];
                
            }
            
        }
        System.out.println(menor);
    }

}

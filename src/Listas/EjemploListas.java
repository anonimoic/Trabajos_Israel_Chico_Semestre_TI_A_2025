package Listas;

import java.util.ArrayList;
import java.util.List;

public class EjemploListas {
    
    public static void main(String[] args) {
        //Crear 
        List<String> Listanombres = new ArrayList<>();
        List<Integer> Listanumeros = new ArrayList<>();

        //Agregar elementos a la lista
        Listanombres.add("Juan");
        Listanombres.add("Ana");
        Listanombres.add("Andrea");

        Listanumeros.add(10);      
        Listanumeros.add(20);           
        Listanumeros.add(30);            
        Listanumeros.add(0, 40);        
        Listanumeros.add(50);           
        Listanumeros.add(2, 60);        

        //Imprimir listas
        System.out.println(Listanombres);
        System.out.println(Listanumeros);

        //forEach
        for (String nombre : Listanombres) {
            System.out.println(nombre);
        }
        for (Integer x : Listanumeros) {
            System.out.println(x);
        }
        System.out.println("---Multiplo de 8 ---");
        int contador=0;
        for (Integer x : Listanumeros) {
            if (x%8==0) {
                System.out.println("Multiplo = " +x);
                contador++;
            }
        }
        System.out.println(" Se encontraron = " +contador +" numeros divisivles para 8");

        System.out.println("---Buscando a Ana ---");
        for (String nombre : Listanombres) {
            if (nombre=="Ana") {
                System.out.println("Ana si existe ");
            }
        }
        System.out.println("\n");
        //--------------------------------------------------------------------------------------
        /*
         * 2 Grupos
         * Promedio del curso
         * Promedio de los alumnos <7 - Cuantos son
         */
        List<Double> notasG1 = new ArrayList<>();
        List<Double> notasG2 = new ArrayList<>();
        List<Double> notastotales = new ArrayList<>();

        notasG1.add(10.0);
        notasG1.add(9.0);
        notasG1.add(4.0);
        notasG1.add(3.0);

        notasG2.add(8.5);
        notasG2.add(7.4);
        notasG2.add(2.3);
        notasG2.add(5.5);

        notastotales.addAll(notasG1);
        notastotales.addAll(notasG2);
        System.out.println(notastotales);
        //promedio
        double sumatoria=0;
        for (Double nota : notastotales) {
            sumatoria+=nota;
        }
        double promedio=sumatoria/notastotales.size();
        System.out.println("El promedio del curso es: "+promedio);

        sumatoria=0;
        promedio=0;
        contador=0;
        for (Double nota : notastotales) {
            if (nota<7) {
                sumatoria+=nota;
                contador++;
            }
        }
        promedio=sumatoria/contador;
        System.out.println("Promedio = " +promedio + " - Numero de estudiantes = " +contador);



    }
}

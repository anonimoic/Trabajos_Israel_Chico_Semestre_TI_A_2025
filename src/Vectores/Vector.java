package Vectores;

public class Vector {

    public static void ImprimirLongitud(int[] vecotr) {
        System.out.println(vecotr.length);

    }

    public static void ImprimirVectoresEnteros(int[] vector) {
        System.out.println("Imprimir vector ");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static void ImprimirVectooresDouble(double[] vector) {
        System.out.println("Imprimir vector ");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static double Suma(double[] vector) {
        double suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
        }
        System.out.println(suma);
        return suma;
    }

    public static double Contador(double[] vector) {
        double cont = 0;
        for (int i = 0; i < vector.length; i++) {
            cont = cont + 1;
        }
        System.out.println(cont);
        return cont;
    }

    public static double Promedio(double s, double c) {
        double promedio = s / c;
        System.out.println(promedio);
        return promedio;
    }

    public static void main(String[] args) {
        int[] edades = new int[6];
        edades[0] = 5;
        edades[1] = 6;
        edades[2] = 2;
        edades[3] = 8;
        edades[4] = 7;
        edades[5] = 9;

        String[] profesores = new String[2];
        profesores[0] = "Hernan";
        profesores[1] = "Ruben";

        //Netodo 2 .- Valores preestablecidos 
        double[] calificaciones = new double[]{5.4, 7.8, 6.7, 9.2, 8.1, 2.4, 8.1};
        int[] estaturas = {165, 172, 152, 160, 187, 184, 142, 145, 100};

        //Metodo 3 .- Bajo demanda 
        // declarar el vecotr
        int[] delito;
        int longitudVector = 4;
        //Instanciar
        delito = new int[longitudVector];
        delito[0] = 1500;
        delito[1] = 1000;
        delito[2] = 1200;
        delito[3] = 1600;
        System.out.println("Vector edades = " + edades.length);
        ImprimirLongitud(delito);

        //Imprimir vector edades
        //ImprimirVectoresEnteros(edades);
        //ImprimirVectoresEnteros(delito);
        //ImprimirVectoresEnteros(estaturas);
        System.out.println("Imprimir Calificaciones");
        ImprimirVectooresDouble(calificaciones);
        System.out.println("");
        System.out.print("Suma de calificaciones: ");
        double s = Suma(calificaciones);
        System.out.println("");
        System.out.print("Numero de notas: ");
        double c = Contador(calificaciones);
        System.out.println("");
        System.out.println("El promedio de todas las notas es: ");
        Promedio(s, c);
    }
}

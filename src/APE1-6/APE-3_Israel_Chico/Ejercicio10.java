import java.util.Scanner;

public class Ejercicio10 {
    public static double calcularAreaBase(double lado) {
        return Math.pow(lado, 2);
    }

    public static double calcularAreaLateral(double lado) {
        return 4 * Math.pow(lado, 2);
    }

    public static double calcularAreaTotal(double lado) {
        return 6 * Math.pow(lado, 2);
    }

    public static double calcularVolumen(double lado) {
        return Math.pow(lado, 3);
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in); 

        System.out.print("Ingrese el lado del hexaedro (cubo): ");
        double lado = tec.nextDouble();

        double areaBase = calcularAreaBase(lado);
        double areaLateral = calcularAreaLateral(lado);
        double areaTotal = calcularAreaTotal(lado);
        double volumen = calcularVolumen(lado);

        System.out.println("Área de la base: " + areaBase);
        System.out.println("Área lateral: " + areaLateral);
        System.out.println("Área total: " + areaTotal);
        System.out.println("Volumen: " + volumen);
    }
}


import java.util.Scanner;

public class Ejercicio11 {

    public static double calcularAreaTriangulo(double x1, double y1, double x2, double y2, double x3, double y3) {
        return 0.5 * Math.abs(x1 * (y2 - y3) + 
                              x2 * (y3 - y1) + 
                              x3 * (y1 - y2));
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese x1: ");
        double x1 = tec.nextDouble();
        System.out.print("Ingrese y1: ");
        double y1 = tec.nextDouble();

        System.out.print("Ingrese x2: ");
        double x2 = tec.nextDouble();
        System.out.print("Ingrese y2: ");
        double y2 = tec.nextDouble();

        System.out.print("Ingrese x3: ");
        double x3 = tec.nextDouble();
        System.out.print("Ingrese y3: ");
        double y3 = tec.nextDouble();

        double area = calcularAreaTriangulo(x1, y1, x2, y2, x3, y3);

        System.out.println("--------------------------------");
        System.out.println("El área del triángulo es: " + area);
    }

}


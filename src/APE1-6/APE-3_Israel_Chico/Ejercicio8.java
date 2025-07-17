
import java.util.Scanner;


public class Ejercicio8 {
    public static double calcularAreaBase(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double calcularAreaLateral(double r, double g) {
        return Math.PI * r * g;
    }

    public static double calcularVolumen(double r, double h) {
        return (1.0 / 3) * Math.PI * Math.pow(r, 2) * h;
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Ingrese el radio del cono: ");
        double radio = tec.nextDouble();

        System.out.print("Ingrese la generatriz del cono: ");
        double generatriz = tec.nextDouble();

        System.out.print("Ingrese la altura del cono: ");
        double altura = tec.nextDouble();

        double areaBase = calcularAreaBase(radio);
        double areaLateral = calcularAreaLateral(radio, generatriz);
        double areaTotal = areaBase + areaLateral;
        double volumen = calcularVolumen(radio, altura);

        System.out.println("Área de la base: " + areaBase);
        System.out.println("Área lateral: " + areaLateral);
        System.out.println("Área total: " + areaTotal);
        System.out.println("Volumen: " + volumen);
    }
}


import java.util.Scanner;

public class Ejercicio9 {
    
    public static double calcularArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double calcularVolumen(double r) {
        return (4.0 / 3) * Math.PI * Math.pow(r, 3);
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese el radio de la esfera: ");
        double radio = tec.nextDouble();

        double area = calcularArea(radio);
        double volumen = calcularVolumen(radio);

        System.out.println("Área de la esfera: " + area);
        System.out.println("Volumen de la esfera: " + volumen);
    }
}


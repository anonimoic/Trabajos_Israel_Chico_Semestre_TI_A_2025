import java.util.Scanner;

public class Ejercicio12 {
        public static double calcularAreaBase(double perimetro, double apotema) {
        return (perimetro * apotema) / 2;
    }

    public static double calcularAreaLateral(double perimetro, double altura) {
        return perimetro * altura;
    }

    public static double calcularAreaTotal(double areaBase, double areaLateral) {
        return 2 * areaBase + areaLateral;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese el perímetro de la base: ");
        double perimetro = tec.nextDouble();

        System.out.print("Ingrese el apotema del pentágono: ");
        double apotema = tec.nextDouble();

        System.out.print("Ingrese la altura del prisma: ");
        double altura = tec.nextDouble();

        double areaBase = calcularAreaBase(perimetro, apotema);
        double areaLateral = calcularAreaLateral(perimetro, altura);
        double areaTotal = calcularAreaTotal(areaBase, areaLateral);
        System.out.println("Área de la base: " + areaBase);
        System.out.println("Área lateral: " + areaLateral);
        System.out.println("Área total: " + areaTotal);
    }


}

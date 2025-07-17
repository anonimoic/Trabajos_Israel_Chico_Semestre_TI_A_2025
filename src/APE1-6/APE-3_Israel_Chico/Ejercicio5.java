
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese la nota 1");
        double nota1= tec.nextDouble();
        System.out.println("Ingrese la nota 2");
        double nota2=  tec.nextDouble();
        System.out.println("Ingrese la nota 3");
        double nota3= tec.nextDouble();;
        calcularPromedioDosMayores(nota1, nota2, nota3);
    }


    public static void calcularPromedioDosMayores(double n1, double n2, double n3) {
        double menor;


        if (n1 <= n2 && n1 <= n3) {
            menor = n1;
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;
        } else {
            menor = n3;
        }

        double sumaDosMayores = n1 + n2 + n3 - menor;
        double promedio = sumaDosMayores / 2;

        System.out.println("El promedio de las dos notas mayores es: " + promedio);
    }
}

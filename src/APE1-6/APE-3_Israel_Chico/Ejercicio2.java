
import java.util.Scanner;

public class Ejercicio2 {

    public static int sumarCincoNumeros(int numero1, int numero2, int numero3, int numero4, int numero5) {
        return numero1 + numero2 + numero3 + numero4 + numero5;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese el primer numero ");
        int num1 = tec.nextInt();
        System.out.println("Ingrese el segundo numero ");
        int num2 = tec.nextInt();
        System.out.println("Ingrese el tercer numero ");
        int num3 = tec.nextInt();
        System.out.println("Ingrese el cuarto numero ");
        int num4 = tec.nextInt();
        System.out.println("Ingrese el quinto numero ");
        int num5 = tec.nextInt();

        int suma = sumarCincoNumeros(num1, num2, num3, num4, num5);
        System.out.println("La suma de los cinco números es: " + suma);
    }
}


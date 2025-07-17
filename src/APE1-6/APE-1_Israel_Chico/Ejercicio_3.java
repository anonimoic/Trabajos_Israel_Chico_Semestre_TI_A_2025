import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        System.out.println("Ingrese el número que desea saber si es par o no");
        double n = tec.nextDouble();
        double r= n%2;
        if (r==0) {
            System.out.println("El número es PAR");
        } else { if (r!=0) {
            System.out.println("El número es IMPAR");
        }}

    }

}

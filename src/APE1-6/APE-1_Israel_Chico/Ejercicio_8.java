import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double n1 = tec.nextDouble();
        System.out.println("Ingrese el primer numero");
        double n2 = tec.nextDouble();
        System.out.println("Ingrese el primer numero");
        double n3 = tec.nextDouble();
        if (n1<=n2 && n2<=n3) {
            System.out.println("Los numeros estan ordenados en manera ascendente");
           }
    }

}

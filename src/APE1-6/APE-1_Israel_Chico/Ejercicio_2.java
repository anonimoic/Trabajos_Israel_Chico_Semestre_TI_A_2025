import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        System.out.println("Ingrese el numero que desea realizar la raiz cuadrada");
        double n = tec.nextInt();
        double rn= Math.sqrt(n);
        System.out.println("La raiz cuadrada de " +n +" es: " +rn);    
    }

}

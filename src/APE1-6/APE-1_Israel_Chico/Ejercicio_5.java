import java.util.Scanner;

public class Ejercicio_5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el primer número");
        double n1 = teclado.nextDouble();
        System.out.println("Ingrese el segundo número");
        double n2 = teclado.nextDouble();
        double r = n1 % n2;
        if (r==0) {
            System.out.println("El número 1 si es divisible para el número 2"); 
        } else{System.out.println("El numero" +n1 +" NO es divisible para el numero" +n2);}


    }

}

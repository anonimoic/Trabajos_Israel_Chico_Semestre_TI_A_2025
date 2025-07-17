import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
         // Pedir los dos números
         System.out.println("Ingrese el primer número: ");
         int a = tec.nextInt();
 
         System.out.print("Ingrese el segundo número: ");
         int b = tec.nextInt();
 
         int oa = a;
         int ob = b;
 
         while (b != 0) {
             int resto = a % b;
             a = b;
             b = resto;
         }

         System.out.println("El MCD de " + oa + " y " + ob + " es: " + Math.abs(a));
 
    }

}

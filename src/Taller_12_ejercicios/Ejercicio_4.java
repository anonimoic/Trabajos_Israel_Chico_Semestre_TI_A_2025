import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Ingresa un número en base 10: ");
        int numero = tec.nextInt();

        System.out.print("Ingresa la base destino (menor que 10): ");
        int base = tec.nextInt();

        if (base >= 10 || base < 2) {
            System.out.println("La base debe ser mayor o igual a 2 y menor que 10.");
        } else {
            int num = Math.abs(numero);
            String resultado = "";

            while (num > 0) {
                int residuo = num % base;
                resultado = residuo + resultado;
                num = num / base;
            }

            if (numero == 0) {
                resultado = "0";
            } else if (numero < 0) {
                resultado = "-" + resultado; 
            }

            System.out.println("El número en base " + base + " es: " + resultado);
    }

}
}

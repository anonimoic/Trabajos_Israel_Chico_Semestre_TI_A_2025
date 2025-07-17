import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = tec.nextInt();

        System.out.print("Ingresa el dígito que deseas buscar (0-9): ");
        int db = tec.nextInt();

        if (db < 0 || db > 9) {
            System.out.println("Debes ingresar un solo dígito entre 0 y 9.");
        } else {
            boolean encontrado = false;
            int num = Math.abs(numero);

            while (num > 0) {
                int digito = num % 10;
                if (digito == db) {
                    encontrado = true;
                    break; 
                }
                num = num / 10; 
            }

            if (encontrado) {
                System.out.println("El dígito " + db + " sí está en el número.");
            } else {
                System.out.println("El dígito " + db + " no está en el número.");
            }
        }
    }

}

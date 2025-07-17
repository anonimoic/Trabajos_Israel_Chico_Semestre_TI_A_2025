import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = tec.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = tec.nextInt();
        int sd1 = 0;
        int sd2 = 0;
        int i = 1;
        do {
            if (num1 % i == 0) {
                sd1 += i;
            }
            i++;
        } while (i < num1);

        int j = 1;
        do {
            if (num2 % j == 0) {
                sd2 += j;
            }
            j++;
        } while (j < num2);

        if (sd1 == num2 && sd2 == num1) {
            System.out.println(num1 + " y " + num2 + " son números amigos.");
        } else {
            System.out.println(num1 + " y " + num2 + " no son números amigos.");
        }
    }
}

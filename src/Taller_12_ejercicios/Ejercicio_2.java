import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int cp=0;
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese el numero ");
        int num = tec.nextInt();
        while (num > 0) {
            int digito = num % 10; 
            if (digito % 2 == 0) { 
                cp++;
            }
            num = num / 10; 
    }        System.out.println("Cantidad de dígitos pares: " + cp);
    }

}

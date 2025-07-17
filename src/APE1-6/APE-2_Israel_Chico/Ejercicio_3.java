import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea invertir ");
        int n = tec.nextInt();
        int inv=0;
        int num = Math.abs(n);
        while (num>0) {
            int digito = num % 10;  
            inv = inv * 10 + digito; 
            num = num / 10; 
        }

        if (n < 0) {
            inv = -inv; 
        }
        System.out.println("El inverso del número es: " + inv);
    }

}

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int a = 0;
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese el rango minimo");
        int r1 = tec.nextInt();
        System.out.println("Ingrese el rango maximo");
        int r2 = tec.nextInt();
        while (r1<=r2) {
            for (int i = r1; i <= r2; i++) {
                System.out.println(i);
                r1=r1+1;
                a=a+1;
            }
            
        }
        System.out.println("En esta secuencia existen " +a +" VALORES");
    }

}

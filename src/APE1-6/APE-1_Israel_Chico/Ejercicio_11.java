import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el monto a pagar");
        double m= teclado.nextDouble();
        if (m>=100) {
            System.out.println("TIENE UN DESCUENTO DE 10%");
            double d=0.10;
            double pf=m-(m*d);
            System.out.println("El precio final es:"+pf);

            
        } else {if (m>=500) {
            System.out.println("TIENE UN DESCUENTO DE 20%");
            double d=0.20;
            double pf=m-(m*d);
            System.out.println("El precio final es:"+pf);
            
        }}
    }

}

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese la nota");
        double n = teclado.nextDouble();
        if (n>90) {

            System.out.println("Su nota equivale a: A");
            
        }else{if (n<90 && n>=80) {
            System.out.println("Su nota equivale a: B");
            
        }else {if (n<80 && n>=70) {
            System.out.println("Su nota equivale a: C ");
            
        } else{if (n<70 && n>=69) {
            System.out.println("Su nota equivale a: D");
            
        } else{if (n<69) {
            System.out.println("Su nota equivale a: E");
            
        }}}}}
    }

}

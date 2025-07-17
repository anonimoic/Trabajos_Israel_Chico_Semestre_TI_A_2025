import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el lado 1");
        double l1=teclado.nextDouble();
        System.out.println("Ingrese el lado 2");
        double l2=teclado.nextDouble();
        System.out.println("Ingrese el lado 3");
        double l3=teclado.nextDouble();
        if (l1==l2 && l1==l3) {
            System.out.println("Es un triangulo equilatero");
            
        } else {if (l1==l2 || l1==l3) {
            System.out.println("Es un triangulo isosceles");
            
        }else if (l1!=l2 && l1!=l3) {
            System.out.println("Es un triangulo escaleno");
            
        }}
    }

}

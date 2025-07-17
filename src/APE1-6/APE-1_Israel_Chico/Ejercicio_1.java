import java.util.Scanner;

public class Ejercicio_1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        System.out.println("Ingrese el primer número: ");
        double n1 = tec.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double n2 = tec.nextDouble();
        System.out.println("Ingrese el tercer número: ");
        double n3 = tec.nextDouble();
        double nm;
        nm=0;
        if (n1>n2 && n1<n3 || n1<n2 && n1>n3) {
            nm=n1;}
            else { if (n2>n1 && n2<n3 || n2<n1 && n2>n3) {
                nm=n2;   
            }else {nm=n3;}}
        System.out.println("El número central es: " +nm);
    }

}

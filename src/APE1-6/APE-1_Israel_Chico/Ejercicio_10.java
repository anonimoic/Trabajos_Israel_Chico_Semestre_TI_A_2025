import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner tec= new Scanner (System.in);
        System.out.println("Ingrese el primer numero");
        double n1 = tec.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double n2 = tec.nextDouble();
        System.out.println("Ingrese que operacion desea realizar");
        System.out.println(" -- 1 : Suma -- ");
        System.out.println(" -- 2 : Resta --");
        System.out.println(" -- 3 : Multiplicacion --");
        System.out.println(" -- 4 : Division --");
        int op = tec.nextInt();
        switch (op) {
            case 1:
                System.out.println("SUMA");
                double r1=n1+n2;
                System.out.println("El resultado de la suma es:"+r1);

            case 2:
                System.out.println("Resta");
                double r2=n1-n2;
                System.out.println("El resultado de la resta es:"+r2);


            case 3:
                System.out.println("Multiplicacion");
                double  r3 =n1*n2;
                System.out.println("El resultado de la multiplicacion es:"+r3);


            case 4:
                System.out.println("Division");
                double r4=n1/n2;
                double r=n1%n2;
                if (r==0) {
                    System.out.println("El resultado de la division es:"+r4);

                    
                } else System.out.println("No se puede realizar la operacion");
                
            
            default:
                break;
        }
    }

}




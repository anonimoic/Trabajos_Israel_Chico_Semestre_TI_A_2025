package Constructores;

import java.util.Scanner;

/*
 * Soluciones para una ecuacion cuadratica de segundo grado 
 */
public class FuncionCuadratica {
    public int a;
    public int b;
    public int c;
    //public FuncionCuadratica(int _a , int _b , int _c){
        //a=_a;
        //b=_b;
        //c=_c;
    //}
    public void CargarEcuacion(){
        Scanner tec = new Scanner(System.in);
        System.out.println("-- FUNCION CUADRATICA --");
        System.out.println("Ingrese el valor de a");
        int a = tec.nextInt();
        if (a<= 0) {
            System.out.println("a no puede ser igual a 0");
        }
        System.out.println("Ingrese el valor de b");
        int b = tec.nextInt();
        System.out.println("Ingrese el valor de c");
        int c = tec.nextInt();
        System.out.println("Su funcion es: ");
        System.out.println(a +"x^2 " +b +"x " +c +"= 0");
        System.out.println(" -- Resolver la primera solucion ");
        double x1 = ResolverEcuacion(a, b, c);
        System.out.println(x1);
        System.out.println(" -- Resolver la segunda solucion ");
        double x2 = ResolverEcuacion2(a, b, c);
        System.out.println(x2);
    }
    public double ResolverEcuacion(double a, double b, double c ){
        double res1=0;
        double b2 = Math.pow(b, 2);
        double r =b2-(4*a*c);
        if (r<0) {
            System.out.println("Tiene raices imaginarias");
        } else {res1 = (-(b) +Math.sqrt(b2-(4*a*c)))/2*a; }
        return res1;
    }
    public double ResolverEcuacion2(double a, double b, double c ){
        double res2=0;
        double b2 = Math.pow(b, 2);
        res2 = (-(b) -Math.sqrt(b2-(4*a*c)))/2*a; 
        return res2;
    }
    public static void main(String[] args) {
        FuncionCuadratica ecu1 = new FuncionCuadratica();
        ecu1.CargarEcuacion();
        
    }

}

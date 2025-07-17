
import java.util.Scanner;

public class Ejercicio3 {
    private int r_inicial, r_final;
    public void Iniciar(){
        double promediopares;
        Scanner tec = new Scanner(System.in);
        int cont,suma,contadorpares,sumapar;
        double promedio;
        System.out.println("Ingresar el rango inicial");
        r_inicial = tec.nextInt();
        System.out.println("Ingresar el rango final");
        r_final = tec.nextInt();
        System.out.println(" -- Total de numero -- ");
        suma = TotalNumeros(r_inicial, r_final);
        System.out.println(" -- Imprimir cuantos numeros existen en ese rango --");
        cont= Contador(r_inicial, r_final);
        System.out.println("Existen " +cont +" numeros desde " +r_inicial +" hasta " +r_final );
        System.out.println(" ");
        System.out.println(" -- Imprimir el promedio -- ");
        promedio = Promedio(suma, cont);
        System.out.println("El promedio de los numeros es: " +promedio);
        System.out.println(" ");
        System.out.println(" -- Calcular el promedio de los numeros pares -- ");
        contadorpares = NumerosPares(r_inicial, r_final);
        sumapar = SumaPares(r_inicial, r_final);
        promediopares = PromedioPares(sumapar, contadorpares);
        System.out.println("El promedio de los numeros pares es: " +promediopares);
        System.out.println(" ");
        System.out.println(" -- Calcular el promedio de los numeros impares -- ");
        double contadorimpares = NumerosImpares(r_inicial, r_final);
        double sumaimpar = SumaImpares(r_inicial, r_final);
        double promedioimpares = Promedio(sumaimpar, contadorimpares);
        System.out.println("El promedio de los numeros impares es: " +promedioimpares);
        System.out.println(" ");
        System.out.println(" -- Calcular el promedio de los numeros primos -- ");
        double contadorprimos = NumerosPrimos(r_inicial, r_final);
        double sumaprimos = Sumaprimos(r_inicial, r_final);
        double promedioprimos = Promedio(sumaprimos, contadorprimos);
        System.out.println("El promedio de los numeros primos es: " +promedioprimos);
        

    } 

    public int TotalNumeros (int ri , int rf){
        int suma=0;
        int cont=0;
        for (int i = ri; i <= rf; i++) {
            System.out.print(" "+i +" - ");
            cont=cont+1;
            suma=suma+i;
        }
        System.out.println(" ");
        return suma;
    }
    public int Contador(int in , int fn){
        int suma=0;
        int cont=0;
        for (int i = in; i <= fn; i++) {
            suma=suma+i;
            cont=cont+1;
        }
        return cont;
    }
    public double Promedio(double s,double c){
        double p;
        p= s/c;
        return p;
    }
    public int NumerosPares(int ri , int rf){
        int cp=0;
        for (int i = ri; i <= rf; i++) {
            if (i%2==0) {
                cp=cp+1;
            }
        }
        System.out.println("Existen " +cp +" numeros pares desde " +ri +" hasta " +rf );
        return cp;
    }
    public int SumaPares(int ri , int rf){
        int sm=0;
        for (int i = ri; i <= rf; i++) {
            if (i%2==0) {
                sm=sm+i;
            }
        }
        System.out.println("La suma de numeros pares es igual a: " +sm );
        return sm;
    }
     public double PromedioPares(double s,double c){
        double p;
        p= s/c;
        return p;
    }
    public int NumerosImpares(int ri , int rf){
        int cip=0;
        for (int i = ri; i <= rf; i++) {
            if (i%2!=0) {
                cip=cip+1;
            }
        }
        System.out.println("Existen " +cip +" numeros pares desde " +ri +" hasta " +rf );
        return cip;
    }
    public int SumaImpares(int ri , int rf){
        int sim=0;
        for (int i = ri; i <= rf; i++) {
            if (i%2!=0) {
                sim=sim+i;
            }
        }
        System.out.println("La suma de numeros impares es igual a: " +sim );
        return sim;
    }
    public int NumerosPrimos(int ri , int rf){
        int cpr=0;
        for (int i = ri; i <= rf; i++) {
           boolean primo = true;
           for (int j = 2; j < i; j++) {
                if (i%j == 0){
                    primo= false;
                    break;
                }
           }
           if (primo) {
                    cpr=cpr+1;
                }
        }
        System.out.println("Existen " +cpr +" numeros primos desde " +ri +" hasta " +rf );
        return cpr;
    }
    public int Sumaprimos(int ri , int rf){
        int suma=0;
        for (int i = ri; i <= rf; i++) {
           boolean primo = true;
           for (int j = 2; j < i; j++) {
                if (i%j == 0){
                    primo= false;
                    break;
                }
           }
           if (primo) {
                    suma=suma+i;
                }
        }
        System.out.println("La suma de numeros primos es " +suma );
        return suma;
    }
    public static void main(String[] args) {
        Ejercicio3 obj = new Ejercicio3();
        Scanner tec = new Scanner(System.in);
        int r=6;
        while (r==6) {
            obj.Iniciar();
            System.out.println(" ");
            System.out.println("¿Desea ejecutar de nuevo el programa?");
            System.out.println(" 1 : Si \n 2: No");
            int res = tec.nextInt();
            if (res == 1) {
                r=6;
            } else {
                r=2;
            }
        }
    }
}


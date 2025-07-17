package Repaso;

import java.util.Scanner;


public class Calculadora { 

        public static void sumarnumeros (int n1_, int n2_){
            System.out.println("Suma");
            int suma=0;
            suma=n1_+n2_;
            System.out.println(suma);

        }
        public static void multiplicacion(int n1_ , int n2_){
            System.out.println("multiplicacion");
            int multiplicacion=1;
            multiplicacion=n1_*n2_;
            System.out.println(multiplicacion);
        }
          public static void restanumeros (int n1_, int n2_){
            System.out.println("Resta");
            int resta=0;
            resta=n1_-n2_;
            System.out.println(resta);

        }
          public static void divisionnumeros (int n1_, int n2_){
            System.out.println("DIVISION");
            int division;
            division=n1_/n2_;
            System.out.println(division);

        }

        public static void main(String[] args) {
            Scanner tec = new Scanner(System.in);
            System.out.println("Ingrese el numero 1");
            int n1= tec.nextInt();
            System.out.println("Ingrese el numero 2");
            int n2= tec.nextInt();
            sumarnumeros(n1, n2);
            multiplicacion(n1, n2);
            restanumeros(n1, n2);

           
        
    }

   
}

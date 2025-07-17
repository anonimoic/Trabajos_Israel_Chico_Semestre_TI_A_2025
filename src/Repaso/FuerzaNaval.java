package Repaso;

import java.util.Random;

public class FuerzaNaval {
    public static void main(String[] args) {
        Random rd = new Random();
        int x1 = 0;
        int y1 = 0;

        int x2 = 4;
        int y2 = 0;

        
        //Calcular la base y el punto medio
        int mx = (x1+x2)/2;
        int my = (y1+y2)/2;
        //Calcular los 2 posibles vertices 
        double x3 = mx + ((Math.sqrt(3)/2)*(y1-y2));
        double y3 = my + ((Math.sqrt(3)/2)*(x1-x2));
        double x4 = mx - ((Math.sqrt(3)/2)*(y1-y2));
        double y4 = my - ((Math.sqrt(3)/2)*(x1-x2));
        //Calcular la longitud de la base 
        double L = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2))/2;
        System.out.println("Longitud de la base = " +L);
        System.out.println(x3);
        System.out.println(y3);
        System.out.println(x4);
        System.out.println(y4);
        System.out.println("Triangulo 1: ");
        System.out.println("Vertice 1: " +x1 + " ; " +y1);
        System.out.println("Vertice 2: " +x2 + " ; " +y2);
        System.out.println("Vertice 3: " +x3 + " ; " +y4);

        
        
    }

}

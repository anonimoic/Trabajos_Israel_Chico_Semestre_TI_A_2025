
import java.util.Random;

/*
 * Formulas: 
 * Area = Math.sqrt(3) / 4 * (Lado * Lado);
 * Perimetro = L*3
 * 
 */
public class PruebaTriangulo {

    public static void main(String[] args) {
        double[][] vertices1 = new double[3][2];
        double[][] vertices2 = new double[3][2];
        double[] impresion = new double[2];
        Random rd = new Random();
        //System.out.println("Ingrese la coordenada en x");
        double x1 = 2;
        double y1 = 0;
        //System.out.println("Ingrese la coordenada en y");
        double x2 = 0;
        double y2 = 3;

        //Coordenadas 
        // Punto A: x1 ; y1
        // Punto B: x2 ; y2
        System.out.println("Coordenadas:");
        //System.out.println("Punto A: " +x1 +" ; " +y1);
        //System.out.println("Punto B: " +x2 +" ; " +y2);
        //Punto Medio 
        double MedioX = (x1 + x2) / 2;
        double MedioY = (y1 + y2) / 2;
        System.out.println("Punto medio: " + MedioX + " ; " + MedioY);
        //Rotar 60° horario y antiohorario 
        double x3 = MedioX + (Math.sqrt(3) / 2) * (y1 - y2);
        double y3 = MedioY + (Math.sqrt(3) / 2) * (x2 - x1);
        double x4 = MedioX - (Math.sqrt(3) / 2) * (y1 - y2);
        double y4 = MedioY - (Math.sqrt(3) / 2) * (x2 - x1);

        //Sacar el lado
        Double equis = x2 - x1;
        double ye = y2 - y1;
        Double L = Math.sqrt((equis * equis) + (ye * ye));
        System.out.println("El lado de los triangulos mide : " + L + " m");
        System.out.println(" ");
        //Calculo del Area 
        double A = Math.sqrt(3) / 4 * (L * L);

        //Guardar en una matriz
        //Triangulo 1
        vertices1[0][0] = x1;
        vertices1[0][1] = y1;
        vertices1[1][0] = x2;
        vertices1[1][1] = y2;
        vertices1[2][0] = x4;
        vertices1[2][1] = y4;
        //Triangulo 2
        vertices2[0][0] = x1;
        vertices2[0][1] = y1;
        vertices2[1][0] = x2;
        vertices2[1][1] = y2;
        vertices2[2][0] = x3;
        vertices2[2][1] = y3;
        System.out.println("Triangulo 1 (+60°)");
        for (int i = 0; i < 3; i++) {
            System.out.println("Vertice " + (i + 1) + " = " + vertices1[i][0] + " ; " + vertices1[i][1]);
        }
        System.out.println("El Perimetro del Triangulo es: " + L * 3);
        System.out.println("El Area del triangulo es: " + A);
        System.out.println("\n");
        System.out.println("Triangulo 2 (-60°)");
        for (int i = 0; i < 3; i++) {
            System.out.println("Vertice " + (i + 1) + " = " + vertices2[i][0] + " ; " + vertices2[i][1]);
        }
        System.out.println("El Perimetro del Triangulo es: " + L * 3);
        System.out.println("El Area del triangulo es: " + A);
        System.out.println("=================================================================================");
        System.out.println("| Triangulo\t|\t Modulo \t|\t Perimetro \t|\t Area \t\t|");
        System.out.println("=================================================================================");

        for (int i = 0; i < impresion.length; i++) {
            System.out.println("Triangulo " + (i + 1) + "\t|\t" + L + "\t|\t" + L * 3 + "\t|\t" + A);
        }

    }

}


public class Ejercicio2 {
    public static void CargarMatricesAleatorios(int [][]Matriz_){
        for (int i = 0; i < Matriz_.length; i++) {
            Matriz_[i][i] = 1;
        }
    }
    public static void ImprimirMatriz(int [][] Matriz_){
        System.out.println(" Imprimir Matrices ");
        for (int f = 0; f < Matriz_.length; f++) {
            for (int c = 0; c < Matriz_[0].length; c++) {
                System.out.print("V[" +f +"," +c +"] = ");
                System.out.print(+Matriz_[f][c] +"\t");
                System.out.print("");
            }  
            System.out.println("\n ");
        }
    }

    public static void main(String[] args) {
        int[][] diagonal = new int[5][5];
        CargarMatricesAleatorios(diagonal);
        ImprimirMatriz(diagonal);
    }

}

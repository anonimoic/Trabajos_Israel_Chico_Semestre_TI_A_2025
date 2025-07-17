package Repaso;

public class EjercicioPractica {

    public static void main(String[] args) {
        int[] vector = new int[]{-5, 10, -2, 9, 0, -4, 3, -8, 7, -11};
        positivos(vector);
        negativos(vector);
        ceros(vector);
    }

    public static void positivos(int _vector[]) {
        int positivos = 0;
        for (int i = 0; i < _vector.length; i++) {
            if (_vector[i] > 0) {
                positivos += 1;
                System.out.println(_vector[i]);

            }

        }
        System.out.println("Existen " + positivos + " numeros positivos");
    }

    public static void negativos(int _vector[]) {
        int negativos = 0;
        for (int i = 0; i < _vector.length; i++) {
            if (_vector[i] < 0) {
                negativos += 1;
                System.out.println(_vector[i]);

            }

        }
        System.out.println("Existen " + negativos + " numeros negativos");
    }
      public static void ceros(int _vector[]) {
        int ceros = 0;
        for (int i = 0; i < _vector.length; i++) {
            if (_vector[i] == 0) {
                ceros+= 1;
                System.out.println(_vector[i]);

            }

        }
        System.out.println("Existen " + ceros + " numeros ceros");
    }

}

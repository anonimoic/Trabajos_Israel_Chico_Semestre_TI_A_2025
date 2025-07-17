public class ValorPrimitivo {
    public static void main(String[] args) {
        int x = 5;
        modificar(x);
        System.out.println("Valor final de x: " + x);
    }

    public static void modificar(int numero) {
        numero = 100;
    }
}


package SobrecargasMetodos;

public class Sobrecargas {
    public int Sumar(int numero1 , int numero2){
        return numero1+numero2;
    }
    public double Sumar(double numero1 , double numero2){
        return numero1+numero2;
    }
    public double Sumar(double numero1 , double numero2,double numero3){
        return numero1+numero2+numero3;
    }
public static void main(String[] args) {
    Sobrecargas obj = new Sobrecargas();
    System.out.println(obj.Sumar(300, 200));
    System.out.println(obj.Sumar(3.14159, 2.7179));
    System.out.println(obj.Sumar(3.14159, 2.7179,5.25));
}
}
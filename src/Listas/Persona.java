package Listas;

public class Persona {
    private String nombre;
    private String genero;
    private int edad;

    public Persona(String nombre,String genero,int edad ) {
        this.edad = edad;
        this.genero = genero;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }
    

}

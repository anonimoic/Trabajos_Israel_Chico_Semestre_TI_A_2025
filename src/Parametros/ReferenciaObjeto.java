class Persona {
    String nombre;
}

public class ReferenciaObjeto {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "Ana";
        cambiarNombre(p);
        System.out.println("Nombre final: " + p.nombre);
    }

    public static void cambiarNombre(Persona persona) {
        persona.nombre = "Laura";
    }
}

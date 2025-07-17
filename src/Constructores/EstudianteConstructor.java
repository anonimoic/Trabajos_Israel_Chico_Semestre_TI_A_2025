package Constructores;

public class EstudianteConstructor {
    public String nombre; 
    public String cedula; 
    public String facultad; 
    public String carrera; 
    public int creditos;

    //Constructor
    public EstudianteConstructor(){

    }
    public EstudianteConstructor(String _nombre, String _cedula ,
                                 String _facultad , String _carrera , int _creditos){
        nombre = _nombre;
        cedula = _cedula;
        facultad = _facultad;
        carrera = _carrera;
        creditos = _creditos;

    }
    public EstudianteConstructor(String _nombre , String _cedula, int _creditos){
        nombre = _nombre;
        cedula = _cedula;
        creditos = _creditos;

    }

    public void Imprimir(){
        System.out.println("-- Datos del Estudiante --");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Facultad: " + facultad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Creditos: " + creditos);
    }
    public static void main(String[] args) {
        EstudianteConstructor obj = new EstudianteConstructor();
        obj.nombre = "Juan Lopez";
        obj.cedula = "180562";
        obj.facultad = "FISEI";
        obj.carrera = "TI";
        obj.creditos= 30;
        //Imprimir los datos
        obj.Imprimir();

        EstudianteConstructor obj2 = new EstudianteConstructor("Israel", "1850", 
                                    "FISEI", "SOFTEWARE", 120);
                                    obj2.Imprimir();
        EstudianteConstructor obj3 = new EstudianteConstructor("Leonardo", "18895", 
                                   "FISEI", "SISTEMAS", 20);
        EstudianteConstructor obj4 = new EstudianteConstructor("Mateo", "18065616", 150);
        obj4.Imprimir();
        
    }

}

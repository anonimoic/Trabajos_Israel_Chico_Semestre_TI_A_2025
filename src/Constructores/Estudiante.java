package Constructores;

import java.util.Scanner;

public class Estudiante {
    public String nombre; 
    public String cedula; 
    public String facultad; 
    public String carrera; 
    public int creditos;

    public void Imprimir(){
        System.out.println("-- Datos del Estudiante --");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Facultad: " + facultad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Creditos: " + creditos);
    }
    public void CargarDatosEstudiante(){
        Scanner tec = new Scanner(System.in);
        System.out.println(" -- Ingrese los datos --");
        System.out.print("Nombre: ");
        nombre = tec.nextLine();
        System.out.print("Cedula: " );
        cedula = tec.nextLine();
        System.out.print("Facultad: " );
        facultad = tec.nextLine();
        System.out.print("Carrera: " );
        carrera = tec.nextLine();
        System.out.print("Creditos: " );
        creditos = tec.nextInt();
    }
    public void CrearEstudianteporParametros(String _nombre, String _cedula , String _facultad , String _carrera , int _creditos ){
        nombre = _nombre;
        cedula = _cedula;
        facultad = _facultad;
        carrera = _carrera;
        creditos = _creditos;

    }


    public static void main(String[] args) {
        Estudiante estudiante_1 = new Estudiante();
        estudiante_1.nombre = "Juan Lopez";
        estudiante_1.cedula = "180562";
        estudiante_1.facultad = "FISEI";
        estudiante_1.carrera = "TI";
        estudiante_1.creditos= 30;

        //Imprimir los datos del Estudiante 1
        estudiante_1.Imprimir();
        Estudiante estudiante_2 = new Estudiante();
        estudiante_2.CargarDatosEstudiante();
        //Imprimir los datos del Estudiante 2
        System.out.println("--ESTUDIANTE 2 --");
        estudiante_2.Imprimir();

        Estudiante estudiante_3 = new Estudiante();
        estudiante_3.CrearEstudianteporParametros("Jose" , "1850", "Fisei", "Ti", 130);
        //Imprimir los datos del Estudiante 3
        System.out.println("--ESTUDIANTE 3--");
        estudiante_3.Imprimir();

    }

}

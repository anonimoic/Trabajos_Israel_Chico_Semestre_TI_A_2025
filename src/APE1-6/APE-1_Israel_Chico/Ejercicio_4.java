import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
                System.out.println("Introduce la fecha en el formato (DIA, MES, AÑO):");
        System.out.print("DIA: ");
        int dia = tec.nextInt();
        
        System.out.print("MES: ");
        int mes = tec.nextInt();  // El mes ingresado debe estar entre 1 y 12
        
        System.out.print("AÑO: ");
        int año = tec.nextInt();

        // Crear un objeto Calendar con la fecha proporcionada
        Calendar calendar = Calendar.getInstance();
        calendar.set(año, mes - 1, dia); // Los meses en Calendar son de 0 a 11, por eso restamos 1

        // Sumar un día a la fecha
        calendar.add(Calendar.DAY_OF_MONTH, 1);

        // Obtener la nueva fecha
        int nuevoDia = calendar.get(Calendar.DAY_OF_MONTH);
        int nuevoMes = calendar.get(Calendar.MONTH) + 1;  // Volvemos a sumar 1 para tener el mes entre 1 y 12
        int nuevoAño = calendar.get(Calendar.YEAR);

        // Mostrar la nueva fecha
        System.out.println("La fecha del día siguiente es: " + nuevoDia + "/" + nuevoMes + "/" + nuevoAño);
    }

}

import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        System.out.println("Introduce la fecha de nacimiento (DIA, MES, AÑO):");
        System.out.print("DIA de nacimiento: ");
        int diaNacimiento = tec.nextInt();
        
        System.out.print("MES de nacimiento: ");
        int mesNacimiento = tec.nextInt(); 
        
        System.out.print("AÑO de nacimiento: ");
        int añoNacimiento = tec.nextInt();

        System.out.println("\nIntroduce la fecha actual (DIA, MES, AÑO):");
        System.out.print("DIA actual: ");
        int diaActual = tec.nextInt();
        
        System.out.print("MES actual: ");
        int mesActual = tec.nextInt();
        
        System.out.print("AÑO actual: ");
        int añoActual = tec.nextInt();

        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(añoNacimiento, mesNacimiento - 1, diaNacimiento); 
        
        Calendar fechaActual = Calendar.getInstance();
        fechaActual.set(añoActual, mesActual - 1, diaActual);  
        int edadEnAños = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        
        if (fechaActual.get(Calendar.MONTH) < fechaNacimiento.get(Calendar.MONTH) ||
            (fechaActual.get(Calendar.MONTH) == fechaNacimiento.get(Calendar.MONTH) && fechaActual.get(Calendar.DAY_OF_MONTH) < fechaNacimiento.get(Calendar.DAY_OF_MONTH))) {
            edadEnAños--;  
        }

        if (edadEnAños < 1) {
            int edadEnMeses = fechaActual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
            int edadEnDias = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNacimiento.get(Calendar.DAY_OF_MONTH);

            if (edadEnMeses < 0) {
                edadEnMeses += 12; 
            }
            if (edadEnDias < 0) {
                edadEnDias += 30;
            }

            System.out.println("Edad: " + edadEnMeses + " meses y " + edadEnDias + " días.");
        } else {
            System.out.println("Edad: " + edadEnAños + " años.");
        }

    }

}

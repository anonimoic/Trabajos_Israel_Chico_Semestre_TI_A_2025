package src;

import java.io.IOException;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        ProcesadorExportaciones procesador = new ProcesadorExportaciones();
        try {
            procesador.leerArchivo("src/ProductosExportacion.csv");
            procesador.guardarArchivo("src/ProductosExportacionGuardado.csv");
            System.out.println(" ------------------ Item #1 ------------------");
            System.out.println("Leer datos de el archivo CSV");
            System.out.println(" ------------------ Item #2 ------------------");
            System.out.println("Guardar datos en el archivo de texto");
            System.out.println(" ------------------ Item #3 ------------------");
            System.out.println("Monto total de exportaciones a Centroamérica:");
            System.out.println("$" + procesador.obtenerMontoCentroamericaTotal() + " millones");
            System.out.println(" ------------------ Item #4 ------------------");
            System.out.println("\nPesos por trimestre (2022-2024):");
            for (Map.Entry<String, Double> entry : procesador.obtenerPesosPorTrimestre().entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " toneladas"); 
            }
            System.out.println(" ------------------ Item #5 ------------------");
            System.out.println("\nResumen por tipo de producto:");
            for (Map.Entry<String, double[]> entry : procesador.resumenPorTipoProducto().entrySet()) {
                System.out.println(entry.getKey() + ": "
                        + (int) entry.getValue()[0] + " exportaciones, $" + entry.getValue()[1] + " millones");
            }
            System.out.println(" ------------------ Item #6 ------------------");
            System.out.println("\nPorcentaje por año:");
            for (Map.Entry<Integer, Double> entry : procesador.porcentajePorAnio().entrySet()) {
                System.out.println(entry.getKey() + ": " + String.format("%.2f", entry.getValue()) + "%%");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

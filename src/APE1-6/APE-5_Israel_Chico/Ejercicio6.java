import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int[][] asistencia = new int[4][5]; // 4 facultades, 5 materias

        // Ingreso de asistencia por materia en cada facultad
        System.out.println("Ingrese la asistencia por materia en cada facultad:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Facultad " + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.print("  Materia " + (j + 1) + ": ");
                asistencia[i][j] = tec.nextInt();
            }
        }

        System.out.println("\n=== INFORMES ===");

        // 1. Asistencia total por materia
        System.out.println("1. Asistencia total por materia:");
        for (int j = 0; j < 5; j++) {
            int totalMateria = 0;
            for (int i = 0; i < 4; i++) {
                totalMateria += asistencia[i][j];
            }
            System.out.println("  Materia " + (j + 1) + ": " + totalMateria);
        }

        // 2. Asistencia total en la facultad 3
        int totalFacultad3 = 0;
        for (int j = 0; j < 5; j++) {
            totalFacultad3 += asistencia[2][j]; // Facultad 3 está en índice 2
        }
        System.out.println("\n2. Asistencia total en la facultad 3: " + totalFacultad3);

        // 3. Asistencia en la materia 2 de la facultad 1
        System.out.println("\n3. Asistencia en la materia 2 de la facultad 1: " + asistencia[0][1]);

        // 4. Porcentaje de asistencia en cada facultad
        System.out.println("\n4. Porcentaje de asistencia en cada facultad:");
        System.out.println("");
        int totalGeneral = 0;
        int[] totalPorFacultad = new int[4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                totalPorFacultad[i] += asistencia[i][j];
            }
            totalGeneral += totalPorFacultad[i];
        }

        for (int i = 0; i < 4; i++) {
            double porcentaje = (double) totalPorFacultad[i] * 100 / totalGeneral;
            System.out.printf("  Facultad %d: %.2f%%\n", (i + 1), porcentaje);
        }

        // 5. Facultad con la mayor asistencia
        int mayor = totalPorFacultad[0];
        int facultadMayor = 1;
        for (int i = 1; i < 4; i++) {
            if (totalPorFacultad[i] > mayor) {
                mayor = totalPorFacultad[i];
                facultadMayor = i + 1;
            }
        }
        System.out.println("\n5. Facultad con mayor asistencia: Facultad " + facultadMayor + " con " + mayor + " asistencias.");
    }
}


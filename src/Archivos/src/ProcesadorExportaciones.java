package src;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class ProcesadorExportaciones {

    private List<ProductoExportacion> productos = new ArrayList<>();

    public void leerArchivo(String rutaArchivo) throws IOException {
        List<String> lineas = Files.readAllLines(Paths.get(rutaArchivo));
        lineas.remove(0);
        for (String linea : lineas) {
            String[] partes = linea.split(",");
            productos.add(new ProductoExportacion(
                    Integer.parseInt(partes[0]),
                    partes[1],
                    Integer.parseInt(partes[2]),
                    partes[3],
                    partes[4],
                    Double.parseDouble(partes[5]),
                    Double.parseDouble(partes[6])
            ));
        }
    }

    public void guardarArchivo(String rutaDestino) throws IOException {
        List<String> lineas = productos.stream()
                .map(ProductoExportacion::toString)
                .collect(Collectors.toList());
        lineas.add(0, "id,mes,anio,pais,tipoProducto,pesoToneladas,montoMillonesDolares");
        Files.write(Paths.get(rutaDestino), lineas);
    }

    public double obtenerMontoCentroamericaTotal() {
        List<String> centroamerica = Arrays.asList("Guatemala", "Honduras", "El Salvador", "Nicaragua", "Costa Rica", "Panamá");
        double total = 0.0;
        for (ProductoExportacion p : productos) {
            if (centroamerica.contains(p.getPais())) {
                total += p.getMontoMillonesDolares();
            }
        }
        return total;
    }

    public Map<String, Double> obtenerPesosPorTrimestre() {
        Map<String, Double> resultado = new LinkedHashMap<>();
        Map<String, Integer> mesANumero = Map.ofEntries(
                Map.entry("Enero", 1), Map.entry("Febrero", 2), Map.entry("Marzo", 3),
                Map.entry("Abril", 4), Map.entry("Mayo", 5), Map.entry("Junio", 6),
                Map.entry("Julio", 7), Map.entry("Agosto", 8), Map.entry("Septiembre", 9),
                Map.entry("Octubre", 10), Map.entry("Noviembre", 11), Map.entry("Diciembre", 12)
        );

        for (ProductoExportacion p : productos) {
            if (p.getAnio() >= 2022 && p.getAnio() <= 2024) {
                int mesNum = mesANumero.getOrDefault(p.getMes(), 0);
                if (mesNum == 0) {
                    continue; // ignorar si el mes no se reconoce

                                }int trimestre = (mesNum - 1) / 3 + 1;
                String clave = "Trimestre " + trimestre + " - " + p.getAnio();
                resultado.put(clave, resultado.getOrDefault(clave, 0.0) + p.getPesoToneladas());
            }
        }

        // Asegurar el orden: Trimestre 1, 2, 3, 4 para cada año
        Map<String, Double> ordenado = new LinkedHashMap<>();
        for (int anio = 2022; anio <= 2024; anio++) {
            for (int t = 1; t <= 4; t++) {
                String clave = "Trimestre " + t + " - " + anio;
                if (resultado.containsKey(clave)) {
                    ordenado.put(clave, resultado.get(clave));
                }
            }
        }

        return ordenado;
    }

    public Map<String, double[]> resumenPorTipoProducto() {
        Map<String, double[]> resumen = new HashMap<>();
        for (ProductoExportacion p : productos) {
            resumen.putIfAbsent(p.getTipoProducto(), new double[]{0, 0});
            resumen.get(p.getTipoProducto())[0] += 1;
            resumen.get(p.getTipoProducto())[1] += p.getMontoMillonesDolares();
        }
        return resumen;
    }

    public Map<Integer, Double> porcentajePorAnio() {
        Map<Integer, Double> resultado = new HashMap<>();
        double total = productos.stream().mapToDouble(ProductoExportacion::getMontoMillonesDolares).sum();

        for (ProductoExportacion p : productos) {
            resultado.put(p.getAnio(), resultado.getOrDefault(p.getAnio(), 0.0) + p.getMontoMillonesDolares());
        }

        for (Integer anio : resultado.keySet()) {
            resultado.put(anio, (resultado.get(anio) / total) * 100);
        }

        return resultado;
    }
}

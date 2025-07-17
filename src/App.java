
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class App {
    private static void ImprimirListaDelito(LinkedList<Delito> lista) {
        System.out.println("---------Imprimiendo Lista delitos-----------");
        for (Delito delito : lista) {
                System.out.println(delito.toString());
            }
    }
    private static void AgregarDelitoEnArchivodeTexto(String ruta, Delito _nuevoDelito) {
        try(FileWriter fw = new FileWriter(ruta, true)) {
            //Agregamos el objeto en formato CSV
            fw.write(_nuevoDelito.ConvertirFormatoCSV());
        } catch (IOException e) {
            System.out.println("Hubo un error al momento de escribir el archivo " + "\n" + e.getMessage());
        }
    }
    public static LinkedList<Delito> CargarListadesdeArchivodeTexto(String _ruta ){
        //Declaro la lista
        LinkedList<Delito> lista = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(_ruta))) {
            String linea;
            
            //Controlar la primera linea
            boolean primeralinea = true;

            while ((linea = reader.readLine()) != null) {
                //Saltar la cabecera
                if (primeralinea == true) {
                    primeralinea = false;
                    continue;
                }

                String[] partes = linea.split(";");
                if (partes.length == 4) {
                    String provincia = partes[0];
                    String delito = partes[1];
                    boolean judicializado = Boolean.parseBoolean(partes[2]);
                    String victima = partes[3];
                    Delito _delito = new Delito(provincia, delito, judicializado, victima);
                    lista.add(_delito);
                }
            }
        }
        catch (IOException ex) {
            // TODO: handle exception
            System.out.println("Hubo un error al momento de cargar el archivo " + "\n" + ex.getMessage());
        } 
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("Hubo un error en el proceso " + "\n" + e.getMessage());
        }
        return lista;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("--Manejo de Archivos--");
        String ruta = "src/DelitoskProvincia.csv"; //PAD RELATIVO
        LinkedList<Delito> lista1 = CargarListadesdeArchivodeTexto(ruta);
        LinkedList<Delito> lista = CargarListadesdeArchivodeTexto(ruta);
        ImprimirListaDelito(lista);

        //Agregar Delito al Archivo
        Delito _nuevoDelito = new Delito("Ambato", "Robo", true, "IPL");
        AgregarDelitoEnArchivodeTexto(ruta, _nuevoDelito);
        lista=CargarListadesdeArchivodeTexto(ruta);
        ImprimirListaDelito(lista);
        try {
            
        } 
        catch (Exception error) {
            System.out.println("Ruta no valida");
        }
        
    }

}

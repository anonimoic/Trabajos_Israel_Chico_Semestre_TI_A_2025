package GetterSetter;

public class ConertidorStringArrays {
    public static void main(String[] args) {
        String cedula= "1803";
        String frutas= "Manzana,Uva,Limon";
        //System.out.println(cedula.substring(0,2));
        //System.out.println(cedula.charAt(0)+ "" +cedula.charAt(1));
        String delimitador="";
        String delimitador2=",";
        // String -> Vector
        String[] vectorfrutas=frutas.split(delimitador2);
        for (int i = 0; i < vectorfrutas.length; i++) {
            System.out.println(vectorfrutas[i]);
        }
        String [] vectorcedula=cedula.split(delimitador);
        for (int i = 0; i < vectorcedula.length; i++) {
            System.out.println(vectorcedula[i]);
        }
        // Vector -> String
        String numeros = String.join("", vectorcedula);
        System.out.println(numeros);
        String ensalada = String.join(" - ", vectorfrutas);
        System.out.println(ensalada);
    }
}

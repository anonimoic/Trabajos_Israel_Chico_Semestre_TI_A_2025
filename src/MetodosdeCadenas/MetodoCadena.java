package MetodosdeCadenas;

public class MetodoCadena {

    public void MetodoChartAt(){
        String cadena = "Hola Mundo";
        char resultado = cadena.charAt(5);

        int longitud = cadena.length();
        for (int i = 0; i < longitud; i++) {
            System.out.print(cadena.charAt(i)+" - ");
        }
        System.out.println("");
    }
    //public boolean Esvocal(char letra){
      //  if (letra == vocal) {
        //    return true;
        //}else{
          //  return false;
        //}
    //}
    public void MetodoCompare(){
        String cadena1 = "Hola";
        String cadena2 = "HOLA";
        System.out.println(cadena1.compareTo(cadena2));
    }
    public void MetodoCompareIgnorandoMayusculasMinusculas(){
        String cadena1 = "Hola";
        String cadena2 = "HOLA";
        System.out.println(cadena1.compareToIgnoreCase(cadena2));
    }

    public void ConcatenarCadenas(){
        String cadena1 = "Andres";
        String cadena2 = "Camilo";
        String cadena3 = "Ruiz";
        System.out.println(cadena1.concat(" "+cadena2+" ").concat(cadena3));
    }
    public static void main(String[] args) {
        MetodoCadena obj = new MetodoCadena();
        //obj.MetodoChartAt();
        //obj.MetodoCompare();
        //obj.MetodoCompareIgnorandoMayusculasMinusculas();
        obj.ConcatenarCadenas();
    }

}

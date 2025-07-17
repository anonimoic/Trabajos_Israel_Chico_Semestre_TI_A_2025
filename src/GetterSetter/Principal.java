package GetterSetter;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan","1801",19);
        Cliente cliente2 = new Cliente("Ana","1802",18);
        Cliente cliente3 = new Cliente("Jose","1803",20);

        cliente1.setCedula("1705");
        cliente1.ImprimirDatosCliente();
    }

}

package GetterSetter;

public class Cliente {

    //Encapsulamiento - Atributos
    private String nombre;
    private String cedula;
    private int edad;
    private String CuentaBancaria;
    private double saldo;

    public Cliente(String _nombre, String _cedula, int _edad) {
        this.nombre = _nombre;
        this.cedula = _cedula;
        this.edad = _edad;
    }

    public Cliente(String CuentaBancaria, String cedula, int edad, String nombre, double saldo) {
        this.CuentaBancaria = CuentaBancaria;
        this.cedula = cedula;
        this.edad = edad;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    //Getter nombre
    public String getnombre() {
        return nombre;
    }

    //setter nombre
    public void setNombre(String _nombre) {
        this.nombre = _nombre;
    }

    //Getter cedula
    public String getcedula() {
        return cedula;
    }

    //setter cedula
    public void setCedula(String _cedula) {
        if (_cedula.length() == 4) {
            if (_cedula.substring(0, 2) == "18") {
                this.cedula = _cedula;
            } else {
                System.out.println("La cedula no pertenece a Tungurahua");
            }
        } else {
            System.out.println("La longitud de la cedula es incorrecta");
        }
    }

    //Getter edad
    public int getedad() {
        return edad;
    }

    //setter edad
    public void setCedula(int _edad) {
        this.edad = _edad;
    }

    public String getCuentaBancaria() {
        return CuentaBancaria;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCuentaBancaria(String CuentaBancaria) {
        this.CuentaBancaria = CuentaBancaria;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ImprimirDatosCliente() {
        System.out.println(
                "--- Datos del Cliente ---" + "\n"
                + "Cliente: " + this.nombre + "\n"
                + "Cedula: " + this.cedula + "\n"
                + "Edad: " + this.edad + "\n"
                + "# de Cuenta: " + this.CuentaBancaria + "\n"
                + "Saldo: " + this.saldo + "\n"
                + "-----------------------------"
        );
    }

}

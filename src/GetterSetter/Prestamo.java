package GetterSetter;

public class Prestamo {
    private String nombre;
    private String cedula;
    private String TipoDeCredito;
    private double monto;
    private int plazo;
    public Prestamo (String _nombre , String _cedula , String _TipoDeCredito){
        this.nombre=_nombre;
        this.cedula=_cedula;
        this.TipoDeCredito=_TipoDeCredito;
    }

    public Prestamo(String TipoDeCredito, String cedula, double monto, String nombre, int plazo) {
        this.TipoDeCredito = TipoDeCredito;
        this.cedula = cedula;
        this.monto = monto;
        this.nombre = nombre;
        this.plazo = plazo;
    }

    public String getNombre(){
        return nombre;
    }
    public String getCedula(){
        return cedula;
    }

    public String getTipoDeCredito() {
        return TipoDeCredito;
    }

    public double getMonto() {
        return monto;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTipoDeCredito(String TipoDeCredito) {
        this.TipoDeCredito = TipoDeCredito;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

}

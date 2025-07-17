package src;

public class ProductoExportacion {
    private int id;
    private String mes;
    private int anio;
    private String pais;
    private String tipoProducto;
    private double pesoToneladas;
    private double montoMillonesDolares;

    public ProductoExportacion(int id, String mes, int anio, String pais, String tipoProducto, double pesoToneladas, double montoMillonesDolares) {
        this.id = id;
        this.mes = mes;
        this.anio = anio;
        this.pais = pais;
        this.tipoProducto = tipoProducto;
        this.pesoToneladas = pesoToneladas;
        this.montoMillonesDolares = montoMillonesDolares;
    }

    public int getId() { return id; }
    public String getMes() { return mes; }
    public int getAnio() { return anio; }
    public String getPais() { return pais; }
    public String getTipoProducto() { return tipoProducto; }
    public double getPesoToneladas() { return pesoToneladas; }
    public double getMontoMillonesDolares() { return montoMillonesDolares; }

    public void setId(int id) { this.id = id; }
    public void setMes(String mes) { this.mes = mes; }
    public void setAnio(int anio) { this.anio = anio; }
    public void setPais(String pais) { this.pais = pais; }
    public void setTipoProducto(String tipoProducto) { this.tipoProducto = tipoProducto; }
    public void setPesoToneladas(double pesoToneladas) { this.pesoToneladas = pesoToneladas; }
    public void setMontoMillonesDolares(double montoMillonesDolares) { this.montoMillonesDolares = montoMillonesDolares; }

    @Override
    public String toString() {
        return id + "," + mes + "," + anio + "," + pais + "," + tipoProducto + "," + pesoToneladas + "," + montoMillonesDolares;
    }
}
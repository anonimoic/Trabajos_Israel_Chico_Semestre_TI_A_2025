public class Delito {
    private String provincia;
    private String delito;
    private Boolean judicializado;
    private String victima;

    

    public Delito(String provincia, String delito, Boolean judicializado, String victima) {
        this.provincia = provincia;
        this.delito = delito;
        this.judicializado = judicializado;
        this.victima = victima;
    }

    
    public String getProvincia() {
        return provincia;
    }


    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }


    public String getDelito() {
        return delito;
    }


    public void setDelito(String delito) {
        this.delito = delito;
    }


    public Boolean getJudicializado() {
        return judicializado;
    }


    public void setJudicializado(Boolean judicializado) {
        this.judicializado = judicializado;
    }


    public String getVictima() {
        return victima;
    }


    public void setVictima(String victima) {
        this.victima = victima;
    }

    
    
    @Override
    public String toString() {
        String resultado = this.provincia +"\t " +
                            this.delito +"\t " +
                            this.judicializado +"\t " +
                            this.victima;
        return  resultado;
    }


    public String ConvertirFormatoCSV(){

        return provincia+";"+delito+";"+judicializado+";"+victima+"\n";
    }

    
    

}

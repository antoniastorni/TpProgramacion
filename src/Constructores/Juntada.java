package Constructores;

public class Juntada {

    Double MiTelefono;
    Double Telefono;
    String fechaDesde;
    String fechaHasta;
    public Boolean confirmado;
    public Boolean visto;

    public Juntada (Double MiTelefono, Double Telefono, String fechaDesde, String fechaHasta, Boolean confirmado, Boolean visto){
        this.MiTelefono = MiTelefono;
        this.Telefono = Telefono;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.confirmado = confirmado;
        this.visto = visto;
    }

    public Double getMiTelefono() {
        return MiTelefono;
    }

    public String getFechaDesde() {
        return fechaDesde;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }

    public Integer getDiaDesde(){
        String[] fechaInt = fechaDesde.split("/");
        return Integer.parseInt(fechaInt[0]);
    }

    public Integer getMesDesde(){
        String[] fechaInt = fechaDesde.split("/");
        return Integer.parseInt(fechaInt[1]);
    }

    public Integer getDiaHasta(){
        String[] fechaInt = fechaHasta.split("/");
        return Integer.parseInt(fechaInt[0]);
    }

    public Integer getMesHasta(){
        String[] fechaInt = fechaHasta.split("/");
        return Integer.parseInt(fechaInt[1]);
    }

    public Double getTelefono() {
        return Telefono;
    }

    public Boolean getConfirmado() {
        return confirmado;
    }

    public Boolean getVisto() {
        return visto;
    }
}
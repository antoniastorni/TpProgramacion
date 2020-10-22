public class Juntada {

    Double Telefono;
    String fechaDesde;
    String fechaHasta;

    public Juntada (Double Telefono, String fechaDesde, String fechaHasta){
        this.Telefono = Telefono;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public Double getTelefono() {
        return Telefono;
    }

    public Integer getDiaDesde() {
        String[] fecha = fechaDesde.split("/");
        return Integer.parseInt(fecha[0]);
    }

    public Integer getMesDesde() {
        String[] fecha = fechaDesde.split("/");
        return Integer.parseInt(fecha[1]);
    }

    public Integer getDiaHasta() {
        String[] fecha = fechaHasta.split("/");
        return Integer.parseInt(fecha[0]);
    }

    public Integer getMesHasta() {
        String[] fecha = fechaHasta.split("/");
        return Integer.parseInt(fecha[1]);
    }
}
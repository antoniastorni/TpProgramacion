package Constructores;

public class Notificaciones {
    Double Cuilcovid;
    Double CuilAdvertir;
    Integer diaDesde;
    Integer mesDesde;
    Integer diaHasta;
    Integer mesHasta;

    public Notificaciones(Double Cuilcovid, Double CuilAdvertir, Integer diaDesde, Integer mesDesde, Integer diaHasta, Integer mesHasta){
        this.Cuilcovid = Cuilcovid;
        this.CuilAdvertir = CuilAdvertir;
        this.diaDesde = diaDesde;
        this.mesDesde = mesDesde;
        this.diaHasta = diaHasta;
        this.mesHasta = mesHasta;

    }

    public Double getCuilcovid() {
        return Cuilcovid;
    }

    public Double getCuilAdvertir() {
        return CuilAdvertir;
    }

    public Integer getDiaDesde() {
        return diaDesde;
    }

    public Integer getDiaHasta() {
        return diaHasta;
    }

    public Integer getMesDesde() {
        return mesDesde;
    }

    public Integer getMesHasta() {
        return mesHasta;
    }
}

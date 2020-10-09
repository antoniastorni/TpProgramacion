public abstract class Usuario {
    Integer CUIl;
    Integer telefono;
    String zona;
    boolean bloqueado;
    public Usuario(Integer CUIl, Integer telefono, String zona) {
        this.CUIl = CUIl;
        this.telefono = telefono;
        this.zona = zona;
        bloqueado=false;
    }

    public Integer getCUIl() {
        return CUIl;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public String getZona() {
        return zona;
    }
}
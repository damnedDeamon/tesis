package model;

public class TipoMascota {

    private int id;
    private String tipoMascota;

    public TipoMascota() {
    }

    public TipoMascota(int id, String tipoMascota) {
        this.id = id;
        this.tipoMascota = tipoMascota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    @Override
    public String toString() {
        return "TipoMascota{" + "id=" + id + ", tipoMascota=" + tipoMascota + '}';
    }
    
    
    
}

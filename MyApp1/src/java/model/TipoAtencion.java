package model;

public class TipoAtencion {
    
    private int id;
    private String nombreAtencion;

    public TipoAtencion() {
    }

    
    public TipoAtencion(int id, String nombreAtencion) {
        this.id = id;
        this.nombreAtencion = nombreAtencion;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreAtencion() {
        return nombreAtencion;
    }

    public void setNombreAtencion(String nombreAtencion) {
        this.nombreAtencion = nombreAtencion;
    }

    @Override
    public String toString() {
        return "TipoAtencion{" + "id=" + id + ", nombreAtencion=" + nombreAtencion + '}';
    }
    
    
}

package model;

public class Atencion {
    
    private int id;
    private String resumen;
    private String fechaHora;
    private String veterinarioAFK;
    private String mascotaAFK;
    private String tipoAtencionAFK;

    public Atencion() {
    }

    public Atencion(int id, String resumen, String fechaHora, String veterinarioAFK, String mascotaAFK, String tipoAtencionAFK) {
        this.id = id;
        this.resumen = resumen;
        this.fechaHora = fechaHora;
        this.veterinarioAFK = veterinarioAFK;
        this.mascotaAFK = mascotaAFK;
        this.tipoAtencionAFK = tipoAtencionAFK;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getVeterinarioAFK() {
        return veterinarioAFK;
    }

    public void setVeterinarioAFK(String veterinarioAFK) {
        this.veterinarioAFK = veterinarioAFK;
    }

    public String getMascotaAFK() {
        return mascotaAFK;
    }

    public void setMascotaAFK(String mascotaAFK) {
        this.mascotaAFK = mascotaAFK;
    }

    public String getTipoAtencionAFK() {
        return tipoAtencionAFK;
    }

    public void setTipoAtencionAFK(String tipoAtencionAFK) {
        this.tipoAtencionAFK = tipoAtencionAFK;
    }
    
    

    
    @Override
    public String toString() {
        return "Atencion{" + "id=" + id + ", resumen=" + resumen + ", fechaHora=" + fechaHora + ", veterinarioAFK=" + veterinarioAFK + ", mascotaAFK=" + mascotaAFK + ", tipoAtencionAFK=" + tipoAtencionAFK + '}';
    }
    
    
}

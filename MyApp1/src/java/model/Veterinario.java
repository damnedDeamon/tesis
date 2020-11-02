package model;

public class Veterinario {
    
    private int id;
    private String nombre;
    private String gmail;
    private String rut;

    public Veterinario() {
    }

    public Veterinario(int id, String nombre, String gmail, String rut) {
        this.id = id;
        this.nombre = nombre;
        this.gmail = gmail;
        this.rut = rut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Veterinario{" + "id=" + id + ", nombre=" + nombre + ", gmail=" + gmail + ", rut=" + rut + '}';
    }
    
    
}

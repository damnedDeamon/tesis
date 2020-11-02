package model;

public class Raza {
    private int id;
    private String nombreRaza;

    public Raza() {
    }

    public Raza(int id, String nombreRaza) {
        this.id = id;
        this.nombreRaza = nombreRaza;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreRaza() {
        return nombreRaza;
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }

    @Override
    public String toString() {
        return "Raza{" + "id=" + id + ", nombreRaza=" + nombreRaza + '}';
    }
    
    
}

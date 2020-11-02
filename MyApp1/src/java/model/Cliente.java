package model;

public class Cliente {

    private int id;
    private String direccion;
    private String nombre;
    private String gmail;
    private String Rut;
    private String telefono;

    public Cliente() {
    }

    public Cliente(int id, String direccion, String nombre, String gmail, String Rut, String telefono) {
        this.id = id;
        this.direccion = direccion;
        this.nombre = nombre;
        this.gmail = gmail;
        this.Rut = Rut;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    

}

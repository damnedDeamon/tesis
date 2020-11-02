package model;

public class Mascota {
    
    private int iid;
    private String nombreMacota;
    private String fechaNacimiento;
    private int edad;
    private float peso;
    private String sexo;
    private int clienteAFK;
    private int tipoAnimalAFK;
    private int razaAFK;

    public Mascota() {
    }

    public Mascota(int iid, String nombreMacota, String fechaNacimiento, int edad, float peso, String sexo, int clienteAFK, int tipoAnimalAFK, int razaAFK) {
        this.iid = iid;
        this.nombreMacota = nombreMacota;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
        this.clienteAFK = clienteAFK;
        this.tipoAnimalAFK = tipoAnimalAFK;
        this.razaAFK = razaAFK;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public String getNombreMacota() {
        return nombreMacota;
    }

    public void setNombreMacota(String nombreMacota) {
        this.nombreMacota = nombreMacota;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getClienteAFK() {
        return clienteAFK;
    }

    public void setClienteAFK(int clienteAFK) {
        this.clienteAFK = clienteAFK;
    }

    public int getTipoAnimalAFK() {
        return tipoAnimalAFK;
    }

    public void setTipoAnimalAFK(int tipoAnimalAFK) {
        this.tipoAnimalAFK = tipoAnimalAFK;
    }

    public int getRazaAFK() {
        return razaAFK;
    }

    public void setRazaAFK(int razaAFK) {
        this.razaAFK = razaAFK;
    }

    @Override
    public String toString() {
        return "Mascota{" + "iid=" + iid + ", nombreMacota=" + nombreMacota + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + ", peso=" + peso + ", sexo=" + sexo + ", clienteAFK=" + clienteAFK + ", tipoAnimalAFK=" + tipoAnimalAFK + ", razaAFK=" + razaAFK + '}';
    }
    
    
    
}

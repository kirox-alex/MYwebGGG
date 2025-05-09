
package modelo;

import java.sql.Date;

public class Cliente {
    private int id;
    private String dni;
    private String nombres;
    private String direccion;
    private String celular;
    private String sexo;
    private java.sql.Date fechaNacimiento;
    private int idPublicista;

    public Cliente() {
    }

    public Cliente(int id, String dni, String nombres, String direccion, String celular, String sexo, Date fechaNacimiento, int idPublicista) {
        this.id = id;
        this.dni = dni;
        this.nombres = nombres;
        this.direccion = direccion;
        this.celular = celular;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.idPublicista = idPublicista;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdPublicista() {
        return idPublicista;
    }

    public void setIdPublicista(int idPublicista) {
        this.idPublicista = idPublicista;
    }
    
}

package modelo;

import java.sql.Timestamp;

public class EnvioPublicidad {
    private int id;
    private int idCliente;
    private int idPublicidad;
    private String medio;
    private java.sql.Timestamp fechaEnvio;

    public EnvioPublicidad() {
    }

    public EnvioPublicidad(int id, int idCliente, int idPublicidad, String medio, Timestamp fechaEnvio) {
        this.id = id;
        this.idCliente = idCliente;
        this.idPublicidad = idPublicidad;
        this.medio = medio;
        this.fechaEnvio = fechaEnvio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdPublicidad() {
        return idPublicidad;
    }

    public void setIdPublicidad(int idPublicidad) {
        this.idPublicidad = idPublicidad;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public Timestamp getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Timestamp fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
    
}

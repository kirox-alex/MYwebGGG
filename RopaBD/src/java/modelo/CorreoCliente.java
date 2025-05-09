package modelo;

public class CorreoCliente {
    private int id;
    private int idCliente;
    private String correo;
    private String proveedor;

    public CorreoCliente() {
    }

    public CorreoCliente(int id, int idCliente, String correo, String proveedor) {
        this.id = id;
        this.idCliente = idCliente;
        this.correo = correo;
        this.proveedor = proveedor;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
}

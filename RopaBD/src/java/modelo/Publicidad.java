
package modelo;

public class Publicidad {
    private int id;
    private String tipoProducto;
    private String descripcion;
    private String numeroContacto;
    private String imagenUrl;

    public Publicidad() {
    }

    public Publicidad(int id, String tipoProducto, String descripcion, String numeroContacto, String imagenUrl) {
        this.id = id;
        this.tipoProducto = tipoProducto;
        this.descripcion = descripcion;
        this.numeroContacto = numeroContacto;
        this.imagenUrl = imagenUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }
    
}

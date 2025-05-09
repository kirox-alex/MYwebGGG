package modelo;

public class Usuario {
    private int id;
    private String usuario;
    private String contrasena;
    private String nombres;

    public Usuario() {
    }

    public Usuario(int id, String usuario, String contrasena, String nombres) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombres = nombres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
}

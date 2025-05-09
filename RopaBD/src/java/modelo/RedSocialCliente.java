package modelo;

public class RedSocialCliente {
    private int id;
    private int idCliente;
    private String redSocial;
    private String urlPerfil;

    public RedSocialCliente() {
    }

    public RedSocialCliente(int id, int idCliente, String redSocial, String urlPerfil) {
        this.id = id;
        this.idCliente = idCliente;
        this.redSocial = redSocial;
        this.urlPerfil = urlPerfil;
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

    public String getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(String redSocial) {
        this.redSocial = redSocial;
    }

    public String getUrlPerfil() {
        return urlPerfil;
    }

    public void setUrlPerfil(String urlPerfil) {
        this.urlPerfil = urlPerfil;
    }
    
    
}

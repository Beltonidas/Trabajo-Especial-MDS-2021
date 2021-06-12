public class BaseDatos {
    //simulamos una base de datos donde vamos a trae los valores para comparar
    private String nombreUsuario;
    private String clave;

    public BaseDatos() {
        this.nombreUsuario = "Cecilia";
        this.clave = "123456789";
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String calve) {
        this.clave = clave;
    }

}
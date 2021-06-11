public class ControladorLogin {

    public ControladorLogin() {
    }

    public boolean verificarLogin(String Usuario, String clave){
        BaseDatos baseDatos = new BaseDatos();
        return (baseDatos.getNombreUsuario().equals(Usuario) && baseDatos.getClave().equals(clave));
    }
}

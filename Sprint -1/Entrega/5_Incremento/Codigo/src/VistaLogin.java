import java.util.Scanner;

public class VistaLogin {

    public VistaLogin() {
    }

    //public int getIdLogin() {
    //    return idLogin;
    //}

    //public void setIdLogin(int idLogin) {
    //    this.idLogin = idLogin;
    //}

    public void dibujarLogin(){};

    public void comprobarSintaxysUsuario(String usuario){
        String palabra = usuario;
    }


    public void desplegarMenu(Secretaria secretaria) {
        ControladorLogin login = new ControladorLogin();
        System.out.println("Si se quiere Logear tendra que ingresar el nombre de Usuario y la Clave");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre de Usuario");
        String usuario = sc.nextLine();
        System.out.println("Ingrese su clave");
        String clave = sc.nextLine();
        //fin Reemplazar al descubrir como leer y comprobar caracter por caracter

        secretaria.setEstadoLogin(login.verificarLogin(usuario, clave));
    }

}

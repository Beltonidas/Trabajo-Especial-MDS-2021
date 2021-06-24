import java.util.ArrayList;
import java.util.Scanner;
import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VistaLogin {

    public VistaLogin() {
    }

    private boolean comprobarSintaxis(String texto){
        Pattern pattern = Pattern.compile("(\\w|\\d){7,16}");
        Matcher matcher = pattern.matcher(texto);
        return  matcher.find();
    }


    public ArrayList<String> desplegarMenu(Secretaria secretaria) {
        ArrayList datos=new ArrayList();
        datos.add(0,"Invalido");
        datos.add(1,"Invalido");
        //ControladorLogin login = new ControladorLogin();
        System.out.println("Si se quiere Logear tendra que ingresar el nombre de Usuario y la Clave");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre de Usuario");
        String usuario = sc.nextLine();

        if(!this.comprobarSintaxis(usuario)) {
            System.out.println("Nombre de usuario invalido");
            return datos;
        }

        System.out.println("Ingrese su clave");
        //Console cons = System.console();
        //char[] password = cons.readPassword();
        //String clave = new String(password);

        String clave = sc.nextLine();

        if(!this.comprobarSintaxis(clave)) {
            System.out.println("Clave invalida");
            return datos;
        }
        datos.add(0,usuario);
        datos.add(1,clave);
        return datos;
        //fin Reemplazar al descubrir como leer y comprobar caracter por caracter
        // IMPLEMENTAR LO DE QUE SE MUESTREN UNICAMENTE CARACTERES
    }

}

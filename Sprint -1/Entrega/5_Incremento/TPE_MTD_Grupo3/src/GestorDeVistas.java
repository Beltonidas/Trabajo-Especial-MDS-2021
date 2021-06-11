import java.util.Scanner;
import java.util.ArrayList;

public class GestorDeVistas {
        public static void main(String[] args) {
            boolean pagina = true;
            while (pagina) {
                System.out.println("Menu:");
                System.out.println("1: login");
                System.out.println("2: visualizar cartelera");
                System.out.println("3: ver listado materiales");
                System.out.println("4: ver instructivo");
                System.out.println("5: cerrar pagina");
                Scanner sc = new Scanner(System.in);
                String eleccion = sc.nextLine();
                APIsesion virtualSession = new APIsesion();
                Secretaria cecilia = new Secretaria();

                switch (eleccion) {
                    case "1": {
                        VistaLogin vistaLogin = new VistaLogin();
                        ArrayList<String> datosLogin = vistaLogin.desplegarMenu(cecilia);
                        VistaSecretaria vistaSecretaria = virtualSession.logearse(datosLogin, cecilia);
                        if (vistaSecretaria != null) {
                            vistaSecretaria.desplegarMenu(cecilia);
                            pagina=false;
                        }
                        else
                            System.out.println("No se pudo acceder");
                        break;
                    }
                    case "2":{}break; // Se muestra la cartelera en pantalla

                    case "3":{}break;// Se muestra el listado de materiales

                    case "4":{}break;// Se muestra el instructivo

                    case "5": {pagina=false;}break;//Cierra la pagina

                    default:
                }

            }

        }

}

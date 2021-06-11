import java.util.Scanner;

public class GestorDeVistas {
        public static void main(String[] args) {
            System.out.println("Menu:");
            System.out.println("1: login");
            System.out.println("2: visualizar cartelera");
            System.out.println("3: ver listado materiales");
            System.out.println("4: ver instructivo");
            Scanner sc = new Scanner(System.in);
            String eleccion = sc.nextLine();
            APIsesion virtualSession = new APIsesion();
            Secretaria cecilia = new Secretaria(false);

            switch(eleccion)
            {
                case "1" :{
                    VistaLogin vista= new VistaLogin();
                    vista.desplegarMenu(cecilia);
                }
                    // Va a vistaLogin
                    // APIsesion chequea el estadoLogin de secretaria, si es true
                    // creamos un objeto de tipo vistaSecretaria y hacemos
                    // vistaSecretaria.desplegarMenu

                case "2":// Se muestra la cartelera en pantalla

                case "3":// Se muestra el listado de materiales

                case "4":// Se muestra el instructivo

                default :
            }



        }
}

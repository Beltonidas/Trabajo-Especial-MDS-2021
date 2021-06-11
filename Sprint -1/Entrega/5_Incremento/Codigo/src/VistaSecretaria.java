import java.util.Scanner;

public class VistaSecretaria{
    private void GestionarCatonero(APIsesion sesion) {
        System.out.println("Menu:");
        System.out.println("1: Dar de alta");
        System.out.println("2: Modificar Cartonero");
        System.out.println("3: Eliminar Cartonero");
        Scanner sc = new Scanner(System.in);
        String eleccion = sc.nextLine();

        boolean sorete = true;

        while (sorete == true){
        switch(eleccion) {
            case "1": //

            case "2"://

            case "3"://

            case "4":
                sorete = false;

            default:
        }
        }
    }

    public VistaSecretaria() {
    }

    public void desplegarMenu(APIsesion sesion) {
        System.out.println("MenuSecretaria:");
        System.out.println("1: Gestionar Cartoneros");
        System.out.println("2: Gestionar Instructivo");
        System.out.println("3: Gestionar Materiales Reciclabes");
        Scanner sc = new Scanner(System.in);
        String eleccion = sc.nextLine();


        switch(eleccion)
        {
            case "1" : this.GestionarCatonero(sesion);// se ingresan los datos, se manda un mensaje APi sesion que diga aggCartonero

            case "2" ://

            case "3"://

            default :
        }
    }

}

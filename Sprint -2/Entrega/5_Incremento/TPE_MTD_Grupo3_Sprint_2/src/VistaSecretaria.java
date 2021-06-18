import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class VistaSecretaria{

    private APIsesion aPIsession;

    private void GestionarCatonero(Secretaria secretaria) {

        boolean repetir = true;
        while(repetir) {
            System.out.println("Menu:");
            System.out.println("1: Agregar cartonero");
            System.out.println("2: Modificar Cartonero");
            System.out.println("3: Eliminar Cartonero");
            System.out.println("4: Cerrar Menu");
            Scanner sc = new Scanner(System.in);
            String eleccion = sc.nextLine();

            switch(eleccion) {
                case "1": {
                    String pattern = "dd/MM/yyyy";
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
                    System.out.println("A continuación se le pedirán los datos del cartonero:");
                    System.out.println("Ingrese el nombre del cartonero");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese el apellido del cartonero");
                    String apellido = sc.nextLine();
                    System.out.println("Ingrese la direccion del cartonero");
                    String direccion = sc.nextLine();
                    System.out.println("Ingrese la fecha de nacimiento del cartonero, con el formato: 01/02/1941");
                    String fecha =sc.nextLine();
                    ParsePosition pos= new ParsePosition(0);
                    Date date = simpleDateFormat.parse(fecha,pos);
                    String test = simpleDateFormat.format(date);
                    System.out.println(test);
                    System.out.println("Ingrese el DNI del cartonero");
                    int DNI = sc.nextInt();
                    System.out.println("Ingrese el vehiculo del cartonero");
                    char vehiculo =sc.next().charAt(0);
                    boolean registrado= aPIsession.agregarCartonero(secretaria,nombre,apellido,DNI,vehiculo,direccion, date);
                    if (registrado)
                        System.out.println("Cartonero guardado");
                    else
                        System.out.println("No se pudo guardar el cartonero");
                }
                    break;

                case "2":{
                    String pattern = "dd/MM/yyyy";
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
                    System.out.println("A continuación se le pedirán los datos del cartonero que quiere modificar, si no desea modificar presione ENTER:");
                    System.out.println("Ingrese el nombre del cartonero a modificar");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese el apellido del cartonero a modificar");
                    String apellido = sc.nextLine();
                    System.out.println("Ingrese la direccion del cartonero a modificar");
                    String direccion = sc.nextLine();
                    System.out.println("Ingrese la fecha de nacimiento del cartonero a modificar, con el formato: 01/02/1941");
                    String fecha =sc.nextLine();
                    ParsePosition pos= new ParsePosition(0);
                    Date date = simpleDateFormat.parse(fecha,pos);
                    String test = simpleDateFormat.format(date);
                    System.out.println(test);
                    System.out.println("Ingrese el DNI del cartonero a modificar");
                    int DNI = sc.nextInt();
                    System.out.println("Ingrese el vehiculo del cartonero a modificar");
                    char vehiculo =sc.next().charAt(0);
                    boolean modificado= aPIsession.modificarCartonero(secretaria,nombre,apellido,DNI,vehiculo,direccion, date);
                    if (modificado)
                        System.out.println("Cartonero modificado");
                    else
                        System.out.println("No se pudo modificar el cartonero");

                }
                    break;

                case "3":{
                    System.out.println("Ingrese el dni del Cartonero a eliminar");
                    int dni= sc.nextInt();
                    boolean eliminado= aPIsession.eliminarCartonero(secretaria,dni);
                    if(eliminado)
                        System.out.println("Cartonero eliminado");
                    else
                        System.out.println("No se pudo eliminar el cartonero");
                }
                    break;

                case "4": {
                    repetir = false;
                }
                    break;

                default:
            }
        }
    }

    public VistaSecretaria() {
        aPIsession = new APIsesion();
    }

    public void desplegarMenu(Secretaria secretaria) {
        boolean repetir=true;
        while(repetir) {
            System.out.println("MenuSecretaria:");
            System.out.println("1: Gestionar Cartoneros");
            System.out.println("2: Gestionar Instructivo");
            System.out.println("3: Gestionar Materiales Reciclabes");
            System.out.println("4: Cerrar menu");
            Scanner sc = new Scanner(System.in);
            String eleccion = sc.nextLine();

            switch (eleccion) {
                case "1": {
                    this.GestionarCatonero(secretaria);// se ingresan los datos, se manda un mensaje APi sesion que diga aggCartonero
                }break;
                case "2":{}break;//

                case "3":{}break;//

                case "4":{repetir=false;}break;//

                default:
            }
        }
    }
}

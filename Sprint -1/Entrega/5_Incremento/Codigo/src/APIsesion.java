public class APIsesion {
    private GestorCartonero gestorCartonero;

    boolean agregarCartonero(Secretaria secretaria, String nombre, String apellido, int dni, char vehiculo, String direccion){
        if(secretaria.isEstadoLogin()){
            gestorCartonero.agregarCartonero(nombre,apellido,dni,vehiculo,direccion);
            return true;
        }else
            return false;
    }

    //VistaSecretaria logearse(Secretaria s){
    //    if
    //}



    // se conecta con interfazLogin, y simula un login
    // si el login es true
    
}



































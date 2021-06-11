import java.util.ArrayList;

public class APIsesion {
    private GestorCartonero gestorCartonero=new GestorCartonero();

    public boolean agregarCartonero(Secretaria secretaria, String nombre, String apellido, int dni, char vehiculo, String direccion){
        if(secretaria.isEstadoLogin()){
            return gestorCartonero.agregarCartonero(nombre,apellido,dni,vehiculo,direccion);
        }else
            return false;
    }
    public VistaSecretaria logearse(ArrayList<String> datos, Secretaria secretaria){
        BaseDatos baseDatos = new BaseDatos();
        String nombre = baseDatos.getNombreUsuario();
        String clave = baseDatos.getClave();
        boolean fueExitoso=nombre.equals(datos.get(0)) && clave.equals(datos.get(1)); 
        secretaria.setEstadoLogin(fueExitoso);
            if (fueExitoso)
                return new VistaSecretaria();
            else
                return null; //El login no fue exitoso
    }







    //VistaSecretaria logearse(Secretaria s){
    //    if
    //}



    // se conecta con interfazLogin, y simula un login
    // si el login es true
    
}



































import java.util.ArrayList;
import java.util.Date;

public class APIsesion {
    private GestorCartonero gestorCartonero=new GestorCartonero();
    private GestorMateriales gestorMateriales= new GestorMateriales();

    public VistaSecretaria logearse(ArrayList<String> datos, Secretaria secretaria){
        ValidadorUsuario validador = new ValidadorUsuario();
        String nombre = validador.getNombreUsuario();
        String clave = validador.getClave();
        boolean fueExitoso=nombre.equals(datos.get(0)) && clave.equals(datos.get(1));
        secretaria.setEstadoLogin(fueExitoso);
            if (fueExitoso)
                return new VistaSecretaria();
            else
                return null; //El login no fue exitoso
    }

    public boolean agregarCartonero(Secretaria secretaria, String nombre, String apellido, int dni, char vehiculo, String direccion, Date fecha){
        if(secretaria.isEstadoLogin()){
            return gestorCartonero.agregarCartonero(nombre,apellido,dni,vehiculo,direccion,fecha);
        }else
            return false;
    }

    public boolean modificarCartonero(Secretaria secretaria, String nombre, String apellido,
                                      int dni, char vehiculo, String direccion, Date fecha) {
        if(secretaria.isEstadoLogin()){
            return gestorCartonero.modificarCartonero(nombre,apellido,dni,vehiculo,direccion,fecha);
        }else
            return false;
    }

    public boolean eliminarCartonero(Secretaria secretaria, int dni) {
        if(secretaria.isEstadoLogin()){
            return gestorCartonero.eliminarCartonero(dni);
        }else
            return false;
    }
}



































import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class GestorCartonero {
    private List<Cartonero> listaCartonero;


    public GestorCartonero() {
        this.listaCartonero = new ArrayList<Cartonero>();
        //this.registroKilos = new HashMap<>();
    }

    public List<Cartonero> getListaCartonero() {
        return listaCartonero;
    }

    public void setListaCartonero(List<Cartonero> listaCartonero) {
        this.listaCartonero = listaCartonero;
    }

    public boolean agregarCartonero(String nombre, String apellido, int dni, char vehiculo, String direccion, Date fecha) {
        Cartonero nuevoCartonero = new Cartonero(nombre, apellido, dni, vehiculo, direccion, fecha);
        if (!listaCartonero.contains(nuevoCartonero)) {
            listaCartonero.add(nuevoCartonero);
            return true;
        }
        return false;
    }

    public boolean eliminarCartonero(int dni) {
        for (Cartonero cartonero : this.listaCartonero) {
            if (cartonero.getDNI() == dni) {
                this.listaCartonero.remove(cartonero);
                return true;
            }
        }
        return false;
    }

    public boolean modificarCartonero(String nombre, String apellido, int dni, char vehiculo, String direccion, Date fecha){
        for (Cartonero cartonero : this.listaCartonero) {
            if (cartonero.getDNI() == dni) {
                cartonero.setNombre(nombre);
                cartonero.setApellido(apellido);
                cartonero.setVehiculo(vehiculo);
                cartonero.setDireccion(direccion);
                cartonero.setDNI(dni);
                cartonero.setFechaNacim(fecha);
                return true;
            }
        }
        return false;
    }
}




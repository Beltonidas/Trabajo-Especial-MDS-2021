import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GestorCartonero {
    List<Cartonero> listaCartonero;
    HashMap<Cartonero,Float> registroKilos;

    public GestorCartonero() {
        this.listaCartonero = new ArrayList<Cartonero>();
        this.registroKilos = new HashMap<>();
    }

    public List<Cartonero> getListaCartonero() {
        return listaCartonero;
    }

    public void setListaCartonero(List<Cartonero> listaCartonero) {
        this.listaCartonero = listaCartonero;
    }

    public boolean agregarCartonero(String nombre, String apellido, int dni, char vehiculo, String direccion){
        Cartonero nuevoCartonero = new Cartonero(nombre, apellido, dni, vehiculo, direccion);
        if (!listaCartonero.contains(nuevoCartonero)){
            listaCartonero.add(nuevoCartonero);
            return true;
        }
        return false;
    }
}




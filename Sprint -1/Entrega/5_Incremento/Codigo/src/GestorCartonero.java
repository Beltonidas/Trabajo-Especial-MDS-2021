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

    public HashMap<Cartonero, Float> getRegistroKilos() {
        return registroKilos;
    }

    public void setRegistroKilos(HashMap<Cartonero, Float> registroKilos) {
        this.registroKilos = registroKilos;
    }

    public boolean agregarCartonero(String nombre, String apellido, int dni, char vehiculo, String direccion){
        Cartonero nuevoCartonero = new Cartonero(nombre, apellido, dni, vehiculo, direccion);
        if (!listaCartonero.contains(nuevoCartonero)){
            listaCartonero.add(nuevoCartonero);
            return true;
        }
        return false;
    }

    public boolean quitarCartonero(Cartonero cartonero){
        if (listaCartonero.contains(cartonero)){
            listaCartonero.remove(cartonero);
            return true;
        }
        return false;
    }

    public void anadirKilos(Cartonero cartonero, Float kilo ){
        Float antiguoKilo = registroKilos.get(cartonero);
        registroKilos.put(cartonero, antiguoKilo+kilo);
    }
    public boolean modCartonero(String nombre, String apellido, int dni, char vehiculo, String direccion, Cartonero aCambiar){
        if(listaCartonero.contains(aCambiar)) {
            int posCartonero = listaCartonero.indexOf(aCambiar);
            Cartonero cartoneroMod = listaCartonero.get(posCartonero);
            cartoneroMod.setDireccion(direccion);
            cartoneroMod.setNombre(nombre);
            cartoneroMod.setApellido(apellido);
            cartoneroMod.setDNI(dni);
            cartoneroMod.setVehiculo(vehiculo);
            return true;
        }
        return false;
    }
}




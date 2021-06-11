import java.util.ArrayList;
import java.util.List;

public class Cartonero {
    private String nombre;
    private String apellido;
    private int dni;
    private char vehiculo;
    private String direccion;
    private List<String> listaRecorrido;

    public Cartonero(String nombre, String apellido, int dni, char vehiculo, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = this.dni;
        this.vehiculo = vehiculo;
        this.direccion = direccion;
        this.listaRecorrido = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return dni;
    }

    public void setDNI(int DNI) {
        this.dni = DNI;
    }

    public char getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(char vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<String> getListaRecorrido() {
        return listaRecorrido;
    }

    public void setListaRecorrido(List<String> listaRecorrido) {
        this.listaRecorrido = listaRecorrido;
    }
    public boolean agregarRecorrido(String recorrido){ //CREO, que se agregaba toodo el recorrido de una, y no de a una direccion
        if (!listaRecorrido.contains(recorrido)){
            listaRecorrido.add(recorrido);
            return true;
        }
        return false;
    }
    public boolean ingresarDomicilioVisitado(String domicilio){
        if(listaRecorrido.contains(domicilio)) {
            listaRecorrido.remove(domicilio);
            return true;
        }
        return false;
    }


}

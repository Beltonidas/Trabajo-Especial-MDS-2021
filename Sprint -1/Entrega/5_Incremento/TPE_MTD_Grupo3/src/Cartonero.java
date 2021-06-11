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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDNI(int DNI) {
        this.dni = DNI;
    }

    public void setVehiculo(char vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cartonero {
    private String nombre;
    private String apellido;
    private int dni;
    private char vehiculo;
    private String direccion;
    private List<String> listaRecorrido;
    private Date fechaNacim;

    public Cartonero(String nombre, String apellido, int dni, char vehiculo, String direccion, Date fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = this.dni;
        this.vehiculo = vehiculo;
        this.direccion = direccion;
        this.listaRecorrido = new ArrayList<>();
        this.fechaNacim = fecha;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 0)
            this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        if (apellido.length() > 0)
            this.apellido = apellido;
    }

    public void setDNI(int DNI) {
        if (nombre.length() > 0)
            this.dni = DNI;
    }

    public int getDNI() {
        return this.dni;
    }

    public void setVehiculo(char vehiculo) {
        if (vehiculo != '\0')
            this.vehiculo = vehiculo;
    }

    public void setDireccion(String direccion) {
        if (direccion.length() > 0)
            this.direccion = direccion;
    }


    public void setFechaNacim(Date fechaNacim) {
        if (fechaNacim != null)
            this.fechaNacim = fechaNacim;
    }
}
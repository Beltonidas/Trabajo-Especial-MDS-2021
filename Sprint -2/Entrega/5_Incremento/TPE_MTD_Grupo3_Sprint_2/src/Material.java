public class Material {

    private String nombre;
    private String tipo;
    private double kilos;


    public Material(String nombre, String tipo, double kilos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.kilos = kilos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getKilos() {
        return kilos;
    }

    public void agregarKilos(double kilos) {
        this.kilos += kilos;
    }

    @Override
    public boolean equals(Object o1){
        try {
            Material m= (Material) o1;
            return nombre.equals(m.getNombre()) &&  tipo.equals(m.getTipo());
        }
        catch (Exception e){
            return false;
        }

    }

    @Override
    public String toString() {
        return "Material{" +
                "nombre='" + nombre + '\'' +
                ", kilos=" + kilos +
                '}';
    }

}

public class Pasajeros {
    private String nombre;
    private String identificacion;
    private int edad;

    public Pasajeros(String nombre, String identificacion, int edad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", ID: " + identificacion + ", Edad: " + edad;
    }
}


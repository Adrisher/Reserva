public class Vuelo {
    private String ruta;
    private int asientosDisponibles;
    private int maxEquipaje;
    private double maxPesoEquipaje;

    public Vuelo(String ruta, int asientosDisponibles, int maxEquipaje, double maxPesoEquipaje) {
        this.ruta = ruta;
        this.asientosDisponibles = asientosDisponibles;
        this.maxEquipaje = maxEquipaje;
        this.maxPesoEquipaje = maxPesoEquipaje;
    }

    public boolean reservarAsiento() {
        if (asientosDisponibles > 0) {
            asientosDisponibles--;
            return true;
        } else {
            System.out.println("No hay asientos disponibles.");
            return false;
        }
    }

    public String getRuta() {
        return ruta;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public int getMaxEquipaje() {
        return maxEquipaje;
    }

    public double getMaxPesoEquipaje() {
        return maxPesoEquipaje;
    }
}


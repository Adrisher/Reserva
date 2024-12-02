public class Reserva {
    private Pasajeros pasajero;
    private Vuelo vuelo;
    private double precioBoleto;
    private long tiempoReserva;

    public Reserva(Pasajeros pasajero, Vuelo vuelo, double precioBoleto) {
        this.pasajero = pasajero;
        this.vuelo = vuelo;
        this.precioBoleto = precioBoleto;
        this.tiempoReserva = System.currentTimeMillis();
    }

    public boolean cancelarReserva(long tiempoLimite) {
        long tiempoActual = System.currentTimeMillis();
        if ((tiempoActual - tiempoReserva) <= tiempoLimite) {
            vuelo.reservarAsiento();
            return true;
        } else {
            double multa = precioBoleto * 0.2;
            System.out.println("Cancelación fuera del tiempo permitido. Multa: $" + multa);
            return false;
        }
    }

    public Pasajeros getPasajero() {
        return pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public double getPrecioBoleto() {
        return precioBoleto;
    }
}

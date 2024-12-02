import java.util.Scanner;

//

public class Reservas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Vuelo vuelo = new Vuelo("Quito - Guayaquil", 10, 2, 23.0);
        System.out.println("Bienvenido al sistema de reservas de vuelos");

        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su identificación: ");
        String id = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        Pasajeros pasajero = new Pasajeros(nombre, id, edad);

        
        System.out.print("Ingrese el precio del boleto: ");
        double precio = scanner.nextDouble();

        if (vuelo.reservarAsiento()) {
            Reserva reserva = new Reserva(pasajero, vuelo, precio);
            System.out.println("¡Reserva exitosa!");
            System.out.println("Datos de la reserva:");
            System.out.println(pasajero);
            System.out.println("Ruta: " + vuelo.getRuta());
            System.out.println("Asientos disponibles: " + vuelo.getAsientosDisponibles());
        } else {
            System.out.println("No se pudo completar la reserva.");
        }

        scanner.close();
    }
}


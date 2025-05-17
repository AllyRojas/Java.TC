package Solucion_Reto_01;

public class Principal {
    public static void main(String[] args) {
        
        Pasajero pasajero = new Pasajero("Pedrita Gutierrez", "P123456");

        
        Vuelo vuelo = new Vuelo("UX123", "Londres", "14:30");

        
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("✅ Reserva realizada exitosamente.\n");
        } else {
            System.out.println("❌ Reserva no disponible.\n");
        }

       
        System.out.println(vuelo.obtenerItinerario());

        
        System.out.println("❌ Cancelar reserva...\n");
        vuelo.cancelarReserva();

        
        System.out.println(vuelo.obtenerItinerario());

        
        vuelo.reservarAsiento("Gustvo Gonzalez", "P987654");
        System.out.println(vuelo.obtenerItinerario());
    }
}
package Solucion_Reto_01;

public class Vuelo {
    final String codigoVuelo;       // Constante
    String destino;
    String horaSalida;
    Pasajero asientoReservado;      // Se asignará una instancia o null

    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    
    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        } else {
            return false;
        }
    }

    
    public boolean reservarAsiento(String nombre, String pasaporte) {
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
    }

    
    public void cancelarReserva() {
        asientoReservado = null;
    }

    
    public String obtenerItinerario() {
        String info = "✈️Horarios del vuelo:\n";
        info += "Código: " + cVuelo + "\n";
        info += "Destino: " + D + "\n";
        info += "Salida: " + horaS + "\n";
        if (asientoReservado != null) {
            info += "Pasajero: " + asientoOcupado.nombre + "\n";
        } else {
            info += "Pasajero: [Sin reserva]\n";
        }
        return info;
    }
}
package Solucion_Reto_02;

public class Entrada {
    String evento;
    double precio;

   
    public Entrada(String evento, double precio) {
        this.evento = evento;
        this.precio = precio;
    }

    
    public void mostrarInformacion() {
        System.out.println("E: " + evento + " | P: $" + precio);
    }
}

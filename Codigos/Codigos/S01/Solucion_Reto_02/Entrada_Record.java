package Solucion_Reto_02;

public record Entrada_Record(String evento, double precio) {
    public void mostrarInformacion() {
        System.out.println("E: " + evento + " | P: $" + precio);
    }
}

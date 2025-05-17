package Solucion_Reto_01;

public class CentralEmergencias {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("UnidadAmbulancia", "Juan");
        Patrulla patrulla = new Patrulla("UnidadPatrulla", "Laura");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Marco");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }
}

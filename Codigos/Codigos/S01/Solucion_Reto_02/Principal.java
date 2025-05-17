package Solucion_Reto_02;


public class Principal {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("Concierto", 800.00);
        Entrada entrada2 = new Entrada("Obra de Teatro", 450.50);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        
        Entrada_Record entrada3= new Entrada_Record("Sinfónic", 1200.00);
        entrada3.mostrarInformacion();
    }
}

package Solucion_Reto_01;

public class Main {
    public static void main(String[] args) {

        Factura f1 = new Factura("FCT1348", "Tecnolochica 4", 1450.00);
        Factura f2 = new Factura("FCT1348", "Fundación Mujeres en STEM", 1450.00);

        System.out.println(f1);
        System.out.println(f2);

        System.out.println("¿Ambas facturas comparten el mismo folio?: " + f1.equals(f2));
    }
}

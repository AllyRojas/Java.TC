package Solucion_Reto_02;

public class Principal {
    public static void main(String[] args) {
        
        Factura facturaConRFC = new Factura(2500.0, "Precio de consultoría", "ABCC010101XYZ");

        
        Factura facturaSinRFC = new Factura(1800.0, "Reparación", null);

        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}
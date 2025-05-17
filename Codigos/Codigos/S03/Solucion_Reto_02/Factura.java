package Solucion_Reto_02;

import java.util.Optional;

public class Factura {
   
    private double monto;
    private String descripcion;
    private Optional<String> rfc; // Manejo seguro del valor nulo

    
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    
    public String getResumen() {
        String resumen = "📄 Factura Creada:\n";
        resumen += "D: " + descripcion + "\n";
        resumen += "M: $" + monto + "\n";

        
        resumen += "RFC: " + rfc.orElse("[No proporcionado]") + "\n";

        return resumen;
    }
}

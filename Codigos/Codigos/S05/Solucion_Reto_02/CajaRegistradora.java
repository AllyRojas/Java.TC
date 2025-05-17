package Solucion_Reto_02;

public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = {
                new PagoEfectivo(200.0),
                new PagoTarjeta(350.0, 600.0),
                new PagoTransferencia(230.0, false) // esta fallará en autenticación
        };

        for (MetodoPago pago : pagos) {
            if (pago.autenticar()) {
                System.out.println(" Operación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("Fallo en la operación. " + pago.getClass().getSimpleName() + " no válido.");
            }
            System.out.println();
        }
    }
}


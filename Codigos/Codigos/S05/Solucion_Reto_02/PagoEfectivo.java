package Solucion_Reto_02;

public class PagoEfectivo extends MetodoPago {

    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {
        return true; 
    }

    @Override
    public void procesarPago() {
        System.out.println(" Procesando pago en efectivo por $" + monto);
    }
}


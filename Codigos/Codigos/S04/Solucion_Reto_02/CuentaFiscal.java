package Solucion_Reto_02;

import java.util.Objects;

public class CuentaFiscal {

    private final String rfc;
    private double saldoDisponible;

    public CuentaFiscal(String rfc, double saldoDisponible) {
        this.rfc = rfc;
        if (saldoDisponible >= 0) {
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("⚠️ Saldo inválido. Se establecerá en cero por defecto.");
            this.saldoDisponible = 0;
        }
    }

    public String getRfc() {
        return rfc;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public boolean validarRFC(DeclaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    public void mostrarCuenta() {
        System.out.println("📄 Cuenta fiscal activa: RFC " + rfc + " | Saldo actual: $" + saldoDisponible);
    }
}

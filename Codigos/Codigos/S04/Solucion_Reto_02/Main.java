package Solucion_Reto_02;

public class Main {
    public static void main(String[] args) {

        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("TRL920605KT7", 8700.0);
        CuentaFiscal cuenta = new CuentaFiscal("TRL920605KT7", 9500.0);

        System.out.println("Nueva declaración registrada - RFC: " + declaracion.rfcContribuyente() +
                           " | Monto reportado: $" + declaracion.montoDeclarado());
        
        cuenta.mostrarCuenta();

        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("Coincidencia de RFC con cuenta fiscal: " + rfcValido);
    }
}

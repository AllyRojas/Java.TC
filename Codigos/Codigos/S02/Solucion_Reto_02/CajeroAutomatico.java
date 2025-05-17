package Solucion_Reto_02;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Crear objeto Scanner
        var saldo = 1000.0; // Saldo inicial
        int opcion; // Variable para almacenar la opción del menú

        
        do {
            // Mostrar menú de opciones
            System.out.println("\n💳 Hola, Bienvenido al cajero automático");
            System.out.println("1. Consultar credito");
            System.out.println("2. Depositar ");
            System.out.println("3. Retirar ");
            System.out.println("4. Salir");
            System.out.print("Selecciona un número de opción: ");

            opcion = scanner.nextInt(); // Leer la opción elegida por el usuario

            switch (opcion) {
                case 1 -> {
                    // Consultar saldo
                    System.out.println("🔎 Tu saldo es de: $" + saldo);
                }
                case 2 -> {
                    // Depositar dinero
                    System.out.print("💰 Ingresa el dinero a depositar: ");
                    double deposito = scanner.nextDouble();

                    if (deposito <= 0) {
                        System.out.println("⚠️ El monto no puede ser igual o menor a 0.");
                        continue; // Volver al menú sin modificar el saldo
                    }

                    saldo += deposito; // Aumentar el saldo
                    System.out.println("✅ Depósito realizado. Nuevo saldo actualizado: $" + saldo);
                }
                case 3 -> {
                    // Retirar dinero
                    System.out.print("💸 Ingresa el cantidad a retirar: ");
                    double retiro = scanner.nextDouble();

                    if (retiro <= 0) {
                        System.out.println("⚠️ El monto no puede ser igual o menor a 0.");
                        continue; // Volver al menú sin hacer nada
                    }

                    if (retiro > saldo) {
                        System.out.println("❌ Dinero insuficiente. Tu saldo es: $" + saldo);
                    } else {
                        saldo -= retiro; // Restar el monto del saldo
                        System.out.println("✅ Retiro exitoso. Dinero restante: $" + saldo);
                    }
                }
                case 4 -> {
                    // Salir del programa
                    System.out.println("👋 Gracias por usar el cajero.");
                }
                default -> {
                    // Opción no válida
                    System.out.println("🚫 Opción no valida. Intenta nuevamente.");
                }
            }

        } while (opcion != 4); // Salir cuando el usuario elija la opción 4

        scanner.close(); // Cerrar el Scanner
    }
}
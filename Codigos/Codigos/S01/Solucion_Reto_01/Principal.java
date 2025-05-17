package Solucion_Reto_01;

import java.util.Scanner;

public class Principal {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Paciente paciente1 = new Paciente();

       
        System.out.print("📝 Ingresa el nombre del paciente: ");
        paciente1.nombre = scanner.nextLine();

        System.out.print("🧮 Ingresa la edad del paciente: ");
        paciente1.edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("📁 Ingresa el número de expediente: ");
        paciente1.numeroExpediente = scanner.nextLine();

        
        paciente1.mostrarInformacion();

        
        scanner.close();
    }

}

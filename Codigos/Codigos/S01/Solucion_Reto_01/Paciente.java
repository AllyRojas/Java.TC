package Solucion_Reto_01;

import java.util.Scanner;

public class Paciente {
    String nombre;
    int edad;
    String numeroExpediente;

    
    void mostrarInformacion() {
        System.out.println("\n📋 Datos del paciente:");
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + numeroExpediente);
    }
}
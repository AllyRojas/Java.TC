package Solucion_Reto_01;

import java.util.*;

public class RegistroMuestras {
    public static void main(String[] args) {

        ArrayList<String> muestras = new ArrayList<>();
        muestras.add("Homo sapienss");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapienss");

        System.out.println("Listado de muestras registradas:");
        for (int i = 0; i < muestras.size(); i++) {
            System.out.println("Muestra " + (i + 1) + ": " + muestras.get(i));
        }

        HashSet<String> especiesUnicas = new HashSet<>(muestras);

        System.out.println("\nEspecies identificadas sin duplicados:");
        for (String especie : especiesUnicas) {
            System.out.println("* " + especie);
        }

        HashMap<String, String> muestrasInvestigador = new HashMap<>();
        muestrasInvestigador.put("M-001", "Dra. López");
        muestrasInvestigador.put("M-002", "Dr. Hernández");
        muestrasInvestigador.put("M-003", "Dra. Rivera");

        System.out.println("\nRelación de muestras con responsables:");
        for (Map.Entry<String, String> entry : muestrasInvestigador.entrySet()) {
            System.out.println("ID " + entry.getKey() + " asignado a: " + entry.getValue());
        }

        String idBuscar = "M-002";
        System.out.println("\nConsulta rápida → Responsable de la muestra " + idBuscar + ": " + muestrasInvestigador.get(idBuscar));
    }
}

package Solucion_Reto_02;

import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

class Tema implements Comparable<Tema> {
    String titulo;
    int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareTo(otro.titulo);
    }

    @Override
    public String toString() {
        return "Tema: " + titulo + " | Nivel de prioridad: " + prioridad;
    }
}

public class PlaneacionEducativa {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        Collections.sort(temas);
        System.out.println("Temas organizados por orden alfabético:");
        for (Tema t : temas) {
            System.out.println(t);
        }

        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema a, Tema b) {
                return Integer.compare(a.prioridad, b.prioridad);
            }
        });

        System.out.println("\nTemas ordenados según prioridad asignada (1 = más alta):");
        for (Tema t : temas) {
            System.out.println(t);
        }

        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/ambiente");

        System.out.println("\nAccesos directos a materiales educativos:");
        for (String tema : recursos.keySet()) {
            System.out.println("- " + tema + ": " + recursos.get(tema));
        }
    }
}

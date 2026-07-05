package sentencias_de_decision;

import java.util.Scanner;

public class SaludYFitness {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        final int META_PASOS_DIARIO = 10000;
        final double CALORIAS_POR_PASO = 0.04;

        System.out.println("---Aplicacion de Salud y Fitness---");

        System.out.println("por favor coloque su nombre");
        var nombre = consola.nextLine();

        System.out.println("coloque sus pasos caminados en el dia");
        var pasos = Integer.parseInt(consola.nextLine());

        var caloriasQuemadas = pasos * CALORIAS_POR_PASO;

        var metaAlcanzada = pasos >= META_PASOS_DIARIO ? "Si, meta alcanzada" : "No, esfuerzate más";

//        System.out.println("quemaste " + caloriasQuemadas + " en el día");
//        System.out.println(metaAlcanzada);
        System.out.printf("""
                Usuario: %s
                Pasos dados hoy: %d
                Calorias quemadas: %.2f
                Meta de pasos diario alcanzada: %s 
                --------------------------------------
                La meta de pasos diarios es de: %d
                Y se quema %.2f por paso dado
                """, nombre, pasos, caloriasQuemadas, metaAlcanzada,
                META_PASOS_DIARIO, CALORIAS_POR_PASO);

    }
}

package sentencias_de_decision;

import java.util.Scanner;

public class EstacionAnioNuevaSintaxis {
	public static void main(String[] args) {
		System.out.println("estacion del año");

        var consola = new Scanner(System.in);

        System.out.println("proporciona el valor del mes (1-12):");
        var mes = Integer.parseInt(consola.nextLine());
        
        
        var estacion = switch(mes){
	        case 1, 2, 12 -> "Invierno";
	        case 3, 4, 5 -> "Primavera";
	        case 6, 7, 8 -> "Verano";
	        case 9, 10, 11 -> "Otoño";
	        default -> "Estacion desconocida";
        };
        

        System.out.printf("La estacion para el mes %d, es %s", mes, estacion);
		
	}
}

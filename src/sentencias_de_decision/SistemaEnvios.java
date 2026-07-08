package sentencias_de_decision;

import java.util.Scanner;

public class SistemaEnvios {
//	public static final int NACIONAL = 10;
//	public static final int INTERNACIONAL = 18;
	
	public static void main(String[] args) {
		System.out.println("SISTEMA DE ENVIOS");
		
		var consola = new Scanner(System.in);
		
		System.out.println("coloca el destino: nacional | internacional");
		var destino = consola.nextLine();
		
		System.out.println("coloca el peso en kg");
		var peso = Double.parseDouble(consola.nextLine());
		
		var costoEnvio = 0;
		
		if (destino.equals("nacional")) {
			costoEnvio = peso * 10;
		}
	}
}

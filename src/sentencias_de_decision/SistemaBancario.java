package sentencias_de_decision;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("Bienvenidos al sistema bancario");

        var consola = new Scanner(System.in);

        System.out.println("Deseas salir del sistema? true/false");
        var salirSistema = Boolean.parseBoolean(consola.nextLine());

        // verificamos aplicando logica inversa

        if (!salirSistema){
            System.out.println("continuamos dentro del sistema");
        }else{
            System.out.println("saliendo del sistema");
        }
    }
}

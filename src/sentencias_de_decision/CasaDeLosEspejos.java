package sentencias_de_decision;

import java.util.Scanner;

public class CasaDeLosEspejos {
    public static void main(String[] args) {
        System.out.println("bienvenido a la casa de los espejos");

        var consola = new Scanner(System.in);

        System.out.print("Cuantos años tienes? ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.println("Tienes miedo a la oscuridad?");
        var tieneMiedo = Boolean.parseBoolean(consola.nextLine());

        if(!tieneMiedo && edad > 10){
            System.out.println("Puedes ingresar");
        }else{
            System.out.println("Retirese");
        }
    }
}

package sentencias_de_decision;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("Operador ternario");
        var consola = new Scanner(System.in);
        //condicion ? exp1 : exp2
        System.out.print("coloca un numero: ");
        var numero = Double.parseDouble(consola.nextLine());
        var resultado = (numero % 2 == 0) ? "par" : "impar";

        System.out.printf("El numero %.2f es: %s%n", numero, resultado);

        //calcular si es mayor de edad
        System.out.println("coloca tu edad");
        var edad = Double.parseDouble(consola.nextLine());
        var esMayor = edad >= 18 ? "eres mayor de edad" : "no eres mayor de edad";

        System.out.println(esMayor);

        //calcular si es positivo o negativo
        resultado = (numero > 0) ? "es positivo" : (numero < 0) ? "es negativo" : "es cero";
        System.out.printf("tu numero %.2f es: %s", numero, resultado);
    }


}

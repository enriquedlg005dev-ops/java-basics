package sentencias_de_decision;

public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("dia de la semana con switch");

        var dia = 3;

        switch (dia){
            case 1:
                System.out.println("lunes");
                //en caso se elimine la sentencia break y comience con el dia 1
                //este seguirá evaluando los demas casos hasta que encuentre el break
                //sin necesidad de la evaluacion de caso
                //entonces si quitamos este break, imprimirá lunes y martes
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("dia invalido: " + dia + "no existe en la semana");
                break; // este break es opcional porque ya no hay nada mas que evaluar
        }
    }
}

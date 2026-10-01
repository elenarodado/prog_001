import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        // void -> retorna 0/nada, el metodo solo va a hacer ejecuciones
        // String[] args -> argumentos, es lo que yo le doy al metodo para que enmpiece a funcionar (como instrucciones)

        System.out.println("Programa para explicar los operadores");

        // Scanner permite realizar lecuras por teclado
        // variable compleja -> palabra reservada new + nombre tipo (Scanner) + sistema de entrada (System.in)
        Scanner lector = new Scanner(System.in);

        System.out.println("Indícame tu nombre: ");
        String nombre = lector.nextLine(); // nextLine: utiliza espacios (ej: Borja Herrera) | next: no espacios (ej: Borja) -> Son para String

        System.out.println("¿En qué ciclo estás matriculado?");
        String ciclo = lector.nextLine();

        System.out.println("¿Qué nota esperas en este año de "+ciclo+ "?");
        double nota = lector.nextDouble(); // nextInt para numeros sin decimales, con decimales nextDouble o nextFloat

        System.out.println("¿Esperas aprobar?");
        boolean aprobado = lector.nextBoolean();

        System.out.println("Nombre: "+nombre.toUpperCase()); //.toUpperCase es una funcionalidad del String
        System.out.println("Ciclo: "+ciclo);
        System.out.println("Media: "+nota);

        // TIPOS DE OPERADORES:
        // ------> ARITMETICOS: operaciones de +, -, *, /, %
        // ------> ASIGNACION: da un valor =, +=, -=, *=, %=
        // ------> RELACIONALES - COMPARACION: comparan dos o mas variables entre si: <, <=, >, >=, ==, !=
        // ------> LOGICOS: preguntan por sentencias &&, ||

    }
}

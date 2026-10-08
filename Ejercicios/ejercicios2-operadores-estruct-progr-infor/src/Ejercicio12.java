import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        // todo EJERCICIO 12 - Cadena de caracteres
        /*
        Hágase una aplicación que lea dos cadenas y las compare del siguiente modo:

        a) Son iguales
        b) La primera es menor que la segunda *
        c) Son distintas
        (CompararCadenas)

        *ENTRADA/SALIDA*
        Escribe una palabra: **hola**
        Escribe una palabra: **adios**
        Son iguales: false
        La primera es menor que la segunda: false
        Son distintas: true
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe una palabra: ");
        String cadena1 = scanner.nextLine();

        System.out.println("Escribe otra palabra: ");
        String cadena2 = scanner.nextLine();

        boolean comparativa = cadena1.equals(cadena2);
        System.out.println("Son iguales: "+comparativa);

        int tamano1 = cadena1.length();
        int tamano2 = cadena2.length();
        boolean comparativa2 = tamano1 < tamano2;
        System.out.println("La primera es menor que la segunda: "+comparativa2);

        boolean comparativa3 = tamano1 == tamano2;
        System.out.println("Son distintas: "+!comparativa3);

        scanner.close();
    }
}

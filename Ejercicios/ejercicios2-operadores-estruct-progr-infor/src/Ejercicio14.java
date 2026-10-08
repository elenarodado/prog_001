import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        // todo EJERCICIO 14 - Introducción edad
        /*
        Hágase una aplicación que permita introducir la edad de una persona (valores enteros entre 0 y 100),
        su nivel de estudios (valores entre 0 y 10) y sus ingresos (valores enteros entre 0 y 25000).
        Compruébese (mostrándose verdadero o falso) si dicha persona tiene más de 40 años,
        un nivel de estudios entre 5 y 8, ambos incluisives, y gana menos de 15000 €. (CondicionLogica)

        *ENTRADA/SALIDA*

        Edad: **23**
        Nivel de estudios: **8**
        Ingresos: **1200**
        Mas de 40 años y estudios entre 5 y 8 y gana menos de 15000: false
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Edad: ");
        int edad = scanner.nextInt();
        System.out.println("Nivel de estudios: ");
        int nivelEstudios = scanner.nextInt();
        System.out.println("Ingresos: ");
        double ingresos = scanner.nextDouble();
        boolean condicion = edad>40 && nivelEstudios >=5 && nivelEstudios <=8 && ingresos<1500;
        System.out.println("Mas de 40 años y estudios entre 5 y 8 y gana menos de 15000: "+condicion);

        scanner.close();
    }
}

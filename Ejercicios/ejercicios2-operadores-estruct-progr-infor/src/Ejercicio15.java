import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        // todo EJERCICIO 1 - Lectura y modificación de variables
        /*
        Se lee un entero que se modifica de la siguiente manera:
        a) Incrementar en 5 unidades (+=5).
        b) Decrementar en 3 unidades(-=3).
        c) Multiplicar por 10 (*=10)
        d) Dividir por 2 (/=2)
        e) Mostrar dicho entero en cada uno de los apartados anteriores.
        (AsignarEntero)

        *ENTRADA/SALIDA*
        ENTERO: **21**
        Incrementar 5 unidades: 26
        Decrementar 3 unidades: 23
        Multiplicar por 10:
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Número entero: ");
        int numero = scanner.nextInt();
        numero +=5;
        System.out.println("Incrementar 5 unidades: "+numero);
        numero -=3;
        System.out.println("Decrementar 3 unidades: "+numero);
        numero *=10;
        System.out.println("Multiplicar 10 unidades: "+numero);

        scanner.close();
    }
}

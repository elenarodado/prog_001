import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        // todo EJERCICIO 11 - Condiciones números
        /*
        Hágase una aplicación que lea un entero entre 0 y 100.
        Compruébese (mostrándose verdadero o falso) las siguientes condiciones:
        a) Es par
        b) Es mayor que 50
        (CompararEntero)
        *ENTRADA/SALIDA*
        Escribe un entero entre 0 y 100: **55**
        Par: false
        Mayor que 50: true
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un número entero del 0 al 100: ");
        int numero = scanner.nextInt();
        int resultadoPar = numero%2;
        boolean condicion = resultadoPar==0 && numero>50;
        boolean condicion1 = resultadoPar==0;
        boolean condicion2 = numero>50;
        System.out.println("¿Es Par y mayor que 50 el número? "+condicion);
        System.out.println("Par: "+condicion1);
        System.out.println("Mayor que 50: "+condicion2);
    }
}

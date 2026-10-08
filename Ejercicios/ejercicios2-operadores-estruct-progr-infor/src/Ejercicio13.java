import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        // todo EJERCICIO 13 - Lectura números
        /*
        Lea dos números entre 0 y 9, ambos inclusive.
        Compruébese (mostrándose verdadero o falso) las siguientes condiciones e indíquese cómo se evalúan:

        a) El primero es par y el segundo impar
        b) El primero es superior al doble del segundo e inferior a 8
        c) Son iguales o la diferencia entre el primero y el segundo es menor que 2
        (CompararEnteros)

        *ENTRADA/SALIDA*
        Escribe un número entre 0 y 9: **4**
        Escribe un número entre 0 y 9: **7**
        El primero es par y el segundo impar: true
        El primero es superior al doble del segundo e inferior a 8: false
        Son iguales o la diferencia entre el primero y el segundo es menor que 2: true
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un número entre 0 y 9: ");
        int numero1 = scanner.nextInt();
        System.out.println("Escribe otro número entre 0 y 9: ");
        int numero2 = scanner.nextInt();

        boolean numeroPar1 = numero1%2 == 0;
        boolean numeroPar2 = numero2%2 == 0;
        boolean condicion1 = numeroPar1 && !numeroPar2;
        System.out.println("El primero es par y el segundo impar: "+condicion1);

        boolean numero1Condicion = numero1 > 2*numero2 && numero1 < 8;
        System.out.println("El primero es superior al doble del segundo e inferior a 8: "+numero1Condicion);

        boolean numerosCondicion = numero1 == numero2 || numero1 >= numero2 - 2 || numero1 <= numero2 + 2;
        System.out.println("Son iguales o la diferencia entre el primero y el segundo es menor que 2: "+numerosCondicion);

        scanner.close();
    }
}

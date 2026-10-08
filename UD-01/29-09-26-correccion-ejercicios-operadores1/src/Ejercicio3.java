import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // URL -> https://four-crime-470.notion.site/EJERCICIOS-CLASE-10e9b610a38d801dbc5dceaaeee4b20b

        Scanner scanner = new Scanner(System.in);

        // todo EJERCICIO 3 - Operaciones Variables
        /*
        Hágase un programa que lea dos variables enteras y obtenga las siguientes operaciones:
        a) Suma
        b) Resta
        c) Multiplicación
        d) División entera
        e) Resto
        f) División real
        g) Resto real
        (Operaciones)

        ENTRADA/SALIDA
        ENTERO: 24
        ENTERO: 7
         */
        System.out.println("Escribe el primer operador: ");
        int operador1 = scanner.nextInt();
        System.out.println("Escribe el segundo operador: ");
        int operador2 = scanner.nextInt();

        int suma = operador1+operador2;
        System.out.println("La suma entre dos operandos es: "+suma);

        int resta = operador1-operador2;
        System.out.printf("La resta de %d y %d es: %d \n",operador1,operador2,resta);

        int multiplicacion = operador2*operador1;
        System.out.printf("La multi de %d y %d es: %d \n",operador1,operador2,multiplicacion);

        double division = (double) operador2/operador1;
        System.out.printf("La divi de %d y %d es: %.2f \n",operador1,operador2, division);

        int modulo = operador2%operador1;
        System.out.printf("La mod de %d y %d e: %d \n",operador1,operador2,modulo);

        scanner.close();
    }
}

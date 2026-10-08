import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        // todo EJERCICIO 7 - Circunferencia valores
        /*
        Permítase introducir el valor del radio de una circuferencia con valores entre 0 y 100.
        Obténgase la longitud de la circunferencia (2πr) y el área del circulo (πr2) .(Circunferencia)
        NOTA El valor de PI se obtiene con Math.PI

        *ENTRADA/SALIDA*
        Escribe un radio entero: **15**
        Longitud de la circunferencia: 94.24777960769379
        Area de circulo: 706.8583470577034
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un radio: ");
        double radioCircum = scanner.nextDouble();
        double areaCircum = Math.pow(radioCircum,2) * Math.PI;
        double longitud = 2*Math.PI*radioCircum;
        System.out.printf("Longitud del círculo: %.2f\n",longitud);
        System.out.printf("Area del círculo: %.2f\n",areaCircum);

        scanner.close();
    }
}

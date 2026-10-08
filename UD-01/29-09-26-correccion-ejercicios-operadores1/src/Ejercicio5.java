import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // todo EJERCICIO 5 - Conversión tiempo
        /*
        Hágase un programa que convierta segundos en horas, minutos y segundos.(Segundos)

        *ENTRADA/SALIDA*

        Número de segundos: **24973**
        Horas: 6
        Minutos: 56
        Segundos: 13
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Número de segundos: ");
        int segundosTotales = scanner.nextInt();

        int minutos = segundosTotales/60;
        int horas = minutos/60;
        System.out.println("Horas: "+horas);

        int restoHoras = minutos%60;
        System.out.println("Minutos: "+restoHoras);

        int segundos = segundosTotales%60;
        System.out.println("Segundos: "+segundos);

        scanner.close();
    }
}

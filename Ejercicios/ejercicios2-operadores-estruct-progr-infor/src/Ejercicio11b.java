import java.util.Scanner;

public class Ejercicio11b {
    public static void main(String[] args) {

        // todo EJERCICIO 11b - Condiciones precio
        /*
        Hágase una aplicación que permita comprobar si puedo comprarme una serie de artículos.
        Para ello, el sistema pedirá por consola la cantidad de dinero en euros que tengo,
        el IVA que se aplica en este momento y el precio de dos articulos (sin IVA). El sistema indicará:
        - Si puedo comprar el primer artículo solo
        - Si puedo comprar el segundo artículo solo
        - Si puedo comprar ámbos artículos juntos
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuánto dinero tiene disponible? ");
        double dinero = scanner.nextDouble();

        System.out.println("¿Cuánto IVA se le aplica? ");
        double iva = scanner.nextInt()+100;

        System.out.println("Dígame el precio del primer artículo bruto: ");
        double precio1 = scanner.nextDouble();

        System.out.println("Dígame el precio del segundo artículo bruto: ");
        double precio2 = scanner.nextDouble();

        double precio1Iva = precio1*(iva/100);
        double precio2Iva = precio2*(iva/100);

        boolean condicion1 = dinero>=precio1Iva;
        System.out.println("¿Puedo comprar el primer artículo? " +condicion1);

        boolean condicion2 = dinero>=precio2Iva;
        System.out.println("¿Puedo comprar el segundo artículo? " +condicion2);

        boolean condicion3 = dinero>=precio1Iva+precio2Iva;
        System.out.println("¿Puedo comprar los dos artículos? "+condicion3);

        scanner.close();
    }
}

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // todo EJERCICIO 6 - Calculo precio - iva
        /*
        Permítase introducir el valor con IVA de una compra con dos decimales
        (la compra no puede ser superior a 500€ ni inferior a 0€)
        y el valor del IVA de dicha compra (valor entero entre 0 y 25%).
        ¿Cuánto costó la compra sin IVA?¿Cuánto fue el IVA? Muéstrese los resultados redondeados a dos decimales. (Compra)

        *ENTRADA/SALIDA*
        Valor de la compra (entre 0.00 y 500.00):**298,45**
        IVA (entre 0 y 25%):**12**
        Compra: 266.47
        IVA: 31.98
        ======
        298.45
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor de la compra: (entre 0.00 y 500.00)");
        double compraIva = scanner.nextDouble();

        System.out.println("Introduce el valor del IVA: (entre 0 y 25%)");
        int porcentajeIva = scanner.nextInt();

        double compraSinIva = (compraIva*100)/(porcentajeIva+100);
        System.out.println("La compra sin IVA es de: "+compraSinIva);

        double ivaEuros = compraIva-compraSinIva;
        System.out.println("El IVA equivale a: "+ivaEuros);

        scanner.close();
    }
}

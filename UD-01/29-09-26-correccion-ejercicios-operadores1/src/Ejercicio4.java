import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // todo EJERCICIO 4 - Carta amigos
        /*
        Unos amigos entra en un bar que ofrece las bebidas a 1,25€ y los bocadillos a 2,05€.
        El camarero les pregunta cuántas bebidas y bocadillos quieren.
        Calcula el coste de la consumición, mostrando primero el coste de las bebidas y de los bocadillos. (Bar)

        ENTRADA/SALIDA
        Número de bebidas: 3
        Número de bocadillos: 5
        Coste de las bebidas: 3.75
        Coste de los bocadillos: 10.25
        Coste consumición: 14.0
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica el número de bebidas: ");
        int numBebidas = scanner.nextInt();
        System.out.println("Indica el número de bocadillos: ");
        int numBocadillos = scanner.nextInt();
        final double COSTEBEBIDAS = 1.25; // final-> para que nadie lo pueda cambiar
        final double COSTEBOCADILLOS = 2.05;
        double costeTotal = (numBebidas*COSTEBEBIDAS)+(numBocadillos*COSTEBOCADILLOS);

        System.out.println("Número de bebidas: "+numBebidas);
        System.out.println("Número de bocadillos: "+numBocadillos);
        System.out.printf("Coste de las bebidas: %.2f\n",numBebidas*COSTEBEBIDAS);
        System.out.printf("Coste de los boocadillos: %.2f\n",numBocadillos*COSTEBOCADILLOS);
        System.out.printf("Coste consumición: %.2f\n",costeTotal);

        scanner.close();
    }
}

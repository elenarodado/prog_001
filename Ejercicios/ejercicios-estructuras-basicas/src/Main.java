import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // EJERCICIO 1: Definir y mostrar variables
        /* Crea un programa que defina tres variables: nombre, edad y ciudad.
        Asigna valores a cada una y muestra su contenido en la consola.*/

        System.out.println("---EJERCICIO 1---");
        String nombreEj1 = "Ana";
        int edad = 25;
        String ciudad = "Madrid";
        System.out.println(nombreEj1);
        System.out.println(edad);
        System.out.println(ciudad);


        // EJERCICIO 2: Modificar variables
        /* Crea un programa que defina una variable llamada puntuación con valor inicial 0.
        Luego, modifica su valor tres veces y muestra el resultado final.
         */

        System.out.println("---EJERCICIO 2---");
        int puntuacion = 0;
        System.out.println("Puntuación inicial: "+puntuacion);
        puntuacion = 5;
        System.out.println("Después de primera modificación: "+puntuacion);
        puntuacion = 10;
        System.out.println("Después de segunda modificación: "+puntuacion);
        puntuacion = 15;
        System.out.println("Puntuación final: "+puntuacion);


        // EJERCICIO 3: Tipos de Variables
        /* Define cinco variables con diferentes tipos de datos (String, int, boolean, double, char)
        y muestra tanto su valor como su tipo.*/

        System.out.println("---EJERCICIO 3---");
        String nombreEj3 = "Carlos";
        int edadEj3 = 30;
        boolean estudianteEj3 = true;
        double altura = 1.75;
        char inicial = 'C';
        System.out.println("Nombre: "+nombreEj3+ " - Tipo: String");
        System.out.println("Edad: "+edadEj3+ " - Tipo: int");
        System.out.println("¿Es estudiante?: "+estudianteEj3+ " - Tipo: boolean");
        System.out.println("Altura: "+altura+ " - Tipo: double");
        System.out.println("Inicial: "+inicial+ " - Tipo: char");


        // EJERCICIO 4: Variables con nombres descriptivos
        /* Crea un programa que simule la información de un libro usando variables con nombres descriptivos.
        Muestra toda la información del libro en la consola.*/

        System.out.println("---EJERCICIO 4---");
        Scanner lector = new Scanner (System.in);
        System.out.println("Títuilo:");
        String titulo = lector.nextLine();
        System.out.println("Autor:");
        String autorEj4 = lector.nextLine();
        System.out.println("Año de publicación:");
        int anoPublicacion = lector.nextInt();
        System.out.println("Número de páginas:");
        int numPaginas = lector.nextInt();
        System.out.println("¿Disponible en biblioteca?:");
        boolean stock = lector.nextBoolean();

        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autorEj4);
        System.out.println("Año de publicacion: "+anoPublicacion);
        System.out.println("Número de páginas: "+numPaginas);
        System.out.println("¿Disponible en biblioteca?: "+stock);


        // EJERCICIO 5: Declaración y uso de constantes
        /* Crea un programa que use constantes para almacenar información que no debe cambiar
        (como el valor de PI o el nombre de una aplicación) y variables para información
        que puede cambiar. Muestra todos los valores.*/

        System.out.println("---EJERCICIO 5---");
        final String APP = "MiApp";
        System.out.println("Aplicación: "+APP);
        String version = "1.0.0";
        System.out.println("Versión: "+version);
        final float PI = 3.14159f;
        System.out.println("Valor de PI: "+PI);
        String user = "Laura";
        System.out.println("Usuario actual: "+user);
        int nivel = 1;
        System.out.println("Nivel: "+nivel);
        int puntuacionEj5 = 0;
        System.out.println("Puntuación: "+puntuacionEj5);
        user = "Miguel";
        System.out.println("Usuario actualizado: "+user);
        nivel++;
        System.out.println("Nivel actualizado: "+nivel);
        puntuacionEj5 = 150;
        System.out.println("Puntuación actualizada: "+puntuacionEj5);
    }
}

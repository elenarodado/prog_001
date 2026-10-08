import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // URL -> https://four-crime-470.notion.site/EJERCICIOS-CLASE-10e9b610a38d801dbc5dceaaeee4b20b

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
        int operador1 = 8;
        int operador2 = 10;

        int suma = operador1+operador2;
        System.out.println("La suma entre dos operandos es: "+suma);

        int resta = operador1-operador2;
        System.out.println("La resta entre dos operandos es: "+resta);

        int multiplicacion = operador2*operador1;
        System.out.println("La multiplicación entre dos operandos es: "+multiplicacion);

        double division = (double)operador2/operador1;
        System.out.println("La división entre dos operandos es: "+division);

        int modulo = operador2%operador1;
        System.out.println("El resto entre dos operandos es: "+modulo);

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

        int numBebidas = 3;
        int numBocadillos = 5;
        double costeBebidas = 1.25;
        double costeBocadillos = 2.05;
        double costeTotal = (numBebidas*costeBebidas)+(numBocadillos*costeBocadillos);

        System.out.println("Número de bebidas: "+numBebidas);
        System.out.println("Número de bocadillos: "+numBocadillos);
        System.out.println("Coste de las bebidas: "+numBebidas*costeBebidas);
        System.out.println("Coste de los boocadillos: "+numBocadillos*costeBocadillos);
        System.out.println("Coste consumición: "+costeTotal);

        // todo EJERCICIO 5 - Conversión tiempo
        /*
        Hágase un programa que convierta segundos en horas, minutos y segundos.(Segundos)

        *ENTRADA/SALIDA*

        Número de segundos: **24973**
        Horas: 6
        Minutos: 56
        Segundos: 13
         */

        int segundosTotales = 24973;

        int minutos = segundosTotales/60;
        int horas = minutos/60;
        System.out.println("Horas: "+horas);

        int restoHoras = minutos%60;
        System.out.println("Minutos: "+restoHoras);

        int segundos = segundosTotales%60;
        System.out.println("Segundos: "+segundos);

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
        double porcentajeIva = scanner.nextInt();

        double compraSinIva = (compraIva*100)/(porcentajeIva+100);
        System.out.println("La compra sin IVA es de: "+compraSinIva);

        double ivaEuros = compraIva-compraSinIva;
        System.out.println("El IVA equivale a: "+ivaEuros);

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

        System.out.println("Escribe un radio entero: ");
        int radioCircum = scanner.nextInt();
        double areaCircum = (radioCircum*radioCircum) * Math.PI;
        double longitud = 2*Math.PI*radioCircum;
        System.out.println("Longitud del círculo: "+longitud);
        System.out.println("Area del círculo: "+areaCircum);

        // todo EJERCICIO 8 - Conversión temperaturas
        /*
        Hágase una aplicación que permita realizar conversiones de temperaturas entre grados
        centígrados, farenheit y kelvin (los resultados se muestran redondeados a dos
        decimales). (Temperaturas)

        *ENTRADA/SALIDA*
        Centigrados: **15,70**
        Farenheit: 60,26
        Kelvin: 288,85
        Grados Farenheit: **45,32**
        Centigrados: 7,4
        Kelvin: 280,55
        Grados Kelvin: **345,23**
        Centigrados: 72,08
        Farenheit: 161,74
         */

        // DE CELSIUS A: FARENHEIT Y KELVIN
        double celsius = 15.70;
        System.out.println("Celsius: "+celsius);
        double farenheit = 9*celsius/5+32;
        System.out.println("Farenheit: "+farenheit);
        double kelvin = celsius + 273.15;
        System.out.println("Kelvin: "+ kelvin);
        // DE FARENHEIT A: CELSIUS Y KELVIN
        double farenheit2 = 45.32;
        System.out.println("Farenheit: "+farenheit2);
        double celsius2 = 5*(farenheit2-32)/9;
        System.out.println("Celsius: "+celsius2);
        double kelvin2 = 5*(farenheit2-32)/9+273.15;
        System.out.println("Kelvin: "+ kelvin2);
        // DE KELVIN A: CELSIUS Y FARENHEIT
        double kelvin3 = 345.23;
        System.out.println("Kelvin: "+kelvin3);
        double celsius3 = kelvin3-273.15;
        System.out.println("Celsius: "+celsius3);
        double farenheit3 = 9*(kelvin3-273.15)/5+32;
        System.out.println("Farenheit: "+farenheit3);

        // todo EJERCICIO 9 - Carta
        /*
        Hágase una aplicación que permita introducir el número de bebidas y
        bocadillos comprados (valores entre 0 y 20).
        Además se podrá introducir el precio de cada bebida (valor entre 0.00 € y 3.00 €)
        y de cada bocadillo (valor entre 0.00 € y 5.00 €). También se podrá introducir
        el número de alumnos que realizaron la compra (valor entre 0 y 10). Se mostrará el
        total de la compra (con el subtotal de las bebidas y de los bocadillos) y la
        cantidad que debe pagar cada alumno redondeada a 2 decimales. (CosteBar)

        *ENTRADA/SALIDA*
        Número de bebidas (entre 0 y 20): **3**
        Número de bocadillos (entre 0 y 20): **5**
        Precio de cada bebida (entre 0,00 y 3,00): **1,20**
        Precio de cada bocadillo (entre 0,00 y 3,00): **2,05**
        Número de alumnos (entre 1 y 10): **5**
         */
        System.out.println("Introduce el número de bebidas: ");
        double numBebidas1 = scanner.nextDouble();
        System.out.println("Introduce el número de bocadillos: ");
        double numBocadillos1 = scanner.nextDouble();
        System.out.println("Introduce el precio de cada bebida: ");
        double precioBebidas = scanner.nextDouble();
        System.out.println("Introduce el precio de cada bocadillo: ");
        double precioBocadillos = scanner.nextDouble();
        System.out.println("Número de alumnos que han comprado: ");
        int alumnos = scanner.nextInt();

        double costeTotalBedidas = numBebidas1*precioBebidas;
        double costeTotalBocadillos = numBocadillos1*precioBocadillos;
        double costeTotal1 = costeTotalBedidas+costeTotalBocadillos;
        double precioRepartidoAlumnos = costeTotal1/alumnos;
        System.out.println("Precio total de bebidas: "+costeTotalBedidas);
        System.out.println("Precio total de bocadillos: "+costeTotalBocadillos);
        System.out.println("Coste total: "+costeTotal1);
        System.out.println("Precio de cada alumno: "+precioRepartidoAlumnos);

        // todo EJERCICIO 10 - Descomposicion número
        /*
        Se introducen los 5 dígitos de un número (decenas de mil,
        unidades de mil, centenas, decenas y unidades),
        y se obtiene el número correspondiente. (Numero)

        *ENTRADA/SALIDA*
        Decenas de mil: **7**
        Unidades de mil: **9**
        Centenas: **0**
        Decenas: **5**
        Unidades: **0**
        Numero introducido: 79050
         */
        System.out.println("Decenas de mil: ");
        int decenasMil = scanner.nextInt();
        System.out.println("Unidades de mil: ");
        int unidadesMil = scanner.nextInt();
        System.out.println("Centenas: ");
        int centenas = scanner.nextInt();
        System.out.println("Decenas: ");
        int decenas = scanner.nextInt();
        System.out.println("Unidades: ");
        int unidades = scanner.nextInt();

        int numeroTotal = (decenasMil*10000)+(unidadesMil*1000)+(centenas*100)+(decenas*10)+(unidades);
        System.out.println("Número introducido: "+numeroTotal);
    }
}

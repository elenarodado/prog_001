import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        // TIPOS DE OPERADORES:
        // todo ------> ARITMETICOS: operaciones de +, -, *, /, % (cuidado con la suma de dos string)
        int operador1 = 5;
        int operador2 = 2;
        int suma = operador1+operador2;
        int resta = operador1-operador2;
        int multiplicacion = operador1*operador2;
        double division = (double) operador1/operador2; // -> casteo
        // modulo -> el resto de la division entre los operandos
        int modulo = 5%2; // sirve para saber si un num. es par // segundos que entran por minuto
        String num1 = "5";
        String num2 = "7";

        System.out.println("Esto es la suma de dos String = "+ num1+num2);
        System.out.println("Esto es la suma de dos int pasandolos a String = "+ operador1+operador2);
        System.out.println("Esto es la suma de dos int bien concatenados = "+ (operador1+operador2));
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
        System.out.println("El modulo de la division es: "+modulo);

        // todo ------> ASIGNACION: da un valor =, +=, -=, *=, %=, ++
        operador1 = 10;
        operador2 = 11;

        // de asignación UNARIO -> solo necesitan un tipo de dato
        operador1++; // 11
        operador2--; // 10

        // para sumarle o restarle el numero que queramos al operando podemos utilizar += o -=
        operador1 += 30; // -> lo que hace es sumarle 30 a 11
        System.out.println("El resultado utilizando += es: "+operador1);
        operador2 -= 2;
        System.out.println("El resultado utilizando -= es: "+operador2);
        operador1 *= 2;
        System.out.println("El resultado utilizando *= es: "+operador1);
        operador1 %= 2;
        System.out.println("El resultado utilizando %= es: "+operador1);

        // todo ------> RELACIONALES - COMPARACION: comparan dos o mas variables entre si: <, <=, >, >=, ==, != Siempre se obtiene un boolean
        operador1 = 10;
        operador2 = 10;
        boolean comparacion = operador1>operador2; // false
        System.out.println("La comparación 1 es "+comparacion);
        comparacion = operador1>=operador2; // true
        System.out.println("La comparación 2 es "+comparacion);
        comparacion = operador2<operador1; // false
        System.out.println("La comparación 3 es "+comparacion);
        comparacion = operador1<=operador2; // true
        System.out.println("La comparación 4 es "+comparacion);
        comparacion = operador1==operador2; // true
        System.out.println("La comparación 5 es "+comparacion);
        comparacion = operador1!=operador2; // false
        System.out.println("La comparación 6 es "+comparacion);
        String palabra1 = "programación";
        String palabra2 = "Programaciones";
        boolean compararPalabrasIguales = palabra1.equals(palabra2); // el metodo .equals se utiliza para objetos
        boolean compararPalabrasDiferentes = !palabra1.equalsIgnoreCase(palabra2); // de false a true con el !
        compararPalabrasIguales = palabra1.equalsIgnoreCase(palabra2); // en este caso palabra1 y 2 son iguales pk se ignoran las mayus -> true
        System.out.println("La comparación de palabras es "+compararPalabrasIguales);

        // todo ------> LOGICOS: preguntan por sentencias &&, ||
        operador1 = 10;
        operador2 = 20;
        boolean comparacionAND = operador2>0 && operador1<10; // false
        boolean comparacionOR = operador1<10 || operador2<20 || operador1*2<=operador2; // true


    }
}

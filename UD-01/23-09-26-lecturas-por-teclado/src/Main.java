import org.w3c.dom.ls.LSOutput;

/**
 * Comentario de documentacion
 */

public class Main {

    /*
    comentario
    de
    párrafo
     */

    // comentario de línea

    // TODO. Comentario resaltado, se pueden identidicar en View > Tool Windows > TODO || y te aparecerán todos los todo que tengas, muy util para cuando tengas muchas lineas de codigo

    /* ---------------------------------------------------------------------------------------------------------------------
    METODOS -> funcionalidades, se puede ejecutar

    Su firma es:
    - mod_acceso + retorno + nombre (+argumentos){
        + ejecuciones del metodo
    }

    EJEMPLO METODO:
    public static void main(String[] args){
        System.out.println();
    }
     */

    // BANDERAS -> son los % correspondientes al texto formateado en printf
    // %s -> palabra
    // %d -> numero sin decimales
    // %f -> num con decimales

    public static void main (String[] args){
        String nombre = "Elena";
        System.out.printf("Me llamo %s, vivo en %s y tengo %d años\n", nombre, "Carabanchel", 23);

        nombre = "Maria";
        System.out.printf("Hola %s", nombre);


    // VARIABLES -> guardar un dato y utilizarlo | Sintaxis: tipo nombre = "valor" | Ej: String nombre = "Maria";
    // *Los nombres son representativos y no empiezan con caracteres especiales, la 1r en minuscula y si es compuesto 2n en mayusciual (nombreLegal)
    // *No puede haber 2 variables con el mismo nombre en el mismo sitio
    // ----------- TIPOS de VARIABLES:
    // ---------------> Segun el tipo de dato que tengo guardado -> palabras-letras / numeros / boolean
    // --------------------- String: "palabras" | char: 'letras' | int: numeroSinDecimales; | double: numeroConDecimalesInfinitos | float: numeroConDecimalesReducido+f | boolean: true/false
        int edadUsuario = 23;
        char letra = 'A';
        boolean resultadoCandidato = true;
        double porcentajeAprobado = 9.875667546746546874757867567556485498974578594754757579;
        float aprobadoUsuario = 9.87f;
        String nombreUsuario = "Pepita";

    // ---------------> Segun el origen del dato que tengo guardado: primtivos / complejos
    // --------------------- Primitivas: espacio de memoria básico que almacena un valor simple, ocupa un tamaño fijo
    // --------------------- Complejas: no guardan el valor directamente en la memoria sino que guardan la referencia/direccion que apunta al lugar exacto donde se encuentra el objeto. Además pueden utilizar métodos y propiedades, es decir, funcionalidades extra. Su tamaño es variable y pueden tener un valor null (las primitivas no)
        Object cosa = 1;
        Object cosa2 = "Maria";
        Object cosa3 = 'a';
        // Con Object puedo utilizar cualquier variable. Es la madre de todos.
        // Las variables primitivas que se pueden volver complejas se llaman Wrapper ya que envuelven el tipo primitivo para convertirlo en complejo.
        // Character sería la envolvente, la Wrapper es char
        Character letraCompleja = letra; // -> autoboxing: pasan de ser primitivas a su wrapper
        char letra2 = letraCompleja; // -> unboxing: vuelve de su wrapper a su valor primitivo

    // ---------------> Segun su posiblidad de cambiar el valor -> mutables / no mutables (constante)
    // --------------------- Mutables: todas a las que puedo cambiar valor | Constante: las defino con final antes de declarar su valor, el nombre siempre en mayus
        final String DNI = "1234"; // -> variable constante

    // ---------------> Segun su ámbito / scope -> de clase o de método
    // --------------------- De metodo/de bloque: son aquellas que se definen dentro de un metodo, ahora mismo la variable nombreUsuario es de método.
    // --------------------- De clase: son aquellas que se definen fuera de un metodo, por ej. global, ahora puedo crear varios metodos y llamar esta variable en todos.
    }

    public String global = "Hola";

}

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

        int edadUsuario = 23;
        char inicialNombre = 'A';
        boolean resultadoCandidato = true;
        double porcentajeAprobado = 9.875667546746546874757867567556485498974578594754757579;
        float aprobadoUsuario = 9.87f;
        String nombreUsuario = "Pepita";

    }

    // VARIABLES -> guardar un dato y utilizarlo | Sintaxis: tipo nombre = "valor" | Ej: String nombre = "Maria";
    // *Los nombres son representativos y no empiezan con caracteres especiales, la 1r en minuscula y si es compuesto 2n en mayusciual (nombreLegal)
    // *No puede haber 2 variables con el mismo nombre en el mismo sitio
    // ----------- TIPOS de VARIABLES:
    // ---------------> Segun el tipo de dato que tengo guardado -> palabras-letras / numeros / boolean
    // --------------------- String: "palabras" | char: 'letras' | int: numeroSinDecimales; | double: numeroConDecimalesInfinitos | float: numeroConDecimalesReducido+f | boolean: true/false
    // ---------------> Segun el origen del dato que tengo guardado: primtivos / complejos


}

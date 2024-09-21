package maximasecuencia;

import java.util.Arrays;
import java.util.Collections;

/**
 * Clase que proporciona métodos para ordenar arrays de enteros.
 */
public class Ordenador {

    /**
     * Ordena un array de enteros en orden lexicográfico inverso.
     * 
     * @param numeros Array de enteros a ordenar.
     * @return Array de enteros ordenado en orden lexicográfico inverso.
     */
    public static Integer[] ordenarLexicograficamente(Integer[] numeros) {
        Arrays.sort(numeros, Collections.reverseOrder());
        return numeros;
    }
}


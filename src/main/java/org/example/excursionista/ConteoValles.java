package org.example.excursionista;

/*
     * Complete la función 'countingValleys' a continuación.
     *
     * Se espera que la función devuelva un ENTERO.
     * La función acepta los siguientes parámetros:
     1. Pasos del entero
     2. Ruta de cadena
     */
public class ConteoValles {

    public int countingValleys(int steps, String path) {
        // Write your code here
        int nivel = 0;
        char substring;
        final char up = 'U';
        final char down = 'D';
        int valles = 0;
        int lomas = 0;

        char[] chars = path.toCharArray();
        for (int i = 0; i < steps; i++) {
            substring = chars[i];
            if (up == (substring)) {
                if (nivel == 0)
                    lomas++;
                nivel += 1;
            } else if (down == (substring)) {
                if (nivel == 0)
                    valles++;
                nivel--;
            }
        }

        return valles;
    }
}

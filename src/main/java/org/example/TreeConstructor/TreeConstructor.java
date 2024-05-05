package org.example.TreeConstructor;

import java.util.HashMap;

public class TreeConstructor {

    public String TreeConstructor(String[] strArr) {
        HashMap<String, Integer> mapaPadres = new HashMap<String, Integer>();
        HashMap<String, String> mapaHijos = new HashMap<String, String>();
        int padreUnico = 0;
        String g = null;


        for (String matriz : strArr) {
            String[] contenido = matriz.replace("(", "").replace(")", "").split(",");
            if (mapaPadres.containsKey(contenido[1])) {
                mapaPadres.replace(contenido[1], mapaPadres.get(contenido[1]) + 1);
                if (mapaPadres.get(contenido[1]) > 2) {
                    return "false";
                }
            } else {
                mapaPadres.put(contenido[1], 1);
            }
            mapaHijos.put(contenido[0], contenido[1]);
        }

        for (String key : mapaPadres.keySet()) {
            if (!mapaHijos.containsKey(key)) {
                padreUnico++;
            }
        }

        return padreUnico == 1 ? "true" : "false";
    }

}

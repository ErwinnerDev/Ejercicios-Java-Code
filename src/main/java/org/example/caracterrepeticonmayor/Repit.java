package org.example.caracterrepeticonmayor;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Repit {
    /*
    array de un texto como parametro de entrada
    búscar que letra es la que se repite más
    indiferentemente (insencible) de mayusculas y minusculas
     */


    public String contarLetra(String cadena) {
        Stream<String> characterStream 		= null;
        Map<String, Long> mapAgrupacionCaracter 	= null;
        Long repeticonMayo=0L;
        String caracterRepetidoMayor="";

        characterStream = cadena.replace(" ", "").toLowerCase().chars().mapToObj(c -> (char) c).map(x -> String.valueOf(x).toLowerCase());
        //Se crean grupos de caracteres<caracater,Repeticones>
        mapAgrupacionCaracter=characterStream.collect(Collectors.groupingBy(chr -> chr, Collectors.counting()));
        for(String key: mapAgrupacionCaracter.keySet()){
            if(mapAgrupacionCaracter.get(key)>repeticonMayo){
                repeticonMayo=mapAgrupacionCaracter.get(key);
                caracterRepetidoMayor=key;
            }
        }
        return "La letra que más se repite es la "+caracterRepetidoMayor+" con "+repeticonMayo+ " repeticiones";
    }

}

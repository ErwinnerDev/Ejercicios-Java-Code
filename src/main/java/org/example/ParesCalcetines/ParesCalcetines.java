package org.example.ParesCalcetines;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Complete la función 'sockMerchant' a continuación.
 *
 * Se espera que la función devuelva un ENTERO.
 * La función acepta los siguientes parámetros:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY ar
 */
public class ParesCalcetines {
    public int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        if(ar.size() == n){
            Map<Integer, Long> 				mapAgrupacionColor 	= null;
            //Se crean grupos  de <Numero(color), Repeticiones>
            mapAgrupacionColor=ar.stream().collect(Collectors.groupingBy(chr -> chr, Collectors.counting()));
            mapAgrupacionColor.forEach((k,v)-> System.out.println(k+"-"+v));

            //se hace un cast de un Map a un List
            List<Long> listAgrupadorValues= new ArrayList<>(mapAgrupacionColor.values());
            //Se divide por 2 cada grupos de calcetas para ver cuantos pares hay (se redondea de fomra inferiror cada división)
            // se suman el total de Pares de calsetas
            //                                                                            .reduce((acumulador, numPart) -> acumulador + numPart);
            Optional<Long> reduce = listAgrupadorValues.stream().map(x -> Math.floorDiv(x, 2)).reduce(Long::sum);

            //reduce.isPresent() ? reduce.get().intValue() : 0;
            return reduce.map(Long::intValue).orElse(0);
        }
    return 0;
    }
}

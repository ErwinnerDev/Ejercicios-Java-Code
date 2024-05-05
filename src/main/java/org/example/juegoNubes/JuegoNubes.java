package org.example.juegoNubes;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


public class JuegoNubes {

    public int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        String[] split = c.toString().replaceAll("[,\\[\\]\\s]","").split("1");
        Integer countCambioGrupo = split.length-1;
        Stream<String> stream = Arrays.stream(split);
        Optional<Integer> reduce = stream.map(x ->Math.floorDiv(x.length(), 2)).reduce(Integer::sum);
        return reduce.map(sumaSaltosInternoGrupos -> (int) (sumaSaltosInternoGrupos + countCambioGrupo)).orElse(0);
    }
}

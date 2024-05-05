package org.example.cortarpalos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CortarPalos { //Cut the sticks
    /*
     *  Complete la función 'cutTheSticks' a continuación.
     *
     * Se espera que la función devuelva un INTEGER_ARRAY.
     * La función acepta INTEGER_ARRAY arr como parámetro.
     */

    public List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        result.add(arr.size());
        while (true){
            Integer finalCorte = arr.stream().min(Integer::compare).get();
            arr =arr.stream().map(x -> x - finalCorte).filter(x -> x > 0).collect(Collectors.toList());
            if(arr.isEmpty()) break;
            result.add(arr.size());
        }
        return result;
    }
}
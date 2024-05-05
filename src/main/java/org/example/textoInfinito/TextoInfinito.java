package org.example.textoInfinito;

import java.math.BigInteger;

/*
     * Complete la función 'repeatedString' a continuación.
     *
     * Se espera que la función devuelva un LONG_INTEGER.
     * La función acepta los siguientes parámetros:
     1. CADENAS DE CARACTERES
     2. LONG_INTEGER n
     */
public class TextoInfinito {

    public long repeatedString(String s, String longitudeText) {
        String find = "a";
        BigInteger num = new BigInteger(longitudeText);
        int length = s.length();
        System.out.println("length:"+length);

        long count = s.chars().mapToObj(c -> (char) c).filter(c -> String.valueOf(c).equals(find)).count();
        System.out.println("count:"+count);

        BigInteger resultDivide = num.divide(new BigInteger(String.valueOf(length)));
        System.out.println("resultDivide:"+resultDivide);

        BigInteger mod = num.mod(new BigInteger(String.valueOf(length)));
        System.out.println("mod:"+mod);

        BigInteger resultMultiply = resultDivide.multiply(new BigInteger(String.valueOf(count)));
        Long response = Long.valueOf(String.valueOf(resultMultiply));
        if(mod.equals(new BigInteger("0"))){
            return response;
        }
        int intMod = Integer.valueOf(String.valueOf(mod));
        int iterarion = 0;
        while (intMod>0){
            if(iterarion >= length){
                iterarion=0;
            }
            if(s.substring(iterarion,iterarion+1).equals(find)){
                response++;
            }
            intMod--;
            iterarion++;
        }
        return response;
    }

}

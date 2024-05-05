package org.example.fizzBuzz;

public class FizzBuzz {
    /*
    Pasar a la funcion fizzBuzz n = 15 como parametro
Obteer un numero i por cada n
Si i es multiplo de 3 y 5, print FizzBuzz
Si i ES multiplo de 3 y NO de 5, print Fizz
Si i es multiplo de 5 y NO de 3, print Buzz
Y si no es ni multiplo de 3 ni de 5, print i
    * */

    public String FizzBuzz(int i) {
        if(i%3==0 && i%5==0) {
            return "FizzBuzz";
        }else if(i%3==0) {
            return "Fizz";
        }else if(i%5==0) {
            return "Buzz";
        }else {
            return "i";
        }
    }
}

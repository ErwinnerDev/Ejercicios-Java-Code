### Instrucciones
Haga que la función **TreeConstructor(strArr)** tome la matriz de cadenas almacenadas en **strArr**,

que contendrá pares de enteros en el siguiente formato: ``(i1,i2)``, donde **i1** representa un nodo secundario en un árbol y el segundo entero **i2** significa que es el padre de **i1**.
<br>
Por ejemplo: si strArr es ``[(1,2)", "(2,4)", "(7,2)"]`` entonces esto forma el siguiente árbol:

~~~
         4
        /
       2
      / \
     1   7
~~~
 puede ver forma un árbol binario adecuado. Su programa debería, en este caso, 
devolver la cadena ***true*** porque se puede formar un árbol binario válido.
<br>
Si no se puede formar un árbol binario adecuado con los pares enteros, devuelva la cadena ***false***.
<br>
Todos los enteros dentro del árbol serán únicos, lo que significa que solo puede haber un nodo en el árbol con el valor entero dado.
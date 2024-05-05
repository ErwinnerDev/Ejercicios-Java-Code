hay una cuerda, **s**, de letras inglesas minúsculas que se repite infinitamente muchas veces. Dado un número entero,**n**, busque e imprima el número de letras aen la primeraletras de la cadena infinita.
#### Ejemplo
~~~
s = 'abcac'
n = 10
~~~
La subcadena que consideramos es,<code>abcacabcac</code> la primera *10* caracteres de la cadena infinita.
<br>
Hay *4* ocurrencias de <code>a</code> en la subcadena.

#### Función descriptiva
Complete la función de cadena repetida en el editor a continuación.
repeatString tiene los siguientes parámetros:
- s: una cadena para repetir
- n: el número de caracteres a considerar

#### Devoluciones
- int: la frecuencia de aen la subcadena

#### Formato de entrada

La primera línea contiene una sola cadena,<code>s</code>.
<br>
La segunda línea contiene un número entero,<code>n</code>.

#### Restricciones
~~~
1 <= |s| <= 100
1 <= n <= 10^12
Para 25% de los casos de prueba  n <= 10^6 
~~~

### Entrada de muestra

#### Entrada de muestra 0
~~~
aba
10
~~~

#### Salida de muestra 0
~~~
7
~~~

#### Explicación 0
La primera <code>n = 10</code> Las letras de la cadena infinita son <code>abaabaabaa</code>.
<br>
Porque hay *7* a's, volvemos *7*. 


#### Entrada de muestra 1
~~~
a
1000000000000
~~~

#### Salida de muestra 1
~~~
1000000000000
~~~

#### Explicación 1
Porque todas las primeras <code>n = 1000000000000</code> letras de la cadena infinita son *a*, volvemos <code>1000000000000</code>.
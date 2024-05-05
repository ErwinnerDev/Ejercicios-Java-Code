Un ávido excursionista mantiene registros meticulosos de sus caminatas. Durante la última caminata que tomó exactamente **steps** pasos,
por cada paso se anotaba si era cuesta arriba ,**U**, o un descenso ,**D**.
Las caminatas siempre comienzan y terminan al nivel del mar, y cada paso hacia arriba o hacia abajo representa ununidad de cambio de altitud. 
<br>Definimos los siguientes términos:

- Una montaña es una secuencia de pasos consecutivos sobre el nivel del mar, comenzando con un paso hacia arriba desde el nivel del mar y terminando con un paso hacia abajo hasta el nivel del mar.
- Un valle es una secuencia de pasos consecutivos por debajo del nivel del mar, comenzando con un paso hacia abajo desde el nivel del mar y terminando con un paso hacia arriba hasta el nivel del mar.
<br><br>
Dada la secuencia de pasos hacia arriba y hacia abajo durante una caminata, encuentre e imprima el número de valles por los que pasó.
<br><br>
  #### Ejemplo
~~~
steps = 8 path = [DDUUUUDD]
~~~
El caminante entra por primera vez en un valle. 2 unidades de profundidad.
<br>Luego salen y suben a una montaña. 2 unidades de alto. 
<br> Finalmente, el caminante regresa al nivel del mar y finaliza la caminata.

#### Función descriptiva

Complete la función countingValleys en el editor a continuación.

countingValleys tiene los siguientes parámetros:

- **int steps** : el número de pasos en la caminata
- **string path** : una cadena que describe la ruta

#### Devoluciones

- **int**: el número de valles atravesados

#### Formato de entrada

La primera línea contiene un número entero.**steps**, el número de pasos en la caminata.
La segunda línea contiene una sola cadena.**Path**, de **Steps** caracteres que describen el camino.

#### Restricciones
~~~
 2 <= steps <= 10^6
 path[i] {UD}
~~~

#### Entrada de muestra
~~~
8
UDDDUDUU
~~~

#### Salida de muestra
~~~
1
~~~

#### Explicación
Si representamos _como el nivel del mar, un paso hacia arriba como /y un paso hacia abajo como \, la caminata se puede dibujar como:

~~~
_/\      _
   \    /
    \/\/
~~~
/
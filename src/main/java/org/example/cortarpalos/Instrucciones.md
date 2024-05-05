Te dan varios palos de diferentes longitudes. Cortarás los palitos de forma iterativa en palitos más pequeños, descartando los trozos más cortos hasta que no quede ninguno. En cada iteración, determinará la longitud del palo más corto restante, cortará esa longitud de cada uno de los palos más largos y luego descartará todas las piezas de esa longitud más corta. Cuando todos los palos restantes tengan la misma longitud, no se podrán acortar, así que deséchelos.

Dadas las longitudes depalos, imprima el número de palos que quedan antes de cada iteración hasta que no quede ninguno.
#### Ejemplo
~~~
arr = [1,2,3]
~~~
La longitud más corta del palo es, así que corta ese largo de los dos más largos y desecha los trozos de largo <b>1</b>. Ahora las longitudes son <b> arr = [1,2] </b> . Nuevamente, el palo más corto tiene la longitud <b>1</b>, así que corta esa cantidad del palo más largo y desecha esos trozos. Sólo queda un palo, <b> arr = [1]</b>, así que descarta ese palo. El número de palos en cada iteración es.
~~~
answer = [3,2,1]
~~~
### Función descriptiva
Complete la función cutTheSticks en el editor a continuación. Debería devolver una serie de números enteros que representen el número de barras antes de realizar cada operación de corte.

cutTheSticks tiene los siguientes parámetros:
~~~
int arr = [n] las longitudes de cada palo
~~~

### Devolución
~~~
int = [] el número de palos despúes de cada iteración
~~~

### Formato de entrada
La primera línea contiene un único número entero. <b>n</b>, la longitud de <b>arr</b>.
La siguiente línea contiene <b>n</b> enteros separados por espacios, cada uno de ellos <b>arr [i]</b>, donde cada valor representa la longitud del <b>i^th</b> palo.

### Restricciones
~~~
 1 <= n <= 1000
 1 <= arr[i] <= 1000
~~~

## Ejemplo 1
~~~
STDIN      Function
-----       -----
6           arr[] size n= 6
544228      arr = [5,4,4,2,2,8]
~~~

### Salida de Ejemplo 1
~~~
6
4
2
1
~~~
### Explicación Ejemplo 1
~~~
Longitud de loa palos   longitud de corte   corte de palos
5 4 4 2 2 8                     2                  6
3 2 2 - - 6                     2                  4
1 - - - - 4                     1                  2
- - - - - 3                     3                  1
- - - - - FIN                   FIN
~~~
## Ejemplo 2
~~~
8
12343321
~~~
### Resultado de Ejemplo 2
~~~
8
6
4
1
~~~
### Explicación Ejemplo 1
~~~
Longitud de loa palos   longitud de corte   corte de palos
1 2 3 4 3 3 2 1                     1                  8
- 1 2 3 2 2 1 -                     1                  6
- - 1 2 1 1 - -                     1                  4
- - - 1 - - - -                     1                  1
- - - - - - - FIN                  FIN
~~~

















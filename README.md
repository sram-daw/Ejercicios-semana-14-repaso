# Ejercicios Programación: Semana 14 (repaso herencia y polimorfismo)

### Ejercicio 1
Implementa la clase “Espada” que herede de la clase “Arma”. Modifica el
método “doing_damage” para que el daño sea mayor a menor distancia
con el enemigo:
Multiplicador x damage x (distancia - distancia enemigo) (por ejemplo).

### Ejercicio 2
Implementa la clase “Lanza” que herede de la clase “Arma”. Modifica el
método “doing_damage” para que el daño solo se pueda aplicar si la
distancia está entre la distancia del arma y la mitad de esta.

### Ejercicio 3
Implementa la clase “Hacha” que herede de la clase “Arma”. Modifica el
método “doing_damage” para que haga el triple de daño si la distancia es
exactamente la misma la del arma que la del enemigo.

### Ejercicio 4
Añade un método a “Equipamiento” que se llame “acción_especial”.
Modifica este método en una clase “Casco” que herede de “Armadura”
para que reciba un booleano “proyectil”.

### Ejercicio 5
Añade una clase “Botas” que herede de “Armadura”. Modifica el método
“acción_especial” para que reciba un booleano “melee” y un entero
“distancia”.

### Ejercicio 6
En el método main, instancia un objeto de cada tipo que hayas creado.
Asígnale unos valores a cada uno. Almacenalos todos en el mismo array y
ejecuta en un bucle los métodos “doing_damage” y “acción_especial”,
teniendo en cuenta que “accion_especial” recibe diferentes valores.
Pista: Instanceof…
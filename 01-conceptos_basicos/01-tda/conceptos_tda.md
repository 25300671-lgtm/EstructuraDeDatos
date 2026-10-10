# Tipos de datos abstractos

La idea central es que no se memoria TDA como una
definicion.

La secuencia para entenderlo:

**problema**=>**datos**=>**operaciones**=>**reglas**=>**abstraccion**
=>**TDA**=>**Implementacion**=>**Clase**
=>**Java**=>**Estructura de Datos**

Para despues entrar a lo que es una *pila*, *cola*, *lista* y *arboles*

1. Problema:

> Supongamos que tenemos un sistema escolar y queremos manejar estudiantes.

Cada estudiante:

- matricula,
- nombre,
- carrera,
- promedio

Hasta ahora estamos de **datos**

Pero el programa no solamente necesita almacenar esos datos.
Tambien necesita hacer cosas con ellos:

- registrar un cliente 
- consultar sus datos 
- cambiar su promedio
- verificar si esta aprobado
- mostrar informacion

Entonces aparece una idea importante:

En programacion no solamente importa **que datos tenemos**,
si no tambien **que operaciones podemos realizar sobre esos datos**

Nota: Este es el primer paso hacia un TDA

2. Dato simple vs algo mas complejo

Ya conocemos:

```java

int edad;
double promedio;
String nombre;

```

Estos tipos de datos ya lo conoce Java.
`int edad = 20`

Java sabe:

- que tipo de valor puede almacenar
- cuanto esapacio requiere,
- que operaciones se pueden realizar

con un int:
```java
edad + 1
edad -1 
edad > 18
edad ++
++edad

```
Pero si pensamos en:

`Estudiante`

Java originalmente no tiene un tipo llamado **Estudiante**

Necesitamos construirlo

Aqui comienza a aparecer la idea de **crear nuestros propios tipos de datos**

3. ¿Que seria un tipo de dato?

Se puede definir inicialmente asi:

> Un tipo de dato define que valores pueden existir y que operaciones pueden realizarse con esos valores 

Por ejemplo:

**int**
```
valores posibles:
-10
0
5
100
2500
```

operaciones: Aritmeticas y Relaciones 

**boolean**
Valores:
```
true
false
```


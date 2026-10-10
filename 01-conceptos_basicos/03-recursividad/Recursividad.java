package mx.edu.uttt.recursividad;

public class Recursividad {

    // Método para imprimir saludos recursivos de 1 hasta n
    public static void saludar1(int n) {
        // Caso base: cuando llega a 1 solo imprime y yao
        if (n == 1) {
            System.out.println("Hola saludo " + n);
        } else {
            // Caso general: llamada recurcwsiva
            saludar1(n - 1);
            System.out.println("Hola saludo " + n);
        }
    }

    // Saludo validando si es diferente de 1
    public static void saludar2(int n) {
        // Caso general
        if (n != 1) {
            // Llamamos a saludar1 (creo que aqui me equivoque de metodo pero si avanza)
            saludar1(n - 1);
            System.out.println("Hola saludo " + n);
        } else {
            // Caso base
            System.out.println("Hola saludo " + n);
        }
    }

    // Saludar llegando hasta cero
    public static void saludar3(int n) {
        if (n == 0) {
            return; // Si es cero ya no regresa nada
        } else {
            saludar3(n); 
            System.out.println("Hola saludo " + n);
        }
    }

    // Multiplicar x por y mediante sumas recursivas
    public static int multipliacionSuma(int x, int y) {
        if (y == 0) {
            return 0; // Si multiplicas por 0 da 0
        } else {
            return x + multipliacionSuma(x, y); 
        }
    }

    // EJERCICIO 1: Sumar numeros consecutivos de 1 a n
    public int sumarN(int n) {
        // Caso base
        if (n == 1) {
            return 0; 
        }
        return n + sumarN(n - 1);
    }

    // EJERCICIO 2: Calcular el factorial de n
    public static int factorial(int n) {
        // Caso base
        if (n == 0) {
            
            return 0; 
        }
        return n * factorial(n - 1);
    }

    // EJERCICIO 3: Multiplicar numero por n veces
    public static int multiplicar(int numero, int veces) {
        // Caso base: si ya no hay veces que sumar
        if (veces == 0) {
            return 0;
        }
        // Vamos sumando el numero y le restamos 1 a las veces
        return numero + multiplicar(numero, veces - 1);
    }

    // EJERCICIO 4: Calcular la potencia de una base
    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
          
            return 0; 
        }
        return base * potencia(base, exponente - 1);
    }
}
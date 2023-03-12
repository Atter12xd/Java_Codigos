
package trabajo_suma;

import java.util.Scanner; // Es una clase que nos permite obtener la entrada de datos primitivos

public class Trabajo_Suma {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Declaramos la clase "Scanner"
        // Pedimos el primer numero
        System.out.println("Ingrese el primer numero a sumar: ");
        // "nextInt()" lee valores int introducidos por el usario
        int numero1 = entrada.nextInt();
        // pedimos el segundo numero
        System.out.println("Ingrese el segundo numero a sumar: ");
        // "nextInt()" lee valores int introducidos por el usario
        int numero2 = entrada.nextInt();
        // hacemos la suma
        int resultado = numero1 + numero2;
        // Imprimos el valor de numero1 , numero2 y por ultimo imprimos el resultado de
        // los 2
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es igual a " + resultado);

    }

}

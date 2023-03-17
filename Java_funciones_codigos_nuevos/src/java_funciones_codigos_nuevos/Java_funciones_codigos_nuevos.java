
package java_funciones_codigos_nuevos;

import java.util.Scanner; // llamamos a la libreria Scanner
public class Java_funciones_codigos_nuevos {

   
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in); //llamamos a la clase Scanner
        String nombre = ""; // creamos una cadena String
        int numero1 = 0, numero2 = 0, resultado = 0; // creamos numeros enteros
        System.out.println("Ingrese su nombre: "); // pedimos su nombre al usario
        nombre = ingreso.nextLine(); // leemos el dato con "nextLine"
        System.out.println("Ingrese el primero valor para tu suma: "); 
        numero1 = ingreso.nextInt(); // leemos el numero con "nextInt"
        System.out.println("Ingre el segundo valor para tu suma: ");
        numero2 = ingreso.nextInt(); // leemos el numero con "nextInt"
        resultado = numero1 + numero2; // sumamos
        System.out.println(" Hola " + nombre + " El resultado de tu suma es: " + resultado);
        //En el anterior codigo llamamos a las variables e imprimos   
        
    }
    
}

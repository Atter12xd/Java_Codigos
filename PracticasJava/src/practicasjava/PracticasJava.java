package practicasjava;

import java.util.Scanner;

public class PracticasJava {

    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        Scanner dato = new Scanner(System.in);
        System.out.println("Diga su nombre: ");
        String nombre = dato.nextLine();
        System.out.println("Hola " + nombre + " Diga su numero: ");
        int num = dato.nextInt();
        int sumapar = 0;
        int sumaimpar = 0;

        for (numero1 = 0; numero1 <= num; numero1 = numero1 + 2) {
            sumapar = sumapar + numero1;
            System.out.println("hola " + nombre + " Los numeros pares son: " + numero1);

        }
        System.out.println("Y la suma es: " + sumapar);
        for (numero2 = 1; numero2 <= num; numero2 = numero2 + 2) {
            sumaimpar = sumaimpar + numero2;
            System.out.println("hola " + nombre + " Los numeros impares son: " + numero2);
        }
        System.out.println("Y la suma es: " + sumaimpar);

    }

}

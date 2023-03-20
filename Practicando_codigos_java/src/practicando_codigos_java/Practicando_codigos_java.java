
package practicando_codigos_java;

import java.util.Scanner;

public class Practicando_codigos_java {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        String name = "";
        int clave = 0, antiguedad = 0;
        System.out.println("*******************************************************");
        System.out.println("*Bienvenido al sistema vacacional de Coca cola company*");
        System.out.println("*******************************************************");
        System.out.println("");
        System.out.println("");
        System.out.print("¿Cual es el nombre del trabajador?: ");
        name = dato.nextLine();
        System.out.println("");
        System.out.print("¿Cuanto tiempo de servicio tiene el trabajador?: ");
        antiguedad = dato.nextInt();
        System.out.println("");
        System.out.print("¿Cual es la clave del trabajador?: ");
        clave = dato.nextInt();
        System.out.println("");

        if (clave == 1) {
            if (antiguedad == 1) {
                System.out.println("El trabajador " + name + " tiene derecho a 6 dias de vacaciones");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println("El trabajador " + name + " tiene derecho a 14 dias de vacaciones");
            } else if (antiguedad >= 7) {
                System.out.println("El trabajador " + name + " tiene derecho a 20 dias de vacaciones");
            } else if (antiguedad >= 20) {
                System.out.println("No hay trabajador que pase de los 20 años");
            }

        } else if (clave == 2) {
            if (antiguedad == 1) {
                System.out.println("El trabajador " + name + " tiene derecho a 7 dias de vacaciones");
            } else if (antiguedad >= 2 && antiguedad <= 19) {
                System.out.println("El trabajador " + name + " tiene derecho a 15 dias de vacaciones");
            } else if (antiguedad >= 7) {
                System.out.println("El trabajador " + name + " tiene derecho a 22 dias de vacaciones");
            } else if (antiguedad >= 20) {
                System.out.println("No hay trabajador que pase de los 20 años");

            }

        } else if (clave == 3) {
            if (antiguedad == 1) {
                System.out.println("El trabajador " + name + " tiene derecho a 10 dias de vacaciones");
            } else if (antiguedad >= 2 && antiguedad <= 19) {
                System.out.println("El trabajador " + name + " tiene derecho a 20 dias de vacaciones");
            } else if (antiguedad >= 7 && antiguedad <= 19) {
                System.out.println("El trabajador " + name + " tiene derecho a 30 dias de vacaciones");
            } else if (antiguedad >= 20) {
                System.out.println("No hay trabajador que pase de los 20 años");

            }

        } else {
            System.out.println("Erro!, la clase es incorrecta!: ");

        }

    }

}

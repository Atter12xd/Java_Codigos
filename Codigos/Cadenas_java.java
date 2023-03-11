
package cadenas_java;


public class Cadenas_java {
    
    
    public static void main(String[] args) {
        String nombre = "juan";
        System.out.println(nombre);
        String txt = "ASFSDGASIUHIDSBJKDSBFKJDSFBKJSfafs";
        System.out.println("la longitud es: " + txt.length()); // Cuenta la longitud
        String palabra = "hola mundo";
        System.out.println("Convertimos en mayuscula: " + palabra.toUpperCase());
        System.out.println("Convertimos en minuscula: " + palabra.toLowerCase());
        /* "toUpperCase" Convierte en mayucula 
           "toLowerCase" Convierte en minuscula
        */
        String x = "Azul" + "rojo" + "morado" ;
        System.out.println(x.indexOf("rojo"));
        String Nombre = "atter";
        String Apellido = "Basilio";
        System.out.println(Nombre + " " + Apellido);
        
                
        
    }
    
}

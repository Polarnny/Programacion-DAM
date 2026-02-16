// Nom: Xisco Cardona O'fferrall
// DNI: 45699020K

package programacion.cide.es;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Abrimos el scanner para que nos muestre por la terminal el programa
        boolean listo = true; // Lo usaremos para saber si esta hecho o no la comida

        // Iniciamos las clases que utilizaremos en el main y les ponemos los valores
        Torrada t = new Torrada("San Sebastia", "2025");
        Botifarro b = new Botifarro("San Sebastia", "2025", true);
        Sobrassada s = new Sobrassada("San Sebastia", "2025");

        // Esta sera la introduccion del programa que hemos hecho
        System.out.println("Benvingut a la torrada de Sant Sebastià 2025.");
        System.out.println("He comprat un botifarró.");
        System.out.println("He comprat una sobrassada.");
        System.out.println("He posat el botifarró a la graella.");
        System.out.println("He posat la sobrassada a la graella.");
        System.out.println("Vaig a mirar si estan fets:");

        // Abrimos el bucle que no saldra hasta que tanto la sobrasada como el
        // botifarron esten hechos
        while (listo) {
            // Iniciamos los metodos de cada uno de ellos
            b.estaFet();
            s.estaFet();
            if (b.estaFet() == false && s.estaFet() == false) { // Si ninguno esta hecho mostrara ese mensaje
                System.out.println("El botifarró està cru i la sobrassada està cru. He d'esperar.");
            } else if (b.estaFet() == true && s.estaFet() == false) { // Si solo esta hecha el botifarron mostrara el
                                                                      // siguiente mensaje
                System.out.println("El botifarró està fet i la sobrassada està cru. He d'esperar.");
            } else if (b.estaFet() == false && s.estaFet() == true) { // Si solo esta hecho la sobrasada dira lo
                                                                      // siguiente
                System.out.println("El botifarró està cru i la sobrassada està fet. He d'esperar.");
            } else { // Cuando las 2 comidas nos indiquen que estan hechas saldra del programa y
                     // mostrara lo siguiente
                System.out.println("El botifarró està fet i la sobrassada està fet. Ja puc anar a sopar.");
                listo = false;
            }
        }

        // Aqui haremos varios if para que nos muestre un mensaje u otro dependiendo de
        // si quema o no, y si pica o no el botifarron
        if (b.getCoent() == false && b.crema() == false) { // Este sera el caso de si ni pica ni quema
            System.out.println("Estic assaborint el botifarró.");
        } else if (b.getCoent() == true && b.crema() == false) { // Este sera la respuesta de si pica pero no quema
            System.out.println("Estic assaborint el botifarró i es coent.");
        } else if (b.getCoent() == false && b.crema() == true) { // Este sera el resultado de si quema pero no pica
            System.out.println("Estic assaborint el botifarró i crema.");
        } else { // Esto nos mostrara si tanto quema como pica
            System.out.println("Estic assaborint el botifarró, es coent i crema.");
        }

        // Este if sera para el caso de la sobrasada si quema o no
        if (s.crema() == false) { // Si sale false no saldra nada de que quema
            System.out.println("Estic assaborint la sobrassada.");
        } else { // En el caso contrario nos mostrara que quema
            System.out.println("Estic assaborint la sobrassada i crema.");
        }

        // Este sera el mensaje final para indicar que ha acabado el programa
        System.out.println("Au, ja està tot fet! Visca Sant Sebastià!");

    }
}
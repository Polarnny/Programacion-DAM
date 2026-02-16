package es.cide.programacion;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Heroi heroi;
        boolean vida = true;
        String[] defensar = { // Array de las respuestas del heroe

                "Con tu aliento, seguro que todos fueron asfixiados.", // 1
                "¿Es que TANTO me parezco a tu hermana?", // 2
                "La única forma en la que te conservarás será disecado.", // 3
                "Entonces se un buen perro ¡Siéntate! ¡Quieto!", // 4
                "Cuando acabe CONTIGO, serás un bistec con disentería.", // 5
                "Que pena que todas estén inventadas.", // 6
                "Así habría sido, pero siempre estabas de escapada." // 7

        };
        String[] insultos = { // Array de los insultos del pirata

                "Los enemigos contra los que me enfrenté fueron aniquilados.", // 1
                "Eres tan repulsivo como una mona marrana.", // 2
                "¡Que el cielo conserve mi vista!¡Pareces muerto como el pescado!", // 3
                "¡Te perseguiré dia y noche sin ningún respeto!", // 4
                "¡Voy a ensartarte como a una puerca guarrería!", // 5
                "Mis grandes hazañas por todo el Caribe son celebradas.", // 6
                "Jamás había visto a nadie tan torpe con la espada" // 7

        };
        System.out.println("Elije uno de estos Heroes");
        System.out.println("1. Guybrush");
        System.out.println("2. Elaine");
        int heroeElegido = sc.nextInt();
        while (heroeElegido != 1 || heroeElegido != 2) {
            heroeElegido = sc.nextInt();
        }
        if (heroeElegido == 1) {
            heroi = new Guybrush(); // Se crea un objeto heroe
        } else if (heroeElegido == 2) {
            heroi = new Elaine(); // Se crea un objeto heroe
        }

        String nomIlla = "La Española";
        Illa illa = new Illa(nomIlla, defensar, insultos); // Le indicamos que hay en el constructor de illa
        System.out.println("Bienvenido a " + illa.getNomIlla());
        System.out.println("Te vas a enfrentar a " + illa.getNumPiratas() + " piratas.");

        for (int i = 0; i < illa.getNumPiratas(); i++) { // Enterara en el for las mismas veces que piratas te
                                                         // enfrentes

            Pirata pirata = illa.vullUnPirata(i); // Coge un pirata de los que hay aleatoriamente
            System.out.println("Tu enfrentamiento sera contra " + pirata.getNomPirata() + " y tiene: "
                    + pirata.getVidaPirata() + " de vida"); // Te dira el nombre del pirata y su vida

            while (pirata.getVidaPirata() > 0 && heroi.getVida() > 0) {// Entra en el while hasta que uno de los dos
                                                                       // llegue a vida 0

                // Apartado de el insulto del pirata
                System.out.println();
                String insulto = pirata.insultar();
                System.out.println("El pirata dice: " + insulto);
                System.out.println();

                // Apartado de las respuestas del heroe
                String respuestaHeroe = heroi.getResultado();

                if (pirata.replica(respuestaHeroe)) {// Aqui entrara si el heroe gana la discusion
                    System.out.println("Correcto");
                    pirata.vida();
                    System.out.println("Al pirata le queda " + pirata.getVidaPirata() + " de vida"); // Entrara al
                                                                                                     // metodo de vida
                                                                                                     // del pirata y le
                                                                                                     // restara 1

                    if (pirata.getVidaPirata() <= 0) {// Aqui entrara si el pirata ha muerto
                        System.out.println("Has ganado la batalla");
                        System.out.println("------------------------");
                    }
                }

                else {// Aqui entrara si la respuesta del heroe es incorrecta y le restara vida
                    System.out.println("Incorrecto!");
                    heroi.vida();
                    System.out.println("Te queda " + heroi.getVida() + " de vida");
                }

                if (heroi.getVida() <= 0) {// Aqui entra si el heroe muere
                    System.out.println("Has muerto en combate");
                }
            }

            if (heroi.getVida() <= 0) {// Si el heroe muere acabara el juego
                System.out.println("¡El héroe ha perdido los combates!");
                vida = false;
            }

        }

        if (heroi.getVida() > 0) {// Aqui entra en el caso de que el heroe gane a todos los piratas
            System.out.println("¡Has ganado todos los combates!");
        }
    }
}
package es.cide.programacion;

import java.util.Random;

public class Illa {

    // Atributos
    String illa = "La Española";
    int numPirata = 0;
    int vidaPirata;
    String defensar[];
    String insultos[];
    String nombre;
    Pirata[] elecPirata; // A este array le pondremos los nombres aleatorio del array de nomPirata las
                         // veces que sea el aleatorio
    Random aleatorio = new Random(); // Generamos para hacer un random

    String[] nomPirata = { // Creo los nombres de los piratas y los guardo en un array

            "Roronoa Roni",
            "Trafalgar Law",
            "Rocks D Xebec",
            "Gol D Roger",
            "Kaido",
            "Ben Beckman",
            "Van Augur"
    };

    // Constructor
    public Illa(String illa, String[] defensar, String[] insultos) { // Iniciamos las variables
        numPirata = aleatorio.nextInt(3, 8); // Hacemos que el numero de piratas sea aleatorio
        this.elecPirata = new Pirata[numPirata];
        this.illa = illa;

        for (int i = 0; i < elecPirata.length - 1; i++) { // Entrara en el for hasta que el numero de piratas aleatorio
                                                          // acabe
            int indice = aleatorio.nextInt(nomPirata.length);
            // Guardamos en elecPirata nombres de nomPirata que hayan salido aleatoriamente
            // y los guardaremos en el array de elecPirata utilizando la i ya que va sumando
            // por bucle
            elecPirata[i] = new Pirata(nomPirata[indice]);
        }

        elecPirata[numPirata] = new LeChuck("LeChuck"); // Este sera el ultimo pirata al acabar lo demas

    }

    // Getters y Setters
    public String getNomIlla() { // Recogemos el nombre de la isla que esta en el main
        return this.illa;
    }

    public int getNumPiratas() { // Recogemos el numero de piratas que haya salido del aleatorio
        return numPirata;
    }

    // Metodos
    public Pirata vullUnPirata(int index) { // Sacaremos aleatoriamente lo que hay en el array de elecPirata
        return elecPirata[index];
    }
}

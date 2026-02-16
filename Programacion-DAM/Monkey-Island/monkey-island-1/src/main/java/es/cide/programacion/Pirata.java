package es.cide.programacion;

import java.util.Random;

public class Pirata {

    // Atributos
    Random aleatorio = new Random(); // Creamos el random

    boolean vida = true;
    int vidaPirata;
    int ataque1;
    int ataque2;
    int ataque3;
    int correcto;
    String nombre;
    String[] insultoAleatorio = new String[3];

    String defensar[];
    String insultos[];
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
    public Pirata( String nombre, String defensar[],String insultos[] ) { // Inicio las variables
        this.vidaPirata = aleatorio.nextInt(3) + 1; // Pongo que la vida del pirata sera aleatorio de 3
        this.nombre = nomPirata[aleatorio.nextInt(nomPirata.length)]; // Le aplico a nombre los piratas aleatorios
        this.defensar = defensar;
        this.insultos = insultos;

        do { // Le ponemos a cada ataque un inulto aleatorio
            ataque1 = aleatorio.nextInt(7); // Se guarda en el primer ataque
            ataque2 = aleatorio.nextInt(7); // Se guarda en el segundo ataque
            ataque3 = aleatorio.nextInt(7); // Se gaurda en el tercer ataque


        } while (this.ataque1 == this.ataque2 || this.ataque1 == this.ataque3 || this.ataque2 == this.ataque3); // Los guardamos en inuslto aleatorio para que no se repitan
        insultoAleatorio[0] = insultos[ataque1]; // El primer insulto
        insultoAleatorio[1] = insultos[ataque2]; // El segundo insulto
        insultoAleatorio[2] = insultos[ataque3]; // El tercer insulto
    }


    // Getters y Setters
    public String getNomPirata() { // Recogemo el nombre del pirata
        return nombre;
    }
    public int getVidaPirata(){ // Recogemo la vida que tiene el pirata
        return vidaPirata;
    }


    // Metodos
    public int restarVidaPirata() {
        this.vidaPirata = vidaPirata - 1; // Restara 1 cada vez que entre a este metodo, el cual entrara cuando el
                                          // pirata pierda la discusion
        if (vidaPirata > 0) { // Si la vida del pirata no es 0 seguira vivo
        } 
        else if (vidaPirata <= 0) { // Si la vida del pirata llega a 0 este pirata perdera
            vida = false; // Al ponerlo en false significara que ya no tiene vida
        }
        return vidaPirata; // Que nos devuelva la vida del pirata
    }
    
    public String insultar() { // Abrimos el metodo insultar

        int elecInsultos = aleatorio.nextInt(3); // Hacemos que coja tres insultos aleatorios

        if (elecInsultos == 0) { // Si es la primera posicion era la del ataque 1
            correcto = ataque1;
        }

        else if (elecInsultos == 1) { // Si es la segunda posicion era la del ataque 2 
            correcto = ataque2;
        }

        else{
            correcto = ataque3; // Si es la tercera posicion era la del ataque 3
        }
        return insultoAleatorio[elecInsultos]; // Devuelve el insulto aleatorio
    }

        public boolean replica(String contraAtaque){ // Este metodo va a devolver la respuesta correcta del insulto del pirata
            return contraAtaque.equals(defensar[correcto]);
    }


}

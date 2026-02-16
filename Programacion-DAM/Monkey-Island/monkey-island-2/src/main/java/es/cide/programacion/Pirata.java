package es.cide.programacion;

import java.util.Random;

public class Pirata extends Personatge implements Speak, Fight {

    // Atributos
    Random aleatorio = new Random();

    String[] respuestas = {
            "Con tu aliento, seguro que todos fueron asfixiados.", // 0
            "¿Es que TANTO me parezco a tu hermana?", // 1
            "La única forma en la que te conservarás será disecado.", // 2
            "Entonces se un buen perro ¡Siéntate! ¡Quieto!", // 3
            "Cuando acabe CONTIGO, serás un bistec con disentería.", // 4
            "Que pena que todas estén inventadas.", // 5
            "Así habría sido, pero siempre estabas de escapada." // 6
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

    String[] nomPirata = { // Creo los nombres de los piratas y los guardo en un array

            "Roronoa Roni",
            "Trafalgar Law",
            "Rocks D Xebec",
            "Gol D Roger",
            "Kaido",
            "Ben Beckman",
            "Van Augur"
    };

    String nombre;

    boolean vivo = true;
    int ataque1, ataque2, ataque3;
    int correcto;
    String[] insultoAleatorio = new String[3];
    String[] correctas = new String[3];
    String[] ataque = new String[3];
    String[] defensar = new String[3];

    // Constructor
    public Pirata(String nom) {
        super(nom, new Random().nextInt(3) + 1); // Pongo que la vida del pirata sera aleatorio de 3
        this.nombre = nomPirata[aleatorio.nextInt(nomPirata.length)]; // Le aplico a nombre los piratas aleatorios

        ataque1 = aleatorio.nextInt(insultos.length); // ataque1 va a tener un insulto aleatorio de el array de insultos
        ataque2 = aleatorio.nextInt(insultos.length); // ataque2 tendra otro insulto del array de insultos
        while (ataque1 == ataque2) { // si el ataque1 es igual al ataque2
            ataque2 = aleatorio.nextInt(insultos.length); // ataque2 se le aplicara otro insulto hasta que no sea igual
                                                          // que ataque1
        }

        ataque3 = aleatorio.nextInt(insultos.length); // ataque3 tendra un insulto aleatorio del array de los insultos
        while (ataque1 == ataque3 || ataque2 == ataque3) { // si ataque3 es igual al insulto del ataque1 o al ataque2,
                                                           // seguira aplicandose un insulto hasta que se diferente de
                                                           // estos
            ataque3 = aleatorio.nextInt(); // aqui se le aplica otro insulto y no saldra hasta que sea diferente
        }

        this.ataque[0] = insultos[ataque1]; // Guardamos el ataque1 en el array de ataque
        this.correctas[0] = respuestas[ataque1]; // Guardamos la respuesta correcta del ataque1 en correctas

        this.ataque[1] = insultos[ataque2]; // Guardamos el ataque2 en el array de ataque
        this.correctas[1] = respuestas[ataque2]; // Guardamos la respuesta correcta del ataque2 en correctas

        this.ataque[2] = insultos[ataque3]; // Guardamos el ataque3 en el array de ataque
        this.correctas[2] = insultos[ataque3]; // Guardamos la respuesta correcta del ataque3 en correctas
    }

    // Getters y Setters
    public String getNomPirata() { // Recogemos el nombre del pirata
        return nombre;
    }

    public int getVidaPirata() { // Recogemos la vida que tiene el pirata
        return vida;
    }

    @Override
    public void sayHello() { // Damos la bienvenida de batalla
        System.out.println("Preparate pringado");
    }

    @Override
    public void sayGoodBye() { // Nos despedimos del pirata
        System.out.println("Que verguenza.");
    }
    
    // Metodos

    @Override
    public boolean vida() {
        this.vida--; // Restara 1 cada vez que entre a este metodo, el cual entrara cuando el
                     // pirata pierda la discusion
        if (vida > 0) { // Si la vida del pirata no es 0 seguira vivo
        } else if (vida <= 0) { // Si la vida del pirata llega a 0 este pirata perdera
            vivo = false; // Al ponerlo en false significara que ya no tiene vida
        }
        return vivo; // Que nos devuelva si el pirata esta vivo o no
    }

    @Override
    public void insultar() { // Abrimos el metodo insultar

        int elecInsultos = aleatorio.nextInt(3); // Hacemos que coja tres insultos aleatorios

        System.out.println(ataque[elecInsultos]);

        if (ataque[elecInsultos] == insultos[ataque1]) {
            correcto = ataque1;
        } else if (ataque[elecInsultos] == insultos[ataque2]) {
            correcto = ataque2;
        } else if (ataque[elecInsultos] == insultos[ataque2]) {
            correcto = ataque3;
        }

    }

    public boolean replica(String contraAtaque) { // Este metodo va a devolver la respuesta correcta del insulto del
                                                  // pirata
        return contraAtaque.equals(defensar[correcto]);
    }

    @Override
    public void defensar() {
    }

}
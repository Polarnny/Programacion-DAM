package es.cide.programacion;

public class LeChuck extends Pirata {

    // Atributos
    String nom = "LeChuck"; // Este sera el nombre de este pirata
    String insultoPropio = "¿Quieres saber cuanto vale tu coche?"; // Este es el insulto propio que solo tendra este
                                                                   // pirata
    String respuestaPropia = "Antonio Lobato, no porfavor :("; // Esta sera la respuesta correcta al insulto de este
                                                               // pirata

    // Constructor
    public LeChuck(String nom) {
        super(nom); // Pongo que la vida del pirata sera aleatorio de 3
        this.vida = vida * 2; // Esta sera la vida de LeChuck, la cual sera el doble de la vida aleatoria que
                              // salga de pirata

        ataque1 = aleatorio.nextInt(insultos.length); // ataque1 va a tener un insulto aleatorio de el array de insultos
        ataque2 = aleatorio.nextInt(insultos.length); // ataque2 tendra otro insulto del array de insultos
        while (ataque1 == ataque2) { // si el ataque1 es igual al ataque2
            ataque2 = aleatorio.nextInt(insultos.length); // ataque2 se le aplicara otro insulto hasta que no sea igual
                                                          // que ataque1
        }

        ataque3 = aleatorio.nextInt(insultos.length); // ataque3 tendra un insulto aleatorio del array de los insultos
        while (ataque1 == ataque3 || ataque2 == ataque3) { // si ataque3 es igual al insulto del ataque1 o al ataque2,
                                                           // seguira aplicandose un insulto hasta que
            // se diferente de estos
            ataque3 = aleatorio.nextInt(); // aqui se le aplica otro insulto y no saldra hasta que sea diferente
        }

        this.ataque[0] = insultos[ataque1]; // Guardamos el ataque1 en el array de ataque
        this.correctas[0] = respuestas[ataque1]; // Guardamos la respuesta correcta del ataque1 en correctas

        this.ataque[1] = insultos[ataque2]; // Guardamos el ataque2 en el array de ataque
        this.correctas[1] = respuestas[ataque2]; // Guardamos la respuesta correcta del ataque2 en correctas

        this.ataque[2] = insultos[ataque3]; // Guardamos el ataque3 en el array de ataque
        this.correctas[2] = insultos[ataque3]; // Guardamos la respuesta correcta del ataque3 en correctas

        this.ataque[3] = insultoPropio; // Se guardara en la ultima posicion del array el insulto propio de este pirata
        this.correctas[3] = respuestaPropia; // Se guardara en la ultima posicion del array la respuesta correcta propia
                                             // de este pirata

    }

    // Getters y Setters

    // Metodos

    @Override
    public void sayHello() { // Damos la bienvenida de batalla
        System.out.println("¿Te crees mejor que yo?, lamentable..");
    }

    @Override
    public void sayGoodBye() { // Nos despedimos del pirata
        System.out.println("Das pena");
    }

}

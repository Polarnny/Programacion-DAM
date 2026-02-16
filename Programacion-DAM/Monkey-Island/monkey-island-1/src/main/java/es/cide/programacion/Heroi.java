package es.cide.programacion;

import java.util.Random;
import java.util.Scanner;

public class Heroi {

    // Atributos

    Scanner sc = new Scanner(System.in); // Creamos el escaner para imprimir por pantalla
    Random aleatorio = new Random(); // Creamos el random
    String nomHeroi;
    int vidaHeroi = 10; // Esta es la vida que tendra el heroe de base
    int seleccionar;
    boolean vida = true; // Este boleano indica esta vivo

    // Constructor

    public Heroi(String nomHeroi) {
        this.nomHeroi = nomHeroi;

    }

    // Getters y Setters

    public String getNomHeroi() { // Recogemos el nombre del heroe que ponga el usuario
        return this.nomHeroi;
    }

    public int getVida() { // Recogemos la vida del heroe que en este caso es 10
        return this.vidaHeroi;
    }

    // Metodos
    public int vidaHeroi() {
        this.vidaHeroi = vidaHeroi - 1; // Restara 1 cada vez que entre a este metodo, el cual entrara cuando el heroe
                                        // falle una respuesta
        if (vidaHeroi > 0) { // Si la vida que tiene no es 0 es que sigue vivo
            System.out.println("Sigues con vida");
        } 
        else if (vidaHeroi <= 0) { // Si la vida tiene 0 de vida habras muerto
            vida = false; // Al ponerlo en false significara que ya no tiene vida
        }
        return vidaHeroi;
    }

    String[] defensar = {

            "Con tu aliento, seguro que todos fueron asfixiados.", // 0
            "¿Es que TANTO me parezco a tu hermana?", // 1
            "La única forma en la que te conservarás será disecado.", // 2
            "Entonces se un buen perro ¡Siéntate! ¡Quieto!", // 3
            "Cuando acabe CONTIGO, serás un bistec con disentería.", // 4
            "Que pena que todas estén inventadas.", // 5
            "Así habría sido, pero siempre estabas de escapada." // 6

    };

    public String defensar() { // Se le mostrara cada uno de las frases del array con sus respectivos numero de
                               // linea
        System.out.println("1. " + defensar[0]);
        System.out.println("2. " + defensar[1]);
        System.out.println("3. " + defensar[2]);
        System.out.println("4. " + defensar[3]);
        System.out.println("5. " + defensar[4]);
        System.out.println("6. " + defensar[5]);
        System.out.println("7. " + defensar[6]);
        seleccionar = sc.nextInt(); // El usuario elige una de las opciones
        sc.nextLine();
        return defensar[seleccionar - 1]; // Hacemos que se reste uno a su respuesta ya que al usuario le hacemos del
                                          // 1-7 y el array va del 0-6
    }
}

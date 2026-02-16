package es.cide.programacion;

import java.util.Random;
import java.util.Scanner;

public class Heroi implements Speak, Fight {

    // Atributos

    Scanner sc = new Scanner(System.in); // Creamos el escaner para imprimir por pantalla
    Random aleatorio = new Random(); // Creamos el random
    String nomHeroi;
    int vida = 10; // Esta es la vida que tendra el heroe de base
    int seleccionar;
    String resultado;
    boolean vivo;

    // Constructor

    public Heroi(String nomHeroi, int vida, boolean vivo) {
        this.nomHeroi = nomHeroi;
        this.vida = vida;
        this.vivo = true;
    }

    // Getters y Setters

    public String getNomHeroi() { // Recogemos el nombre del heroe que ponga el usuario
        return this.nomHeroi;
    }

    public int getVida() { // Recogemos la vida del heroe que en este caso es 10
        return this.vida;
    }

    public void sayHello() { // Damos la bienvenida de batalla
        System.out.println("?: ¡Buena suerte!");
    }

    public void sayGoodBye() { // Nos despedimos del pirata
        System.out.println("?: ¡Marvellous!");
    }

    public String getResultado() {
        return resultado;
    }

    public void insultar() {

    }

    // Metodos
    public boolean vida() {
        this.vida = vida - 1; // Restara 1 cada vez que entre a este metodo, el cual entrara cuando el heroe
                              // falle una respuesta
        if (vida > 0) { // Si la vida que tiene no es 0 es que sigue vivo
            System.out.println("Sigues con " + vida + " de vida");
            vivo = true;
        } else if (vida <= 0) { // Si la vida tiene 0 de vida habras muerto
            vivo = false; // Al ponerlo en false significara que ya no tiene vida
        }
        return this.vivo;
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

    @Override
    public void defensar() { // Este metodo servira para mostrar las respuestas que va a tener el heroe
        int i = 0;
        while (i < 7) { // Se saldra del bucle cuando la i sea 7
            System.out.println((i + 1) + ". " + defensar[i]); // La i va a ir sumando por lo que imprimira por pantalla
                                                              // el numero de ronda y la respuesta del array
            i++; // Ira sumando por ronda
        }
        seleccionar = sc.nextInt(); // El usuario elige una de las opciones
        sc.nextLine();
        resultado = defensar[seleccionar - 1]; // Hacemos que se reste uno a su respuesta ya que al usuario le hacemos
                                               // del 1-7 y el array va del 0-6
    }
}

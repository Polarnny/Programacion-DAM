package es.cide.programacion;

import java.util.Random;

public class Guybrush extends Heroi {
    // Atributos
    Random aleatorio = new Random();

    // Constructor
    public Guybrush() { // Inicializamos las variables que utilizaremos en
                                                               // el main
        super("Guybrush", 10, true); // Iniciamos las variables de la clase padre
    }

    // Getters y Setters
    public String getNomHeroi() { // Recogemos el nombre del heroe que ponga el usuario
        return "Guybrush";
    }

    public int getVida() { // Recogemos la vida del heroe que en este caso es 10
        return this.vida;
    }

    @Override
    public void sayHello() { // Damos la bienvenida de batalla
        System.out.println("Guybrush: ¿Otro mas? ¡Te voy a poner a dormir!");
    }

    @Override
    public void sayGoodBye() { // Nos despedimos del pirata
        System.out.println("Guybrush: Despues de todo estaba claro quien estaria en pie.");
    }

    // Metodos
    @Override
    public boolean vida() {
        this.vida = vida - 2; // Restara 2 cada vez que entre a este metodo, el cual entrara cuando el heroe
                              // falle una respuesta
        if (vida > 0) { // Si la vida que tiene no es 0 es que sigue vivo
            System.out.println("Sigues con " + vida + " de vida");
            vivo = true;
        } else if (vida <= 0) { // Si la vida tiene 0 de vida habras muerto
            vivo = false; // Al ponerlo en false significara que ya no tiene vida
        }
        return this.vivo; // Devuelve la vida de Guybrush
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
    public void defensar() { // Se vera cada uno de las frases del array con sus respectivos numero de linea
        int i = 0;
        while (i < 3) {
            int numAl = aleatorio.nextInt(defensar.length);
            System.out.println((i + 1) + ". " + defensar[numAl]);
            i++;
        }
        seleccionar = sc.nextInt(); // El usuario elige una de las opciones
        sc.nextLine();
        resultado = defensar[seleccionar - 1]; // Hacemos que se reste uno a su respuesta ya que al usuario le hacemos
                                               // del 1-3 y el array va del 0-2
    }
}

package es.cide.programacion;

public class Elaine extends Heroi {
    // Atributos

    // Constructor
    public Elaine() { // Inicializamos las variables que utilizaremos en el
                                                             // main
        super("Elaine", 10, true); // Inicializamos las variables que viene de la clase padre
    }

    // Getters y Setters
    public String getNomHeroi() { // Recogemos el nombre del pirata
        return "Elaine";
    }

    public int getVida() { // Recogemos la vida de Elaine
        return this.vida;
    }

    @Override
    public void sayHello() { // Damos la bienvenida de batalla
        System.out.println("Elaine: Encantado, mi nombre es Elaine, espero que tengamos una batalla justa.");
    }

    @Override
    public void sayGoodBye() { // Nos despedimos del pirata
        System.out.println("Elaine: Ha sido una batalla esplendida, ¡ha sido todo un placer!");
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
        return this.vivo; // Devuelve la vida de Elaine
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

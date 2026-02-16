// Nom: Xisco Cardona O'fferrall
// DNI: 45699020K

package programacion.cide.es;

import java.util.Random;

public class Botifarro extends Torrada implements Graella, Menjar {

    // Atributos
    Random aleatorio = new Random(); // Para hacer metodos aleatorios
    boolean coent = true;
    boolean estaHecho = true;
    boolean siQuema = true;

    // Constructor
    public Botifarro(String festivitat, String any, boolean coent) { // Inicializamos los atributos que va a utilizar esta
                                                                 // clase
        super(festivitat, any); // Traemos los atributos del padre al hijo
        this.coent = coent;
    }

    // Getters y Setters
    public boolean getCoent() { // Recogeremos la informacion de coent
        return coent;
    }

    public void setCoent(boolean coent) { // Para iniciar de nuevo y aplicarle un valor a coent
        this.coent = coent;
    }

    // Metodos

    public boolean coent(){ // Hacemos este metodo para saber si pica o no
        int siono = aleatorio.nextInt(2); // Sera si o no por lo que hacemos un random de 2
        if (siono == 1) { // Si es 1 pondremos que no pica
            return coent = false;
        }
        else { // En el caso contrario pondremos que si
            return coent;
        }
    }

    @Override // Lo ponemos para sobreescribir lo que habia anteriormente en la interface
    public boolean estaFet() { // Abrimos el metodo boolean para saber si esta hecho o no
        int siEsta = aleatorio.nextInt(10) + 1; // Creamos una variable int para ponerle un numero del 1 - 10
        if (siEsta <= 7) { // Si dicho numero es 7 o menor, dira que no esta hecho
            return estaHecho = false;
        } else { // En el caso contrario pondra que si esta hecho y devolvera true
            return true;
        }
    }

    @Override // Sobreescribimos lo que habia en la interface
    public boolean crema() { // Hacemos este metodo para saber si quema o no mediante un random
        int quema = aleatorio.nextInt(2) + 1; // Como es 50/50 basta con ponerle a la nueva variable un numero que sea 1
                                              // o 2
        if (quema == 1) { // Si es 1 pondremos que no quema
            return siQuema = false;
        } else { // En el caso contrario pondremos que si devolviendo true
            return true;
        }
    }

    // Ponemos las interfaces que tenemos que poner ya que estaban en la
    // implementacion y como no queremos modificarlas las dejamos en blanco
    public void posarCarnAGraella() {
    }

    public void llevarCarnDeGraella() {
    }

    public void assaborir() {
    }

}

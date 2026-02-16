// Nom: Xisco Cardona O'fferrall
// DNI: 45699020K

package programacion.cide.es;

import java.util.Random;

public class Sobrassada extends Torrada implements Graella, Menjar {

    // Atributos
    Random aleatorio = new Random(); // Para hacer los metodos aleatorios
    boolean estaHecho = true;
    boolean siQuema = true;

    // Constructor
    public Sobrassada(String festivitat, String any) { // Iniciamos las variables en el constructor
        super(festivitat, any); // En este caso solo iniciamos las del padre utilizando super
    }

    // Getters y Setters

    // Metodos

    @Override // Ponemos override para indicar que sobreescribimos lo que habia en la
              // interface
    public boolean estaFet() { // Hacemos este metodo para saber si esta hecho o no
        int siEsta = aleatorio.nextInt(2) + 1; // Hacemos una variable y le aplicamos 1 o 2 para decidirlo
        if (siEsta == 1) { // Si sale 1 diremos que no esta hecho
            return estaHecho = false;
        } else { // En el caso contrario si estara hecho y devolvera true
            return true;
        }
    }

    @Override // Indicamos que sobreescribimos lo de interface
    public boolean crema() { // Abrimos este metodo para saber si quema o no
        int quema = aleatorio.nextInt(2) + 1; // Le ponemos solo 2 ya que al ser 50/50 es practicamente si o no
        if (quema == 1) { // Si sale 1 pondremos que no quema
            return siQuema = false;
        } else { // En el caso contrario pondremos que si quema y saldra true
            return true;
        }
    }

    // Ponemos las interfaces que no utilizaremos para que no de error la
    // implementacion pero los dejaremos vacios
    public void posarCarnAGraella() {
    }

    public void llevarCarnDeGraella() {
    }

    public void assaborir() {
    }

}

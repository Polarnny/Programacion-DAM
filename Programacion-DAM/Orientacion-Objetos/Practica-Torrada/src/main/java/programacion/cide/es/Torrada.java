// Nom: Xisco Cardona O'fferrall
// DNI: 45699020K

package programacion.cide.es;

public class Torrada {
    
    // Atributos
    String festivitat;
    String any;

    // Constructor
    public Torrada (String festivitat, String any){ // Inicializamos el constructor padre que tambien utilizaremos en los hijos
        this.festivitat = festivitat;
        this.any = any;
    }

    // Getters y Setters
    public String getFestivitat() { // Para recoger la festivitat
        return festivitat;
    }

    public String getAny() { // Para recoger el año
        return any;
    }

    public void setFestivitat(String festivitat) { // Para iniciar de nuevo y aplicarle un valor a festivitat
        this.festivitat = festivitat;
    }

    public void setAny(String any) { // Para iniciar de nuevo y aplicarle un valor a año
        this.any = any;
    }

    // Metodos


}

package Bote;

/**
 * Esta clase representa al bote que se puede colocar en las celdas de agua.
 * Este tiene un nombre y una vida que nos indicara cuando ya no es factible pescar.
 * @author Marco Munguia <@markomannder>
 */
public class Bote {

    private String nombreBote;
    private int vidaBote;
    /**
     * Crea el bote que se colocara en la celda de pesca
     * @param nombreBote nombre que se le dara al bote pesquero
     * @param vidaBote vida que tendra el bore, esta se reinicia cuando se saca de la celda.
     */
    public Bote(String nombreBote, int vidaBote) {
        this.nombreBote = nombreBote;
        this.vidaBote = vidaBote;
    }

    public String getNombreBote() {
        return nombreBote;
    }

    public void setNombreBote(String nombreBote) {
        this.nombreBote = nombreBote;
    }

    public int getVidaBote() {
        return vidaBote;
    }

    public void setVidaBote(int vidaBote) {
        this.vidaBote = vidaBote;
    }

}

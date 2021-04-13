package Celdas;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Representa los botones que usaremos como celda en la generacion del terreno
 *
 * @author Marco Munguia <@markomannder>
 */
public class CeldaJButton extends JButton {

    private int numeroFila;
    private int numeroColumna;
    private String tipoCelda;
    private Icon icon;

    /**
     * Crea el boton que se usara como celda con los parametros
     *
     * @param numeroFila la posicion en y del boton
     * @param numeroColumna la posicion en x del boton
     * @param tipoCelda el tipo de celda que se le asignara
     * @param icon la imagen que se le asignara al boton
     */
    public CeldaJButton(int numeroFila, int numeroColumna, String tipoCelda, Icon icon) {
        super(icon);
        this.numeroFila = numeroFila;
        this.numeroColumna = numeroColumna;
        this.tipoCelda = tipoCelda;
    }

    public int getNumeroFila() {
        return numeroFila;
    }

    public void setNumeroFila(int numeroFila) {
        this.numeroFila = numeroFila;
    }

    public int getNumeroColumna() {
        return numeroColumna;
    }

    public void setNumeroColumna(int numeroColumna) {
        this.numeroColumna = numeroColumna;
    }

    public String getTipoCelda() {
        return tipoCelda;
    }

    public void setTipoCelda(String tipoCelda) {
        this.tipoCelda = tipoCelda;
    }

    @Override
    public Icon getIcon() {
        return icon;
    }

    @Override
    public void setIcon(Icon icon) {
        this.icon = icon;
    }

}

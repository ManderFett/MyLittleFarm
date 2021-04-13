package Componentes;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 * Clase parametrica que repreesenta el hilo de vida de un objeto esta es hoja
 * de Thread.
 *
 * @author Marco Munguia <@markomannder>
 */
public class Vida<T> extends Thread {

    private T objeto;
    private JLabel vidaObjetojLabel;
    private int vidaObjeto;
    private int vidaRestar;

    /**
     * Crea el hilo de vida del objeto que se le mande como parametro
     *
     * @param objeto el objeto que se le asignara el hilo
     * @param vidaObjetojLabel JLabel donde pondra los puntos de vida
     * @param vidaObjeto vida del objeto
     * @param vidaRestar vida que se le restara al objeto
     */
    public Vida(T objeto, JLabel vidaObjetojLabel, int vidaObjeto, int vidaRestar) {
        this.objeto = objeto;
        this.vidaObjetojLabel = vidaObjetojLabel;
        this.vidaObjeto = vidaObjeto;
        this.vidaRestar = vidaRestar;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public JLabel getVidaObjetojLabel() {
        return vidaObjetojLabel;
    }

    public void setVidaObjetojLabel(JLabel vidaObjetojLabel) {
        this.vidaObjetojLabel = vidaObjetojLabel;
    }

    public int getVidaObjeto() {
        return vidaObjeto;
    }

    public void setVidaObjeto(int vidaObjeto) {
        this.vidaObjeto = vidaObjeto;
    }

    public int getVidaRestar() {
        return vidaRestar;
    }

    public void setVidaRestar(int vidaRestar) {
        this.vidaRestar = vidaRestar;
    }

    @Override
    public void run() {
        while ((vidaObjeto <= 100) && (vidaObjeto > 0)) {
            try {
                Vida.sleep(20000);
                vidaObjeto -= vidaRestar;
                vidaObjetojLabel.setText(Integer.toString(vidaObjeto));
                setVidaObjeto(vidaObjeto);
            } catch (InterruptedException ex) {
                Logger.getLogger(Vida.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}

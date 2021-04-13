package Componentes;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class Vida<T> extends Thread {

    private T objeto;
    private JLabel vidaObjetojLabel;
    private int vidaObjeto;
    private int vidaRestar;

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
                System.out.println(vidaObjeto);
            } catch (InterruptedException ex) {
                Logger.getLogger(Vida.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}

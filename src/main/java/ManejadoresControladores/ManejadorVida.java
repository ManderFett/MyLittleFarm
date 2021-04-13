package ManejadoresControladores;

import Componentes.Vida;
import javax.swing.JLabel;

/**
 * Se encarga de comunicar al JFrame con el metodo que crea el hilo de la vida
 * de los objetos
 *
 * @author Marco Munguia <@markomannder>
 */
public class ManejadorVida {

    private JLabel JLabel;
    private Object objeto;
    private int vidaObjeto;
    private int vidaAQuitar;

    /**
     * Crea la comunicacion entre el JFrame y el hilo con parametros
     *
     * @param JLabel JLabel que mostrara la vida
     * @param objeto tipo de objeto al que se le iniciara el hilo de vida
     * @param vidaObjeto vida inicial del objeto
     * @param vidaAQuitar vida que le quitara respecto al tiempo al objeto
     */
    public ManejadorVida(JLabel JLabel, Object objeto, int vidaObjeto, int vidaAQuitar) {
        this.JLabel = JLabel;
        this.objeto = objeto;
        this.vidaObjeto = vidaObjeto;
        this.vidaAQuitar = vidaAQuitar;
        quitarVida();
    }

    public void quitarVida() {
        Vida hiloDeVida = new Vida(objeto, JLabel, vidaObjeto, vidaAQuitar);
        hiloDeVida.start();
    }
}

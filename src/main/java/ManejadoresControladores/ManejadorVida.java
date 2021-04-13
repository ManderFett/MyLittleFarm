package ManejadoresControladores;

import Componentes.Vida;
import Jugador.Granjero;
import javax.swing.JLabel;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class ManejadorVida {

    private JLabel JLabel;
    private Object objeto;
    private int vidaObjeto;
    private int vidaAQuitar;

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

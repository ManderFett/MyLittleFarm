package Siembra;

import javax.swing.JLabel;

/**
 * Clase Zanahoria que hereda los atributos de Semilla e implementa los metodos
 * de la interface SemillaInterface
 *
 * @author Marco Munguia <@markomannder>
 */
public class Zanahoria extends Semilla implements SemillaInterface {

    public Zanahoria(int vidaSemilla, int tiempoCosecha, String nombreSemilla) {
        super(vidaSemilla, tiempoCosecha, nombreSemilla);
    }

    @Override
    public void vidaSemilla() {

    }

    @Override
    public void planatarSemilla() {
    }

    @Override
    public void quitarSemilla() {
    }

    @Override
    public void alimentarSemilla() {
    }

}

package Siembra;

/**
 * Clase Maiz que hereda los atributos de Semilla e implementa los metodos de la
 * interface SemillaInterface
 *
 * @author Marco Munguia <@markomannder>
 */
public class Maiz extends Semilla implements SemillaInterface {

    public Maiz(int vidaSemilla, int tiempoCosecha, String nombreSemilla) {
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

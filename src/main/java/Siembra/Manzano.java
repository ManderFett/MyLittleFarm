package Siembra;

/**
 * Clase Manzano que hereda los atributos de Semilla e implementa los metodos de la
 * interface SemillaInterface
 *
 * @author Marco Munguia <@markomannder>
 */
public class Manzano extends Semilla implements SemillaInterface {

    public Manzano(int vidaSemilla, int tiempoCosecha, String nombreSemilla) {
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

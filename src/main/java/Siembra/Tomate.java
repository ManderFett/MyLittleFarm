package Siembra;

/**
 * Clase Tomate que hereda los atributos de Semilla e implementa los metodos de
 * la interface SemillaInterface
 *
 * @author Marco Munguia <@markomannder>
 */
public class Tomate extends Semilla implements SemillaInterface {

    public Tomate(int vidaSemilla, int tiempoCosecha, String nombreSemilla) {
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

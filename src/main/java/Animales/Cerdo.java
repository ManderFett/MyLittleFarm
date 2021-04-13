package Animales;

/**
 * Clase hija de Animal que implementa los metodos de AnimalInterface, esta
 * representa al Cerdo
 *
 * @author Marco Munguia <@markomannder>
 */
public class Cerdo extends Animal implements AnimalInterface {

    public Cerdo(int vidaAnimal, int tiempoDeCrianza, String nombreAnimal) {
        super(vidaAnimal, tiempoDeCrianza, nombreAnimal);
    }

    @Override
    public void vidaAnimal() {
    }

    @Override
    public void obtenerRecursosAnimal() {
    }

    @Override
    public void alimentarAnimal() {
    }

}

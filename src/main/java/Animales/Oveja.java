package Animales;

/**
 * Clase hija de Animal que implementa los metodos de la interface
 * esta clase representa a la Oveja
 * @author Marco Munguia <@markomannder>
 */
public class Oveja extends Animal implements AnimalInterface {

    public Oveja(int vidaAnimal, int tiempoDeCrianza, String nombreAnimal) {
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

package Animales;

/**
 * Clase hija de Animal en la que implementamos los metodos de la Interface
 * esta clase representa a una Gallina
 * @author Marco Munguia <@markomannder>
 */
public class Gallina extends Animal implements AnimalInterface {

    public Gallina(int vidaAnimal, int tiempoDeCrianza, String nombreAnimal) {
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

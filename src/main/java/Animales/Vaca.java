package Animales;

/**
 * Clase hoja de animal que representa a Vaca
 * @author Marco Munguia <@markomannder>
 */
public class Vaca extends Animal implements AnimalInterface {

    public Vaca(int vidaAnimal, int tiempoDeCrianza, String nombreAnimal) {
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

package Animales;

/**
 * Interface de Animal la cual obtiene los metodos que implementaran las clases
 * hijas de animal pero no se indican como se desarrollaran
 *
 * @author Marco Munguia <@markomannder>
 */
public interface AnimalInterface {

    public abstract void vidaAnimal();

    public abstract void obtenerRecursosAnimal();

    public abstract void alimentarAnimal();
}
